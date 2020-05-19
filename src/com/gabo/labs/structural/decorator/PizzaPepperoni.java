package com.gabo.labs.structural.decorator;

public class PizzaPepperoni implements Pizza {
    @Override
    public String descripcion() {
        return "Pizza Pepperoni";
    }

    @Override
    public float precio() {
        return 8;
    }
}
