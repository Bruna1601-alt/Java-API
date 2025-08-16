package org.example.estudoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carros")
public class CarroController {
    @GetMapping
    public Carros getCarro() {
        Carros carro = new Carros();
        carro.setId(1);
        carro.setModelo("Fusca");
        carro.setMarca("Volkswagen");
        carro.setAno(1972);
        return carro;
    }
}
