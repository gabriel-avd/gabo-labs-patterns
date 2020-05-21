package com.gabo.labs.behavioral.chainResponsability;

public interface ManejadorTransacciones {
    void setNextManejador(ManejadorTransacciones next);

    void ejecutarTransaccion(Transaccion transaccion);
}
