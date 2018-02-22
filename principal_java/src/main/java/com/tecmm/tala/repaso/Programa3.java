package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Victor Ruelas on 22/02/2018.
 */

public class Programa3 {



    public void Grados(){
    Scanner sc = new Scanner(System.in);
    double f=0;
    double k=0;
    double c=0;

        System.out.println("DAME GRADOS CENTIGRADOS");
        c =sc.nextDouble();
        k=(c+273);
        System.out.println("Los grados convertidos a Kelvin son: " + k);
        f=(c*1.8)+32;
        System.out.println("Los grados convertidos a Farenheit son: " + f);




    }
}
