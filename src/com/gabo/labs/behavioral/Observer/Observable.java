package com.gabo.labs.behavioral.Observer;

public interface Observable {
    void addObserver(Observer... observers);

    void notificarObservadores();

    void removerObserver();
}

