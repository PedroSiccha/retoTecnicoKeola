/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import reactor.core.publisher.Flux;

/**
 *
 * @author Pedro
 */
public interface ReactiveService {
    Flux<String> getData();
}
