/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import kafka.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import repository.EventRepository;

/**
 *
 * @author Pedro
 */
@Service
public class EventProcessor {
    @Autowired
    private KafkaConsumer kafkaConsumer;
    @Autowired
    private EventRepository eventRepository;

    public void processEvents() {
        String message = kafkaConsumer.consume();
        eventRepository.saveProcessedEvent(event);
    }
}
