package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Victor Ruelas on 22/02/2018.
 */

public class Programa5 {
    public void Triple() {
        Scanner sc = new Scanner(System.in);

        double num=0;
        double res;
        System.out.println("Ingresa Numero");
        num=sc.nextDouble();

        if (num < 50) {
            res=num*2;
            System.out.println("El resultado es: " + res);
        }else{
            if (num >= 50) {
                res= num * 3;
                System.out.println("El resultado es: " + res);
            }

        }
    }
}
