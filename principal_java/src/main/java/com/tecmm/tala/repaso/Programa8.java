package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Victor Ruelas on 22/02/2018.
 */

public class Programa8 {
    public void Nombre() {

        String nombre;
        int a;


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa Nombre");
        nombre=sc.next();
        System.out.println("Ingresa numero de repeticiones");
        a = sc.nextInt();

        for (int i=1; i<=a; i++ ){
            System.out.println(nombre);

        }
        System.out.println("El nombre se ha repetido: " + a + " veces ");


    }

}
