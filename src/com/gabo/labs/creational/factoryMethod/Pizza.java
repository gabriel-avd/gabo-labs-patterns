package com.gabo.labs.creational.factoryMethod;

public class Pizza {
    private int rebanadas;
    private String especialidad;

    public Pizza(int rebanadas, String especialidad) {
        this.rebanadas = rebanadas;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Cantidad Rebanadas: " + rebanadas + " Especialidad: " + especialidad;
    }
}

