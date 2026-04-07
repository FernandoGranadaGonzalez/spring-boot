package com.ejercicios.Ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class SystemOutMessageService implements MessageService {

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}