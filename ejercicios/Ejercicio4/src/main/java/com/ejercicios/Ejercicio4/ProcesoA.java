package com.ejercicios.Ejercicio4;

import com.ejercicios.Ejercicio4.MessageService;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ProcesoA implements CommandLineRunner {
    private final MessageService messageService;
    private final Faker faker;

    public ProcesoA(MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    @Override
    public void run(String[] args) {
        String frase = faker.backToTheFuture().quote();
        messageService.showMessage(this.getClass().getName() + " - " + frase);
    }
}