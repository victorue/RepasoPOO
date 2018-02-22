package com.example.principal_java;

import com.example.clases.Carro;
import com.example.clases.Motocicleta;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.tecmm.tala.repaso.Programa1;
import com.tecmm.tala.repaso.Programa10;
import com.tecmm.tala.repaso.Programa2;
import com.tecmm.tala.repaso.Programa3;
import com.tecmm.tala.repaso.Programa4;
import com.tecmm.tala.repaso.Programa5;
import com.tecmm.tala.repaso.Programa6;
import com.tecmm.tala.repaso.Programa7;
import com.tecmm.tala.repaso.Programa8;
import com.tecmm.tala.repaso.Programa9;

import java.util.Scanner;

import jdk.nashorn.internal.ir.WhileNode;

public class Principal {

    public static void main(String[] args) {
        /*System.out.println("Hola Mundo");
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
        imprimeAutos( cnuevo,moto, cUsado);*/

        Scanner sc = new Scanner(System.in);
        int opc = 0;
        //int opcion;
        while (opc!=11) {
            System.out.println("\nMENU DE PROGRAMAS");
            System.out.println("1. Area de Triangulo");
            System.out.println("2. Articulo con IVA Aplicado");
            System.out.println("3. Conversion de Grados");
            System.out.println("4. Hora con notacion 24 hrs");
            System.out.println("5 Doble o Triple de un Numero");
            System.out.println("6. Numeros Pares o Impares");
            System.out.println("7. Numeros Romanos");
            System.out.println("8. Repeticiones de un Nombre");
            System.out.println("9. Despliegue de Numeros");
            System.out.println("10. Factorial");
            System.out.println("11. SALIR");

            System.out.println("ELIGE UNA OPCION");
            opc = sc.nextInt();


            switch (opc) {
                case 1:
                    System.out.println("Elegiste la opcion 1");
                    Programa1 p1 = new Programa1();
                    p1.Triangulo();

                    break;
                case 2:
                    System.out.println("Elegiste la opcion 2");
                    Programa2 p2 = new Programa2();
                    p2.Articulo();

                    break;
                case 3:
                    System.out.println("Elegiste la opcion 3");
                    Programa3 p3 = new Programa3();
                    p3.Grados();
                    break;
                case 4:
                    System.out.println("Elegiste la opcion 4");
                    Programa4 p4 = new Programa4();
                    p4.Hora();
                    break;
                case 5:
                    System.out.println("Elegiste la opcion 5");
                    Programa5 p5 = new Programa5();
                    p5.Triple();
                    break;
                case 6:
                    System.out.println("Elegiste la opcion 6");
                    Programa6 p6 = new Programa6();
                    p6.Pares();

                    break;
                case 7:

                    System.out.println("Elegiste la opcion 7");
                    Programa7 p7 = new Programa7();
                    p7.Romano();
                    break;
                case 8:

                    System.out.println("Elegiste la opcion 8");
                    Programa8 p8 = new Programa8();
                    p8.Nombre();
                    break;
                case 9:
                    System.out.println("Elegiste la opcion 9");

                    Programa9 p9 = new Programa9();
                    p9.Despliegue();
                    break;
                case 10:

                    System.out.println("Elegiste la opcion 10");
                    Programa10 p10 = new Programa10();
                    p10.Factorial();
                    break;
            }

        }

    /*public static void imprimeAutos (Carro...c){
        System.out.println("Imprimiendo");
        for (Carro carro : c)
            carro.datosVehiculo();
        System.out.println();
    }*/

    }
}