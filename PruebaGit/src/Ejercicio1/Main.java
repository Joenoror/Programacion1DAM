package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista li = new Lista();
//        li.mostrarLista();
//        li.insertarAlFinal(0);
//        li.mostrarLista();
//        li.insertarAlPrincipio(1);
//        li.mostrarLista();
//        li.insertarAlPrincipio(99);
//        li.insertarEn(99, 2);
//        li.insertarAlPrincipio(99);
//        li.mostrarLista();
//        li.insertarAlPrincipio(5);
//        li.mostrarLista();
//        li.insertarAlFinal(2);
//        li.mostrarLista();
//        li.insertarAlFinal(4);
//        li.mostrarLista();
//        li.insertarEn(77, 3);
//        li.mostrarLista();
//        li.borrarEn(3);
//        li.mostrarLista();


//        testColas(li);
        testPilas(li);

        li.mostrarVersiones();


//        System.out.println(li.buscar(99));
    }


    static void testColas(Lista li){
        System.out.println("PROBAMOS LAS COLAS. ENCOLO");

        System.out.println("Introducir un número");
        Integer n = new Scanner(System.in).nextInt();
        while(n >= 0){
            li.encolar(n);
            System.out.println("Introducir un número");
            n = new Scanner(System.in).nextInt();
        }
        System.out.print("LISTA --> ");
        li.mostrarLista();
        System.out.print("DESENCOLO EN ESTE ORDEN --> ");
        n = li.desencolar();
        while(n != null){
            System.out.print(n+" ");
            n = li.desencolar();
        }
        System.out.println("");
    } //FUNCIÓN VACÍA PARA PROBAR LAS COLAS
    static void testPilas(Lista li){
        System.out.println("PROBAMOS LAS PILAS. APILO");

        System.out.println("Introducir un número");
        Integer n = new Scanner(System.in).nextInt();
        while(n >= 0){
            li.apilar(n);
            System.out.println("Introducir un número");
            n = new Scanner(System.in).nextInt();
        }
        System.out.print("LISTA --> ");
        li.mostrarLista();
        System.out.print("DESAPILO EN ESTE ORDEN --> ");
        n = li.desapilar();
        while(n != null){
            System.out.print(n+" ");
            n = li.desapilar();
        }
        System.out.println("");
    } //FUNCIÓN VACÍA PARA PROBAR LAS PILAS

}
