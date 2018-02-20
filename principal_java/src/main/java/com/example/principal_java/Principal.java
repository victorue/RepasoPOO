package com.example.principal_java;

import com.example.clases.Carro;
import com.example.clases.Motocicleta;
import com.sun.org.apache.xpath.internal.SourceTree;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Este es un Programa de prueba");
        Carro cnuevo = new Carro("Mazda");
        cnuevo.setColor("BLANCO");
        cnuevo.setModelo(2000);
        cnuevo.datosVehiculo();
        System.out.println("-----------------------");
        Carro cUsado = new Carro("Nissan");
        cUsado.setModelo(1998);
        cUsado.setColor("GRIS");
        Carro.color="TINTO";
        cUsado.datosVehiculo();
        System.out.println("-----------------------");
        cnuevo.datosVehiculo();
        System.out.println("-----------");
        Motocicleta moto = new Motocicleta("ITALIKA");
        moto.setModelo(3000);
        moto.setCasco(true);
        moto.setCantGasolina(30);
        moto.datosVehiculo();
        imprimeAutos( cnuevo,moto, cUsado);

    }

    public static void imprimeAutos (Carro...c){
        System.out.println("Imprimiendo");
        for (Carro carro : c)
            carro.datosVehiculo();
        System.out.println();
    }

}
