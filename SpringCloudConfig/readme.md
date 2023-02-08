## Spring Cloud Config Study

### 구성
- spring-config
- spring-config-client
- spring-vault
- Vault 다운로드 및 실행 & set VAULT_ADDR...

* Spring Config (Server)
- implementation("org.springframework.cloud:spring-cloud-config-server")
- @EnableConfigServer

* Spring Config Client
- implementation("org.springframework.cloud:spring-cloud-config-client")
- POST로 요청 보내면 갱신 됨($.../actuator/refresh)

* Vault(암호화)
- implementation("org.springframework.cloud:spring-cloud-starter-vault-config")
- vault에 property와 pw를 주입해서 다른 설정들이 노출되지 않게..
- vault 실행 후,
- vault kv put secret/.....