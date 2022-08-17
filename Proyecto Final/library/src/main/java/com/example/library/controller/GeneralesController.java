package com.example.library.controller;

//import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.Libreria;

@RestController
@RequestMapping({"generales"})

public class GeneralesController {
    private  Libreria libreria;

    public GeneralesController() 
    {
        libreria = new Libreria();
        libreria.setNombre("Libreria");
        libreria.setDireccion("Calle falsa 123");
        libreria.setTelefono("123456789");
        libreria.setHorario("Lunes a Viernes de 9 a 18hs");
    
    }

    @GetMapping({"/"})
    public Libreria info() 
    {
        return libreria;
    }

    @GetMapping({"/direccion"})
    public String direcion() 
    {
        return libreria.getDireccion();
    }
}
