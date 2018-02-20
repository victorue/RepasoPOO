package com.example.clases;

/**
 * Created by Victor Ruelas on 19/02/2018.
 */

public class Carro {

    int modelo;
    public static String color;
    public String nombre;

    public Carro(String nombre){
        this.nombre=nombre;
    }

    public void datosVehiculo(){
        int y=90;
        System.out.println(modelo +  " "  +  color  +  " " + nombre );
        System.out.println("Corre a: " +  y  + " " + "km");
    }
    public void setModelo(int m)
    {
        this.modelo = m;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
}
