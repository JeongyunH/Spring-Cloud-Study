## Distributed Service Study

### 구성
- rabbitmq
- kafka
- Wsl 2 설치
- Docker 설치
- rabbitmq 설치
- kafka 설치

###### RabbitMQ
- implementation("org.springframework.boot:spring-boot-starter-amqp")
- 쓰기 요청 분산 처리
- AMQP 프로토콜 이용, 메세지 broker

###### Kafka
- implementation("org.springframework.kafka:spring-kafka:2.6.7")
- 쓰기 요청 분산 처리
- tcp/ip로 이벤트가 수신시 파일로 저장