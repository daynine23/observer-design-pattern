package com.usil;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notificarObservers();
}
