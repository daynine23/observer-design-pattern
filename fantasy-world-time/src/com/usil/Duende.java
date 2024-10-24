package com.usil;

public class Duende implements Observer{
    private String nombre;
    private String habilidad;
    private int estamina;


    public Duende(String nombre, String habilidad, int estamina) {
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.estamina = estamina;
    }


    @Override
    public void update(String clima) {
        System.out.println("se notifico el clima al duende");
    }

    @Override
    public void updateStatus(String clima) {
        if(clima.equals("VERANO")){
            System.out.println("MOMENTO DE SALIR A DISFRUTRAR DEL PAISAJE");
        }else if (clima.equals("INVIERNO")){
            System.out.println("HORA DE DORMIR");
        }else if (clima.equals("PRIMAVERA")){
            System.out.println("DUENDE HACE MAGIA");
        }else if(clima.equals("OTOÑO")){
            System.out.println(" DEBO TRABAJAR");
        }
    }
}
