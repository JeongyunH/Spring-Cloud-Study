## Spring Cloud Gateway Study

### 구성
- server-photoapp
- spring-api-gateway(API Gateway)

* Spring Cloud Gateway
- implementation("org.springframework.cloud:spring-cloud-starter-gateway")
- Api GW를 통해 server app 요청 전달
- 시간에 따른 연결 처리(지정된 시간 After, Before 접근 가능하도록)
- 요청 헤더가 같은 경우에만 통과(Header 매칭, 특정 value, 키)