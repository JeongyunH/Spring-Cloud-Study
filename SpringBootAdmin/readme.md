## Spring Boot Admin Study

### 구성
- server-photoapp
- spring-api-gateway(API Gateway)
- eureka
- spring-admin

* photo app
- implementation ("de.codecentric:spring-boot-admin-starter-client:2.4.0")

* Spring Boot Admin
- implementation ("de.codecentric:spring-boot-admin-starter-server:2.4.0")
- implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client") 얘 또한 유레카 관리대상으로 넣기위해
- 등록 방법
1. admin server와 연동할 admin client 추가
2. eureka client 등록을 통한 자동연동
