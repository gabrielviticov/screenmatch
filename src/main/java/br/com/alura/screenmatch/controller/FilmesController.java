package br.com.alura.screenmatch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.screenmatch.dto.FilmeDTO;
import br.com.alura.screenmatch.model.Filme;

@Controller
@RequestMapping("/filmes")
public class FilmesController {
    
    private List<Filme> list = new ArrayList<>();

    @GetMapping
    public String home() {
        return "/filmes/form";
    }

    /** 
     * A APLICAÇÃO COM SPRING BOOT IRÁ ANALISAR SE A PÁGINA A SER CARREGADA TEM O MÉTODO "GET" OU "POST". 
     * SE ELA TIVER O MÉTODO GET -> CARREGARÁ A ROTINA COM A ANOTAÇÃO "GETMAPPING". 
     * SE ELA TIVER O MÉTODO POST -> CARREGARÁ A ROTINA COM A ANOTAÇÃO "POSTMAPPING".
     * NO FORMULÁRIO APRESENTADO FOI DEFINIDO O MÉTODO DE ENVIO "POST" (POIS É O PADRÃO PARA FORMULÁRIOS HTML), LOGO, 
     * A ANOTAÇÃO "POSTMAPPING" SERÁ CARREGADA!
     */

    @PostMapping
    public String form(FilmeDTO dto) {
        var filme = new Filme(dto);
        list.add(filme);
        System.out.println(list);
        return "/filmes/form";
    }
}
