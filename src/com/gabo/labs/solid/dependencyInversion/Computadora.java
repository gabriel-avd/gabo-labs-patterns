package com.gabo.labs.solid.dependencyInversion;

public class Computadora {
    private Mouse mouse;
    private Teclado teclado;

    public Computadora(Mouse mouse, Teclado teclado) {
        this.setMouse(mouse);
        this.setTeclado(teclado);
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Computadora setMouse(Mouse mouse) {
        this.mouse = mouse;
        return this;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Computadora setTeclado(Teclado teclado) {
        this.teclado = teclado;
        return this;
    }

    public void encender() {
        this.teclado.conectar();
        this.mouse.conectar();
        System.out.println("Computadora encendida");
    }
}
