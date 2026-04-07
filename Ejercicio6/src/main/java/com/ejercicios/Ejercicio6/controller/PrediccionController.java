package com.ejercicios.Ejercicio6.controller;

import com.ejercicios.Ejercicio6.service.PrediccionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrediccionController {
    private final PrediccionService prediccionService;

    public PrediccionController(PrediccionService prediccionService) {
        this.prediccionService = prediccionService;
    }

    @GetMapping("/prediccion")
    public String verPrediccion(Model model) {
        model.addAttribute("semana", prediccionService.getPrediccionSemanal());
        return "prediccion";
    }
}
