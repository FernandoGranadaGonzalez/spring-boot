package com.ejercicios.Ejercicio4;

import com.ejercicios.Ejercicio4.MessageService;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ProcesoB implements CommandLineRunner {
    private final MessageService messageService;
    private final Faker faker;

    public ProcesoB(MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    @Override
    public void run(String[] args) {
        // No me funciona la cita de bigBangTheory, no se ha establecido en la clase Faker
        // String frase = faker.bigBangTheory().quote();
        // messageService.showMessage(this.getClass().getName() + " - " + frase);
    }
}