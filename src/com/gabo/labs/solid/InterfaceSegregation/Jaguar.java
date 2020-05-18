package com.gabo.labs.solid.InterfaceSegregation;

public class Jaguar implements FelinoSalvaje {
    @Override
    public void rugir() {
        System.out.println("El jaguar ruge");
    }

    @Override
    public void cazar() {
        System.out.println("El jaguar caza");
    }
}
