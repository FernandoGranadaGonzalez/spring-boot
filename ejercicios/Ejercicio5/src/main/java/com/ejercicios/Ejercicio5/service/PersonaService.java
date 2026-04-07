package com.ejercicios.Ejercicio5.service;

import com.ejercicios.Ejercicio5.model.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> find(int count);
    Persona findOne();
}