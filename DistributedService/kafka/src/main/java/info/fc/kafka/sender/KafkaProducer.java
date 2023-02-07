package info.fc.kafka.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    public static final String TOPIC_NAME = "topictest";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String topic, Object data) {
        try {
            kafkaTemplate.send(topic, JacksonConverter.toJson(data));
        } catch (Exception e) {
            System.err.println("error" +  e.getMessage());
        }
    }
}
