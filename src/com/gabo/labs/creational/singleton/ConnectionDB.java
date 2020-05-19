package com.gabo.labs.creational.singleton;

public class ConnectionDB {

    /*
        SINGLETON
            -Patron para crear solo una instancia de un objeto
            -Facil de implementar, no tan facil de validar todos sus escenarios
                -Constructor privado
                -Variable statica de instancia local
                -Metodo statico para obtener la instancia
     */

    private static ConnectionDB connectionDB;

    private ConnectionDB() {
    }

    public static synchronized ConnectionDB obtenerConnection() {
        if (connectionDB == null) {
            return new ConnectionDB();
        }

        return connectionDB;
    }
}
