package com.gabo.labs.creational.builder;

public class Main {
    public static void main(String[] args) {
        Usuario codi = Usuario.make("Gabriel", "Valdes")
                .setMedioContacto(true)
                .setDireccion("Benito Juarez 242")
                .setEmail("gabo@lab.com")
                .setTelefono("664466")
                .setMetodoPago("paypal")
                .setToken("XXXDDDSSS")
                .build();

        System.out.println(codi);
    }
}
