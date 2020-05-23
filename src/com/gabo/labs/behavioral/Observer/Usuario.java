package com.gabo.labs.behavioral.Observer;

public class Usuario implements Observer {
    public void notificacion(String mensaje) {
        System.out.println(mensaje);
    }

}
