package com.ejercicios.Ejercicio3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SystemErrMessageService implements MessageService {

    @Override
    public void showMessage(String message) {
        System.err.println(message);
    }
}