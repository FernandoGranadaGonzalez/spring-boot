package com.ejercicios.Ejercicio5.service;

import com.ejercicios.Ejercicio5.model.Persona;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    private final Faker faker;

    public PersonaServiceImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public Persona findOne() {
        Persona p = new Persona();
        p.setNombre(faker.name().firstName());
        p.setApellidos(faker.name().lastName());
        p.setDni(faker.idNumber().valid());

        LocalDate fechaAleatoria = faker.timeAndDate().birthday();

        p.setFechaNacimiento(fechaAleatoria);
        return p;
    }

    @Override
    public List<Persona> find(int count) {
        List<Persona> personas = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            personas.add(findOne());
        }
        return personas;
    }
}