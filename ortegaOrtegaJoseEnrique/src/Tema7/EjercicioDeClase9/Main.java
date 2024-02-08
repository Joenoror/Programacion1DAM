package Tema7.EjercicioDeClase9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Radio radio = new Radio();

        System.out.println(radio);

        System.out.println("Bienvenido a la radio de tu Delorean");
        System.out.println("¿Quieres introducir una emisora inicial?");
        System.out.println("Indica con true/false");
        boolean emisoraInicial = sc.nextBoolean();
        if(emisoraInicial){
            System.out.println("Perfecto. Introduce la emisora en cuestión");
            radio = new Radio(sc.nextDouble());
        }
        else radio = new Radio();

        System.out.println("Tu emisora actual es " + radio.frecuencia);

        int opcion = 1;
        while(opcion !=0){
            System.out.println("INTRODUCE UNA OPCIÓN");
            System.out.println("1. Mostrar emisora actual.");
            System.out.println("2. Subir de emisora.");
            System.out.println("3. Bajar de emisora.");
            System.out.println("0. Salir del programa.");
            opcion = sc.nextInt();

            switch (opcion){
                case 1 -> System.out.println(radio.getFrecuencia());
                case 2 -> radio.aumentarFrecuencia();
                case 3 -> radio.disminuirFrecuencia();
            }
        }

    }
}
