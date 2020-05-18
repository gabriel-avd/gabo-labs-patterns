package com.gabo.labs.solid.dependencyInversion;

public class MouseImpl implements Mouse{
    @Override
    public void conectar() {
        System.out.println("Mouse conectado");
    }
}
