package com.ejercicios.Ejercicio6.service;

import com.ejercicios.Ejercicio6.model.Prediccion;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PrediccionServiceImpl implements PrediccionService {
    private final Faker faker;

    public PrediccionServiceImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public List<Prediccion> getPrediccionSemanal() {
        List<Prediccion> lista = new ArrayList<>();
        LocalDate hoy = LocalDate.now();

        for (int i = 0; i < 7; i++) {
            Prediccion p = new Prediccion();
            p.setFecha(hoy.plusDays(i));
            p.setProbPrecipitacion(faker.number().numberBetween(0, 101));
            p.setTempMin(faker.number().numberBetween(0, 11));
            p.setTempMax(faker.number().numberBetween(10, 21));
            p.setNivelUV(faker.number().numberBetween(0, 6));
            lista.add(p);
        }
        return lista;
    }
}