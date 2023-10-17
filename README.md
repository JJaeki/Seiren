<div align="center">

# 🎙&nbsp; Seiren
사용자가 자신의 <b>목소리를 등록</b>하고, 텍스트를 입력하면<br/> 해당 텍스트가 <b>사용자의 목소리로 변환되어 출력</b>되는 <U>AI 기반 음성 서비스</U> <br/>  

<img src="/uploads/b0d820abc89c226c41d3803a36fe3bf6/MainPage.gif">
</div>


## 목차

1. [개요](#개요)
2. [서비스 화면](#서비스-화면)
3. [기술 소개](#기술-소개)
4. [개발 환경](#개발-환경)
5. [설계 문서](#설계-문서)
6. [팀원 소개](#팀원-소개)


## 1. 개요
> <b>프로젝트 기간</b> : 2023/08/21 ~ 2023/10/06 <br>
> <b>참고자료 </b> : 🎞 [UCC](https://www.youtube.com/watch?v=2VDcku13lkk)
📃 [최종발표 PPT](https://drive.google.com/file/d/1iTcuW2Ohn8m3WWf5kYmd6j4i9W_lP2A0/view?usp=sharing)
<br>

## 2. 서비스 화면
1️ <b>메인 페이지 & 어바웃 페이지</b>

|<img src="/uploads/fc870d20ec0b9eb15af9a4a4357f25db/Main.gif">|<img src="/uploads/84b0aa201aa1476bf57b0e45284e2697/Login.gif">|
| :------: | :------: |
| **Main Page** | **Login Page** |
|<img src="/uploads/f4411ae105f3956f5b05429426e957b3/about1.gif">|<img src="/uploads/5f6bac0d52f7cc62d1c8484e90bc2195/about2.gif">|
| **About Page** | **About Page** |
<br>
2️⃣ <b>스토어 페이지</b>

|<img src="/uploads/f0773c885f0ce947b33cc3d1fcb46fc5/store1.gif">|<img src="/uploads/347e47be073141d8423b9493b0acff12/store2.gif">|
| :------: | :------: |
| **Store Page** | **Filter** |
|<img src="/uploads/c841aa6f12bf2f5d0f7715e21d88f89c/store3.gif">|<img src="/uploads/a773aafe1f0b95800823fd4c90a09960/store4.gif">|
| **Product Detail** | **Product Test** |
|<img src="/uploads/3cf0fe7efa929e6b71701206ff5f201a/store5.gif">||
| **Purchase Page** ||
<br>
3️⃣ <b>레코드 페이지</b>

|<img src="/uploads/859437d5eae82873b88a48d927862818/novoice.gif">|<img src="/uploads/3c99df66796c6c0cbb775b2e394e5b18/Record.gif">|
| :------: | :------: |
| **No Voice** | **Record Page** |
|<img src="/uploads/ec21511dd6834c82f446919adfcdcb71/Record_3_.gif">|<img src="/uploads/dea2f06ce9f944f9e2ff4bcc9db57a4c/Record_4_.gif">|
| **Voice Studying Page** | **Voice Finish Page** |
|<img src="/uploads/0ae836df524a155fb4d6b95c26ee455f/Record_5_.gif">||
| **Product Custom Page** ||

<br>
3️⃣ <b>마이 페이지</b>

|<img src="/uploads/c2a0f26fc27688da96d352629e3d3eda/myProfile_1_.gif">|<img src="/uploads/617651b2810508539ddd939648e842fc/myProfile_2_.gif">|
| :------: | :------: |
| **Profile Page** | **My Voice Detail** |
|<img src="/uploads/ba7f379b9911bdef6735666d4ce60492/my_SellList_1_.gif">|<img src="/uploads/1d6bb2185eb42eaa48210a2f87166ff8/my_SellList_2_.gif">|
| **SellList Page** | **Sell Detail** |
|<img src="/uploads/ba7f379b9911bdef6735666d4ce60492/my_SellList_1_.gif">||
| **BuyList Page** ||
|<img src="/uploads/b9271c3ec2943b264009c7c62e79f29b/my_Use_1_.gif">|<img src="/uploads/f29bc3308956cd43cefccfeef91e631d/my_Use_2_.gif">|
| **UseList Page** | **VoiceUse Detail** |

<br>

## 3. 기술 소개
- ##### 1. AI-VOICE 생성
  
  - ###### 자신의 목소리 여러가지 등록 가능
  - ###### 다발적 AI-Voice 학습 가능
  - ###### 적은 량의 데이터로도 양질의 Voice 모델


- ##### 2. Store 기능
  
  - ###### 생성된 AI-Voice 모델 (글자단위) 판매 및 구매 가능
  - ###### 타인의 AI-Voice 모델 구매 가능 (글자단위)
  - ###### 생성한 TTS 다운로드 및 바로듣기 가능

- ##### 3. 역동적 디자인
  
  - ###### GSAP을 이용한 애니메이션 추가
<br>

## 4. 개발 환경
### ⚙ Management Tool
- 형상 관리 : Gitlab
- 이슈 관리 : Jira
- 커뮤니케이션 : Mattermost, Notion, Discord
- 디자인 : Figma, PowerPoint

### 💻 IDE
- Visual Studio Code `1.83.0`
- IntelliJ `11.0.19`

### 📱 Frontend
- @date-io/date-fns@2.17.0
- @emotion/react@11.11.1
- @emotion/styled@11.11.0
- @lottiefiles/react-lottie-player@3.5.3
- @mui/material@5.14.11
- @mui/styled-engine-sc@5.14.11
- @types/axios@0.14.0
- @types/node@20.8.2
- @types/react-dom@18.2.8
- @types/react@18.2.24
- @typescript-eslint/eslint-plugin@6.7.4
- @typescript-eslint/parser@6.7.4
- @vitejs/plugin-react-swc@3.4.0
- @vitejs/plugin-react@4.1.0
- audiobuffer-to-wav@1.0.0
- aws-sdk@2.1468.0
- axios@0.21.4
- date-fns@2.30.0
- esbuild@0.18.20 invalid: "^0.19.4" from the root project
- eslint-config-prettier@9.0.0
- eslint-import-resolver-typescript@3.6.1
- eslint-plugin-import@2.28.1
- eslint-plugin-prettier@5.0.0
- eslint-plugin-react-hooks@4.6.0
- eslint-plugin-react-refresh@0.4.3
- eslint-plugin-react@7.33.2
- eslint@8.50.0
- extendable-media-recorder-wav-encoder@7.0.98
- extendable-media-recorder@9.1.2
- framer-motion@10.16.4
- gsap@3.12.2
- lottie-react@2.4.0
- prettier@3.0.3
- react-calendar@4.6.0
- react-datepicker@4.18.0
- react-dom@18.2.0
- react-icons@4.11.0
- UNMET DEPENDENCY react-player@^2.13.0
- react-router-dom@6.16.0
- react-scroll@1.8.9
- react-slick@0.29.0
- react-youtube@10.1.0
- react@18.2.0
- recharts@2.8.0
- recoil@0.7.7
- rollup@3.29.4
- slick-carousel@1.8.1
- standardized-audio-context@25.3.57
- styled-components@5.3.11
- terser@5.21.0
- typescript@5.2.2
- vite-tsconfig-paths@4.2.1
└── vite@4.4.9

### 💾 Backend
  - jpa
  - redis
  - security
  - jdbc
  - oauth2
  - lombok
  - h2
  - mysql
  - swagger
  - jwt
  - s3

### AI

  - Cython
  - librosa==0.8.0
  - matplotlib
  - numpy
  - scipy
  - tensorboard
  - unidecode
  - pyopenjtalk
  - jamo
  - pypinyin
  - jieba
  - protobuf
  - cn2an
  - inflect
  - eng_to_ipa
  - ko_pron
  - indic_transliteration
  - num_thai
  - opencc
  - ipython
  - gradio


### Infra

- AWS S3
- AWS EC2
- Nginx 1.18.0
- Docker 20.10.12
- Jenkins
- Redis
- Ubuntu 20.04.6 LTS
- Spring Boot

<br>

## 5. 설계 문서


### ○ 요구사항 명세서
![요구사항1](/uploads/5c0aa80cb0c8b670dbc58a037d30bc65/요구사항1.PNG)
![요구사항2](/uploads/d7e9378964d26778819a16b861f28ead/요구사항2.PNG)
![요구사항3](/uploads/7e7984f26ea96c88f006b16d71460a04/요구사항3.PNG)
![요구사항4](/uploads/8185508f29ab6fc22519d21029ab1fcf/요구사항4.PNG)



### ○ API 명세서
- <b>Swagger</b>
![swagger1](/uploads/3f045ec71e257cc681a7f2a5302b229a/swagger1.png)
![swagger3](/uploads/e9631c629b514ce3b6efdaddda31049c/swagger3.png)
![swagger4](/uploads/ad16306dd0926e33c12a114112e0626c/swagger4.png)
![swagger2](/uploads/7daef0f1eb4e277d05aa15cae49a8e2c/swagger2.png)

- <b>API 명세서</b>
![01._회원인증](/uploads/88f7ac346d7c3227430c6772af3d68ec/01._회원인증.PNG)
![02._마이페이지_회원정보](/uploads/14afb6bf5b4cd0c000637698dfb35f64/02._마이페이지_회원정보.PNG)
![03._마이페이지_구매_내역](/uploads/e90b527f8faef22bbb6f95a2718af433/03._마이페이지_구매_내역.PNG)
![04._마이페이지_내가_만든_목소리](/uploads/d328779dc00e19fc8c2eda74ae626c25/04._마이페이지_내가_만든_목소리.PNG)
![05._마이페이지_판매관리](/uploads/f69b238a52e6ac622f862be827b5b259/05._마이페이지_판매관리.PNG)
![06._마이페이지_구매한_목소리_BOX](/uploads/c337650a95a425bbc6e29c096ec64d10/06._마이페이지_구매한_목소리_BOX.PNG)
![07._내_목소리_생성](/uploads/2e0ef7047fcc14418aff15f4c94401a6/07._내_목소리_생성.PNG)
![08._Voice_Shop](/uploads/d70bf9856ddc4e6b82721fd580b8cc01/08._Voice_Shop.PNG)
![09._결제](/uploads/2169e73da8b5758b177f459a8eca5dc7/09._결제.PNG)
![10._찜](/uploads/502835d876cd4564cf55b450baa8c9b2/10._찜.PNG)
![11._알림](/uploads/72435eaf9a4d7c81765c53acb8b7b31a/11._알림.PNG)
![12._카테고리](/uploads/c1399d49b711b03be3244eb3b17c6356/12._카테고리.PNG)
![13.대본](/uploads/ccf5c0bb9b76d26006ddd2a0c7e14ccd/13.대본.PNG)
![14._구매목적](/uploads/dbd77baafb487ce714f01284161ebf81/14._구매목적.PNG)


### ○ ERD 및 시스템 아키텍쳐
|<img src="/uploads/efab5be1d9c1978c56821e5de9e71d59/ERD.png"/>|![아키택쳐](/uploads/dacd894a5eec8ea8b4d5d1bf55788ac0/아키택쳐.png)|
|:------:|:--:|
|ERD|시스템 아키텍쳐|


## 6. 팀원 소개

| **[성제현](https://github.com/protofu)**                                                          | **[정소정](https://github.com/sojeong025)**                                                           | **[최진석](https://github.com/choiapple)**                                                               | **[구배성](https://github.com/deerKBS)**                                                               | **[황재영](https://github.com/JJaeki)**                                                              | **라동엽**                                                             |
|:---:|:---:|:---:|:---:|:---:|:---:|
| <img title="" src="/uploads/ae66cf5c3a1b0cfd159d6035dc1f5524/SJH.png" alt=""> | <img title="" src="/uploads/3fc78fc8638acc7c10f2020b1bafebaf/JSJ.png" alt="" > | <img title="" src="/uploads/aff04cba1009b64aa036b167c033b0cc/CJS.png" alt="" > | <img title="" src="/uploads/1d9490cf7bf23efd3e0886878d01ec7c/KBS.png" alt="" > | <img title="" src="/uploads/66541ff290a9a539a3d87e82943fd568/HJY.png" alt=""> | <img title="" src="/uploads/7741e56d270cd1f471b93ca2b02ff0ff/RDY.png" width="400" alt=""> |
|Frontend|Frontend|FullStack|FullStack & CI/CD|Backend|AI|

#### 👥 역할 분담

- **성제현** : UX/UI 설계 / 마이페이지 제작 및 api / 문서화 작업 / 빌드 및 오류 수정

- **정소정** : UX/UI 설계 / PPT 및 영상 제작 / 발표 / 디자인 총괄 / Record 및 상품 관리

- **최진석** : API 제작 / front api 연결 / 오류 수정 / DB 설계

- **구배성**: API 제작 / CI/CD 담당 / 영상 제작 / Front 배포 오류 수정

- **황재영** : API 제작 / 검색 기능 제작 / DB 관리

- **라동엽** : Flask 서버 구축 / AI 학습 모델 생성 
