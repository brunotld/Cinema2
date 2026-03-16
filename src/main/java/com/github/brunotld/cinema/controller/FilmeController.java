package com.github.brunotld.cinema.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping

public class FilmeController {

    @GetMapping("/filmes")
    public String listarFilmes() {
        return "Filmes em cartaz: Panico 7, coringa , Vingadores";
    }

    @GetMapping("/destaque")
    public String filmeDestaque() {
        return "Filme destaque da semana: Avatar 2";
    }

}