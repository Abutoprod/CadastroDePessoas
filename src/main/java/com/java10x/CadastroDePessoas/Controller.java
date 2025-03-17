package com.java10x.CadastroDePessoas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas") // definindo rota
    public  String boasVindas(){
        return "Essa é minha primeira msg nessa rota";
    }
}
