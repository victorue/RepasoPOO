package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Victor Ruelas on 22/02/2018.
 */

public class Programa10 {
    public void Factorial() {
        Scanner sc = new Scanner(System.in);

            int num;
            int fac =1;
        System.out.println("Ingresa numero");
        num=sc.nextInt();

       while(num!=0){
    fac*=num;
    num--;
        }

        System.out.println("El factorial es: " + fac);
    }
}
