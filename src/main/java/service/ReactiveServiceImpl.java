/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

/**
 *
 * @author Pedro
 */
@Service
public class ReactiveServiceImpl implements ReactiveService {

    @Override
    public Flux<String> getData() {
        return Flux.just("Dato 1", "Dato 2", "Dato 3")
                .delayElements(java.time.Duration.ofSeconds(1));
    }
}
