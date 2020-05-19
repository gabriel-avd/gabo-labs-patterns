package com.gabo.labs.structural.adapter;

public class ConexionMySQL implements ConexionSQL {
    @Override
    public void conexion() {
        System.out.println("Conexion con MySQL");
    }

    @Override
    public String runQuery() {
        return "Consulta MySQL";
    }
}
