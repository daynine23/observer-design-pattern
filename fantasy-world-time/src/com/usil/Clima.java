package com.usil;

import java.util.ArrayList;
import java.util.List;

public class Clima implements Subject{
    private List<Observer> observadoresList;
    private String climaActual;

    public Clima(){
        this.observadoresList = new ArrayList<Observer>();
    }

    public void definirClima(String nuevoClima){
        this.climaActual = nuevoClima;
        notificarObservers();
    }


    @Override
    public void addObserver(Observer o) {
        observadoresList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observadoresList.remove(o);
    }

    @Override
    public void notificarObservers() {
        for (Observer o : observadoresList){
            o.update(climaActual);
            o.updateStatus(climaActual);
        }
    }
}
