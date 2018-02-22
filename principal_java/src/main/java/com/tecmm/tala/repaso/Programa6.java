package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Victor Ruelas on 22/02/2018.
 */

public class Programa6 {
    public void Pares() {
        Scanner sc = new Scanner(System.in);
        double num=0;
        //double num2;
        //double res;
        System.out.println("Dame Numero");
        num=sc.nextDouble();

        if (num % 2 == 0) {

            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }
}
