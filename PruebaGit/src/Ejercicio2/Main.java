package Ejercicio2;

import Ejercicio1.Cola;
import Ejercicio1.Lista;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cola colaUltra = new Cola() {
            Lista li = new Lista();
            @Override
            public void encolar(Integer integerAEncolar) {
                li.insertarAlFinal(integerAEncolar);
                li.insertarAlFinal(integerAEncolar);
            }

            @Override
            public Integer desencolar() {
                return li.borrarEn(1); //Recuerdo que yo borro el que se encuentra en la 1º posicion

            }
        };

        System.out.println("PROBAMOS LAS COLAS. ENCOLO");

        System.out.println("Introducir un número");
        Integer n = new Scanner(System.in).nextInt();
        while(n >= 0){
            colaUltra.encolar(n);
            System.out.println("Introducir un número");
            n = new Scanner(System.in).nextInt();
        }
        System.out.print("LISTA --> ");
        //cola.mostrarLista();
        System.out.print("DESENCOLO EN ESTE ORDEN --> ");
        n = colaUltra.desencolar();
        while(n != null){
            System.out.print(n+" ");
            n = colaUltra.desencolar();
        }
        System.out.println("");

    }






}
