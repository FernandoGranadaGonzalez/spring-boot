package com.ejercicios.Ejercicio5.controller;

import com.ejercicios.Ejercicio5.service.PersonaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/personas")
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    public String listado(Model model) {
        model.addAttribute("personas", personaService.find(10));
        return "listado";
    }

    @GetMapping("/una")
    public String unaPersona(Model model) {
        model.addAttribute("persona", personaService.findOne());
        return "detalle";
    }
}