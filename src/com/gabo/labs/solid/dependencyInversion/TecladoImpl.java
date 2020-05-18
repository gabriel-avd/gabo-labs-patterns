package com.gabo.labs.solid.dependencyInversion;

public class TecladoImpl implements Teclado {
    @Override
    public void conectar() {
        System.out.println("Teclado conectado");
    }
}
