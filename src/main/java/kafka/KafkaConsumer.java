/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author Pedro
 */
@Component
public class KafkaConsumer {
    @KafkaListener(topics = "my-topic")
    public void consume(String message) {
        // Lógica de procesamiento del mensaje Kafka
    }
}
