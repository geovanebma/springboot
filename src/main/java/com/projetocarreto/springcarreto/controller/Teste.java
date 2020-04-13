package com.projetocarreto.springcarreto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Teste {
    @GetMapping(value="/")
    public String getMethodName() {
        return "Funcionando corretamente.";
    }
}