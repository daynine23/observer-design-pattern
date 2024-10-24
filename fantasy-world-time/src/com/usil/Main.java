package com.usil;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Clima clima = new Clima();

        Duende d1 = new Duende("Frodo", "Magia", 50);
        Ogro o1 = new Ogro("Axe", "100",5000,500);

        clima.addObserver(d1);
        clima.addObserver(o1);

        clima.definirClima("VERANO");
    }
}
