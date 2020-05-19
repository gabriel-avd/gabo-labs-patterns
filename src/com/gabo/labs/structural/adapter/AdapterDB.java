package com.gabo.labs.structural.adapter;

public class AdapterDB implements ConexionSQL {

    ConexionNoSQL conexionNoSQL;

    public AdapterDB(ConexionNoSQL conexionNoSQL) {
        this.conexionNoSQL = conexionNoSQL;
    }

    @Override
    public void conexion() {
        conexionNoSQL.conexion();
    }

    @Override
    public String runQuery() {
        return conexionNoSQL.executeSentence();
    }
}
