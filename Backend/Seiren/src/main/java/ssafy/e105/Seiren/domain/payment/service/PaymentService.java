package ssafy.e105.Seiren.domain.payment.service;

import static ssafy.e105.Seiren.domain.payment.exception.PurposeErrorCode.NOT_EXIST_PURPOSE;
import static ssafy.e105.Seiren.domain.product.exception.ProductErrorCode.NOT_EXIST_PRODUCT;
import static ssafy.e105.Seiren.domain.user.exception.UserErrorCode.NOT_EXIST_USER;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.transaction.Transactional;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ssafy.e105.Seiren.domain.payment.dto.PurchaseDto;
import ssafy.e105.Seiren.domain.product.entity.Product;
import ssafy.e105.Seiren.domain.product.entity.Wish;
import ssafy.e105.Seiren.domain.product.repository.ProductRepository;
import ssafy.e105.Seiren.domain.transaction.entity.Purpose;
import ssafy.e105.Seiren.domain.transaction.entity.Transaction;
import ssafy.e105.Seiren.domain.transaction.entity.TransactionDescription;
import ssafy.e105.Seiren.domain.transaction.repository.PurposeRepository;
import ssafy.e105.Seiren.domain.transaction.repository.TransactionDescriptionRepository;
import ssafy.e105.Seiren.domain.transaction.repository.TransactionRepository;
import ssafy.e105.Seiren.domain.user.entity.User;
import ssafy.e105.Seiren.domain.user.repository.UserRepository;
import ssafy.e105.Seiren.global.error.type.BaseException;
import ssafy.e105.Seiren.global.jwt.JwtTokenProvider;
import ssafy.e105.Seiren.global.utils.ApiError;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final ProductRepository productRepository;
    private final TransactionRepository transactionRepository;
    private final TransactionDescriptionRepository transactionDescriptionRepository;
    private final PurposeRepository purposeRepository;
    private final JwtTokenProvider jwtTokenProvider;
    private final UserRepository userRepository;

    @Transactional
    public void purchaseProduct(HttpServletRequest request, PurchaseDto purchaseDto) {
        Product product = getProduct(purchaseDto.getProductId());
        User seller = getSeller(product.getVoice().getUser().getId());
        User buyer = getUser(request);
        Purpose purpose = getPurpose(purchaseDto.getPurposeId());
        Transaction transaction = getTransaction(purchaseDto, seller);
        if (transaction != null) {
            transaction.update(transaction, purchaseDto);
            transactionDescriptionRepository.save(
                    TransactionDescription.toEntity(purchaseDto, transaction, purpose, product));
        }
        Transaction new_transaction = transactionRepository.save(
                Transaction.toEntity(product, seller, buyer, purchaseDto));
        transactionDescriptionRepository.save(
                TransactionDescription.toEntity(purchaseDto, new_transaction, purpose,
                        product));
    }

    private Purpose getPurpose(Long purposeId) {
        return purposeRepository.findById(purposeId).orElseThrow(() -> new BaseException(
                new ApiError(NOT_EXIST_PURPOSE.getMessage(), NOT_EXIST_PURPOSE.getCode())));
    }

    private User getSeller(Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new BaseException(
                new ApiError(NOT_EXIST_USER.getMessage(), NOT_EXIST_USER.getCode())));
    }

    public User getUser(HttpServletRequest request) {
        String userEmail = jwtTokenProvider.getUserEmail(jwtTokenProvider.resolveToken(request));
        return userRepository.findByEmail(userEmail).orElseThrow(() -> new BaseException(
                new ApiError(NOT_EXIST_USER.getMessage(), NOT_EXIST_USER.getCode())));
    }

    public Product getProduct(Long productId) {
        return productRepository.findById(productId).orElseThrow(() -> new BaseException(
                new ApiError(NOT_EXIST_PRODUCT.getMessage(), NOT_EXIST_PRODUCT.getCode())));
    }

    public Transaction getTransaction(PurchaseDto purchaseDto, User seller) {
        Optional<Transaction> transactionOptional = Optional.ofNullable(
                transactionRepository.findTransactionByProduct_ProductIdAndSeller_Id(
                        purchaseDto.getProductId(), seller.getId()));
        // Transaction를 찾았을 경우에 대한 처리
        if (transactionOptional.isPresent()) {
            return transactionOptional.get();
        }
        return null;
    }
}
