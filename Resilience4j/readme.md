## Resilience4j Study

### 구성
- resilience4j (client..)
- resilience4j-server
- docker로 prometheus, Grafana 설치 (모니터링 Dashboard 툴)

###### Resilience4j (burkhead 패턴)
- implementation("org.springframework.cloud:spring-cloud-starter-circuitbreaker-resilience4j")
- burkhead 패턴을 메소드 호출 방식으로 구현 & 트래픽 제어 확인
- 트래픽 생성 툴 - Apache Bench 이용
- resilience4j server에 등록해서 트래픽이 유발됐을 때, permit할지 reject 조절

###### Resilience4j (circuit breaker 패턴)
- implementation("io.micrometer:micrometer-registry-prometheus")
- open/half open/close 상태를 가짐
- Spring boot 스타일로 제어 (메소드 호출 방식도 있음..)
- property로 실패 비율, 최소요청 횟수 등 정의
- (지표) circuitBreaker가 가진 상태를 grafana, prometheus 모니터링 툴로 확인