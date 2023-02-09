## Sleuth, Zipkin, MDC Study

### 구성
- photoapp
- api-gw(API Gateway)
- sleuth
- zipkin 다운로드 & jar 실행

###### sleuth
- sleuth를 사용하기 위한 간단 예제....
- implementation("org.springframework.cloud:spring-cloud-starter-sleuth")
- implementation("org.springframework.cloud:spring-cloud-sleuth-zipkin")
- .yml 파일에 sleuth, zipkin 설정 추가

###### photo app
- MDC 로깅을 위해선 MDC 로그 필터 추가
- sleuth, zipkin을 이용하기 위해선..
- implementation("org.springframework.cloud:spring-cloud-starter-sleuth")
- implementation("org.springframework.cloud:spring-cloud-sleuth-zipkin")
- .yml 파일에 sleuth, zipkin 설정 추가

###### api gw
- implementation("org.springframework.cloud:spring-cloud-starter-sleuth")
- implementation("org.springframework.cloud:spring-cloud-sleuth-zipkin")
- .yml 파일에 sleuth, zipkin 설정 추가

