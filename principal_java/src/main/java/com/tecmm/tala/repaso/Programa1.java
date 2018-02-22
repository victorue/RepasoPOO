package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Victor Ruelas on 22/02/2018.
 */

public class Programa1 {




    public void Triangulo() {

        Scanner sc = new Scanner(System.in);
        double area=0;

        System.out.println("INGRESA VALOR DE BASE");
        double base = sc.nextDouble();
        System.out.println("INGRESA VALOR DE ALTURA");
        double altura = sc.nextDouble();
        area=(altura * base) / 2;
        System.out.println("El area del triangulo es : " + area);

    }
}
