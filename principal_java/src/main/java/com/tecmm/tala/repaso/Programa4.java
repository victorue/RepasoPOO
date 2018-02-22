package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Victor Ruelas on 22/02/2018.
 */

public class Programa4 {
    public void Hora() {
        Scanner sc = new Scanner(System.in);
        int hora;
        int res;
        System.out.println("Ingresa Hora");
        hora = sc.nextInt();


        if (hora <= 12) {

            res = hora;
            System.out.println("La hora es: " + res + " am");
        } else {
            if (hora > 24) {
                System.out.println("Hora Invalida");
            } else {
                res = hora - 12;
                System.out.println("La hora es: " + res + " pm");
            }


        }
    }
}
