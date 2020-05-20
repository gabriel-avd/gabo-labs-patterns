package com.gabo.labs.structural.proxy;

public class ServicioImpl implements Servicio{
    @Override
    public void leer() {
        System.out.println("Leer");
    }

    @Override
    public void escribir() {
        System.out.println("Escribir");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar");
    }
}
