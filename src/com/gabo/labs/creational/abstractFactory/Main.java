package com.gabo.labs.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore();

        Computadora macPro = appleStore.crearComputadora();
        Tablet ipad = appleStore.crearTablet();
    }
}
