package com.gabo.labs.structural.decorator;

public class OrillaRellena implements Pizza {
    Pizza pizza;

    public OrillaRellena(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String descripcion() {
        return pizza.descripcion() + " orilla rellena";
    }

    @Override
    public float precio() {
        return pizza.precio() + 4;
    }
}
