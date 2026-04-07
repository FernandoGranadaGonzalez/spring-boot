package com.ejercicios.Ejercicio1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class ProcesoC implements CommandLineRunner {
    @Override
    public void run(String[] args) throws Exception {
        System.out.println("Ejecutando: " + this.getClass().getName());
    }
}