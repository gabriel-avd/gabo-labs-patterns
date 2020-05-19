package com.gabo.labs.creational.abstractFactory;

public class AppleStore implements AbstractFactory {
    @Override
    public Computadora crearComputadora() {
        return new MacBookPro();
    }

    @Override
    public Tablet crearTablet() {
        return new Ipad();
    }
}
