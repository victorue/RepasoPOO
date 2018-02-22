package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Victor Ruelas on 22/02/2018.
 */

public class Programa7 {
    public void Romano() {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingresa numero");
        num=sc.nextInt();

        if (num >= 1 && num <=7) {

            if(num==1) System.out.println("Numero Romano I");
            if(num==2) System.out.println("Numero Romano II");
            if(num==3) System.out.println("Numero Romano III");
            if(num==4) System.out.println("Numero Romano IV");
            if(num==5) System.out.println("Numero Romano V");
            if(num==6) System.out.println("Numero Romano VI");
            if(num==7) System.out.println("Numero Romano VII");
        }else{
            System.out.println("ERROR");
        }

    }
}
