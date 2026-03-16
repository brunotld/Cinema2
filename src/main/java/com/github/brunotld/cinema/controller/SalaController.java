package com.github.brunotld.cinema.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salas")
public class SalaController {

    @GetMapping
    public String listarSalas() {
        return "Salas disponíveis: Sala Vip (3D), Sala Comum (IMAX), Sala Premium (VIP)";
    }

}

