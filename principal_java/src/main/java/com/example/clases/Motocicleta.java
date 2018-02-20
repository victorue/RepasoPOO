package com.example.clases;

/**
 * Created by Victor Ruelas on 20/02/2018.
 */

public class Motocicleta extends Carro {

    boolean casco;
    int cantGasolina;

    public Motocicleta(){
        super("Generica");
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    public int getCantGasolina() {
        return cantGasolina;
    }

    public void setCantGasolina(int cantGasolina) {
        this.cantGasolina = cantGasolina;
    }

    @Override
    public void datosVehiculo(){
        super.datosVehiculo();
        System.out.println("Casco" +""+ isCasco()
                            +"Gas:"
                            + getCantGasolina());
    }

    public Motocicleta(String nombre){
        super(nombre);

    }
}
