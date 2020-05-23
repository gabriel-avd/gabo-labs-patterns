package com.gabo.labs.behavioral.Observer;

public class Main {

    public static void main(String[] args) {
        Producto aguacate = new Producto(10);

        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        aguacate.addObserver(usuario1, usuario2);


        aguacate.venta();
    }
}
