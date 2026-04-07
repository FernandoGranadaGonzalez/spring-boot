package com.ejercicios.Ejercicio4;

import com.ejercicios.Ejercicio4.MessageService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ProcesoC implements CommandLineRunner {
    private final MessageService messageService;
    private final Faker faker;

    public ProcesoC(@Qualifier("systemErrMessageService") MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    @Override
    public void run(String[] args) {
        String frase = faker.gameOfThrones().quote();
        messageService.showMessage(this.getClass().getName() + " - " + frase);
    }
}