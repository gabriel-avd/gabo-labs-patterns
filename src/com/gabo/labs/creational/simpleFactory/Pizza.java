package com.gabo.labs.creational.simpleFactory;

public class Pizza {
    private int rebanadas;

    public Pizza(int rebanadas) {
        this.rebanadas = rebanadas;
    }

    @Override
    public String toString() {
        return "Cantidad Rebanadas: " + rebanadas;
    }
}
