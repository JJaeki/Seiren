package ssafy.e105.Seiren.domain.product.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ssafy.e105.Seiren.domain.product.service.StatisticsService;
import ssafy.e105.Seiren.global.utils.ApiResult;
import ssafy.e105.Seiren.global.utils.ApiUtils;

@RestController
@RequiredArgsConstructor
@Tag(name = "마이페이지 통계 API")
public class StatisticsController {

    private final StatisticsService statisticsService;

    @Operation(summary = "전체 통계_찜 수")
    @GetMapping("api/wish/count")
    public ApiResult<?> totalWishCount(HttpServletRequest request) {
        return ApiUtils.success(statisticsService.countWish(request));
    }

    @Operation(summary = "상품_통계 리스트")
    @GetMapping("api/statistics/products")
    public ApiResult<?> getAllProductStatistics(HttpServletRequest request) {
        return ApiUtils.success(statisticsService.getAllProductStatisticsList(request));
    }

    @Operation(summary = "상품_통계 리스트 상세")
    @GetMapping("api/statistics/{productId}")
    public ApiResult<?> getStatisticsDetail(HttpServletRequest request,
            @PathVariable Long productId) {
        return ApiUtils.success(statisticsService.getStatisticsDetail(request, productId));
    }

    @Operation(summary = "전체 통계_한 달 단위 일자 별 수익 리스트")
    @GetMapping("api/statistics/month")
    public ApiResult<?> getStatisticsAboutMonth(HttpServletRequest request,
            @RequestParam int month) {
        Map<LocalDate, Double> monthlyStatistics = statisticsService.getStatistics(request, month);
        return ApiUtils.success(monthlyStatistics);
    }
}
