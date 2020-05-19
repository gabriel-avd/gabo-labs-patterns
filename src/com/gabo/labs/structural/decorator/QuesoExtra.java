package com.gabo.labs.structural.decorator;

public class QuesoExtra implements Pizza {

    Pizza pizza;

    public QuesoExtra(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String descripcion() {
        return pizza.descripcion() + " queso extra";
    }

    @Override
    public float precio() {
        return pizza.precio() + 2;
    }
}
