package com.gabo.labs.structural.adapter;

public class Main {

    /*
        ADAPTER
            -Permite modificar la funcionalidad de una aplicacion sin necesidad de modificar el codigo que actualmente
            lo manda llamar.
     */

    public static void main(String[] args) {
        AdapterDB conexion = new AdapterDB(new ConexionMongoDB());


        conexion.conexion();

        String resultado = conexion.runQuery();
        System.out.println(resultado);
    }
}
