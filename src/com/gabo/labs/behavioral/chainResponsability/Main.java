package com.gabo.labs.behavioral.chainResponsability;

public class Main {
    /*
        CHAIN_RESPONSIBILITY
            -Permite ejecutar metodos de objetos y en caso de que el metodo no sea valido, enviarlo a otro objeto para
            su ejecucion
     */
    public static void main(String[] args) {
        Transaccion transaccion = new Transaccion(100,200,TipoTransaccion.CHEQUES);

        ManejadorTransacciones deposito = new Deposito();
        ManejadorTransacciones retiro = new Retiro();
        ManejadorTransacciones reembolso = new Reembolso();

        deposito.setNextManejador(retiro);
        retiro.setNextManejador(reembolso);

        deposito.ejecutarTransaccion(transaccion);
    }
}
