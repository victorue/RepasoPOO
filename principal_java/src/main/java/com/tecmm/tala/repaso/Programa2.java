package com.tecmm.tala.repaso;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Victor Ruelas on 22/02/2018.
 */

public class Programa2 {
    public void Articulo () {

        Scanner sc = new Scanner(System.in);
        System.out.println("DAME PRECIO DEL ARTICULO");
    double precio = sc.nextDouble();
    double iva=.16;

    precio=(precio * iva)+ precio;
        System.out.println("El Precio con iva incluido es :" + precio);


    }
}
