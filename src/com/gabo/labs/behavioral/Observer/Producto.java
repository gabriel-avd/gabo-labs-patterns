package com.gabo.labs.behavioral.Observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class Producto implements Observable {
    private int stock;
    private Set<Observer> observadores;

    public Producto(int stock) {
        this.setStock(stock);
        this.observadores = new LinkedHashSet<>();
    }

    public void venta() {
        this.setStock(this.getStock() - 1);
        System.out.println("Producto vendido");
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void addObserver(Observer... observers) {
        for (Observer o : observers)
            observadores.add(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observador : this.observadores) {
            observador.notificacion("Usuario notificado");
        }
    }

    @Override
    public void removerObserver() {

    }
}
