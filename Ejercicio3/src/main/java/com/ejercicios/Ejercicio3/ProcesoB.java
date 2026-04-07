package com.ejercicios.Ejercicio3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.core.annotation.Order;

@Component
@Order(2)
public class ProcesoB implements CommandLineRunner {

    private final MessageService messageService;

    public ProcesoB(@Qualifier("systemErrMessageService") MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String[] args) throws Exception {
        messageService.showMessage("Ejecutando con MessageService: " + this.getClass().getName());
    }
}