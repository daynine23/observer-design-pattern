package com.usil;

public class Ogro implements Observer{
    private String nombre;
    private String armadura;
    private int vida;
    private int fuerza;

    public Ogro(String nombre, String armadura, int vida, int fuerza) {
        this.nombre = nombre;
        this.armadura = armadura;
        this.vida = vida;
        this.fuerza = fuerza;
    }

    @Override
    public void update(String clima) {
        System.out.println("se notifico el clima al ogro");
    }

    @Override
    public void updateStatus(String clima) {
        if(clima.equals("VERANO")){
            System.out.println("VOY A COMER");
        }else if (clima.equals("INVIERNO")){
            System.out.println("VOY A BAÑARME EN EL PANTANO");
        }else if (clima.equals("PRIMAVERA")){
            System.out.println("SIGO DURMIENDO");
        }else if(clima.equals("OTOÑO")){
            System.out.println("VOY A CAZAR");
        }
    }
}
