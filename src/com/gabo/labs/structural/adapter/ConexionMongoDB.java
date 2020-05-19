package com.gabo.labs.structural.adapter;

public class ConexionMongoDB implements ConexionNoSQL {
    @Override
    public void conexion() {
        System.out.println("Conexion con MongoDB");
    }

    @Override
    public String executeSentence() {
        return "Consulta MongoDB";
    }
}
