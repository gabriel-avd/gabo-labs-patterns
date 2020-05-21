package com.gabo.labs.behavioral.chainResponsability;

public class Retiro implements ManejadorTransacciones{
    private ManejadorTransacciones next;

    @Override
    public void setNextManejador(ManejadorTransacciones next) {
        this.next = next;
    }

    @Override
    public void ejecutarTransaccion(Transaccion transaccion) {
        if(transaccion.getTipoTransaccion() == TipoTransaccion.RETIRO){
            float resultado = transaccion.getCantidad() - transaccion.getBalance();
            System.out.println("El nuevo balance despues del retiro es "+resultado);
        } else {
            this.next.ejecutarTransaccion(transaccion);
        }

    }
}
