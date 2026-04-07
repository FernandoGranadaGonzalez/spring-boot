package com.ejercicios.Ejercicio3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.core.annotation.Order;

@Component
@Order(1)
public class ProcesoA implements CommandLineRunner {

    private final MessageService messageService;

    public ProcesoA(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String[] args) throws Exception {
        messageService.showMessage("Ejecutando con MessageService: " + this.getClass().getName());
    }
}