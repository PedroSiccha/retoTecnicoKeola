/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.retotecnico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import service.ReactiveService;

/**
 *
 * @author Pedro
 */
@RestController
@RequestMapping("/api")
public class ReactiveController {
    @Autowired
    private ReactiveService reactiveService;

    @GetMapping("/reactive")
    public Flux<String> getReactiveData() {
        return reactiveService.getData();
    }
}
