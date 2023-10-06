package com.example.crudbasico.controllers;

import com.example.crudbasico.models.Persona;
import com.example.crudbasico.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    private PersonaRepository personaRepository;
    @GetMapping("api/persona")
    public List<Persona> mostrar(){
        return personaRepository.findAll();
    }
}
