package com.ejercicios.Ejercicio2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.core.annotation.Order;

@Component
@Order(3)
public class ProcesoC implements CommandLineRunner {

    private final MessageService messageService;

    public ProcesoC(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String[] args) throws Exception {
        messageService.showMessage("Ejecutando con MessageService: " + this.getClass().getName());
    }
}