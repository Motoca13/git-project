package com.vvmotax.git.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping(path = "/testes/status")
    public String teste(){
        return "alo";
    }
}
