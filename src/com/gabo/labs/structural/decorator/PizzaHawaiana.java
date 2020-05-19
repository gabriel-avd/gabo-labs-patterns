package com.gabo.labs.structural.decorator;

public class PizzaHawaiana implements Pizza {
    @Override
    public String descripcion() {
        return "Pizza Hawaiana";
    }

    @Override
    public float precio() {
        return 8;
    }
}
