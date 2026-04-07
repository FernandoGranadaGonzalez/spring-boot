package com.ejercicios.Ejercicio6.model;

import java.time.LocalDate;

public class Prediccion {
    private LocalDate fecha;
    private int probPrecipitacion;
    private int tempMin;
    private int tempMax;
    private int nivelUV;

    public Prediccion() {
    }

    public Prediccion(LocalDate fecha, int probPrecipitacion, int tempMin, int tempMax, int nivelUV) {
        this.fecha = fecha;
        this.probPrecipitacion = probPrecipitacion;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.nivelUV = nivelUV;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }

    public int getProbPrecipitacion() {
        return probPrecipitacion;
    }

    public void setProbPrecipitacion(int probPrecipitacion){
        this.probPrecipitacion = probPrecipitacion;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin){
        this.tempMin = tempMin;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax){
        this.tempMax = tempMax;
    }

    public int getNivelUV() {
        return nivelUV;
    }

    public void setNivelUV(int nivelUV){
        this.nivelUV = nivelUV;
    }

    public String getImagenUrl() {
        if (probPrecipitacion < 25) return "https://www.aemet.es/imagenes/png/estado_cielo/11_g.png";
        if (probPrecipitacion < 50) return "https://www.aemet.es/imagenes/png/estado_cielo/12_g.png";
        if (probPrecipitacion < 75) return "https://www.aemet.es/imagenes/png/estado_cielo/14_g.png";
        return "https://www.aemet.es/imagenes/png/estado_cielo/25_g.png";
    }
}