package PrimeraEv;

import java.sql.Time;
import java.util.Scanner;

public class hierroCordonChristian {

    static void ejercicio1() {
        int[] numerillos = new int[100];

        System.out.print("Introduce un número pa' buscar cuantas sale: ");
        int veces = new Scanner(System.in).nextInt();

        System.out.println("Introduce otro número");
        int otroVeces = new Scanner(System.in).nextInt();

        boolean ehono=false;

        boolean mayorOMenor = ehono;

        int cuantasVecesSalesTu1=0;
        int cuantasVecesSalesTu2=0;

        if (veces>0&&otroVeces>0) {
            for (int i = 0; i < numerillos.length; i++) {
                double aletorio = Math.random() * 10 + 0;
                numerillos[i] = (int) aletorio;
                System.out.print(" " + numerillos[i]);

                if (numerillos[i] == veces) {
                    cuantasVecesSalesTu1++;
                }
                if (numerillos[i] == otroVeces) {
                    cuantasVecesSalesTu2++;
                }
            }

            if (cuantasVecesSalesTu1 > cuantasVecesSalesTu2) {
                ehono = true;
            } else if (cuantasVecesSalesTu2 > cuantasVecesSalesTu1) {
                ehono = false;
            }

            System.out.println(" ");
            System.out.println("El número " + veces + " repite " + cuantasVecesSalesTu1);
            System.out.println(" ");
            System.out.println("El número " + veces + " repite " + cuantasVecesSalesTu2);
            System.out.println(" ");
            System.out.println("El valor es " + ehono);
            System.out.println(!mayorOMenor ? "Menor" : "Mayor");
        }else System.out.println("No has metido el número correcto, haber estudiao");
    }

    static void ejercicio2() {
        //APARTADO A
        System.out.println("Introduce tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce tu primer apellido: ");
        String primerApellido = new Scanner(System.in).nextLine();
        System.out.println("Introduce tu segundo apellido: ");
        String segundoApellido = new Scanner(System.in).nextLine();

        String dosPrimerasLetrasDelPrimerApellido="";
        String dosPrimerasLetrasDelSegundoApellido="";
        String primeraLetraDelNombre="";

        int veces=0;
        int varias=0;
        int i=0;
        int a=0;

        if (nombre!=null || primerApellido!=null || segundoApellido!=null) {
            while (veces < 2) {
                //System.out.print(nombre.charAt(i));
                //primeraLetraDelNombre += String.valueOf(nombre.charAt(i));
                dosPrimerasLetrasDelPrimerApellido += String.valueOf(primerApellido.charAt(i));
                dosPrimerasLetrasDelSegundoApellido += String.valueOf(segundoApellido.charAt(i));
                i++;
                veces++;
            }

            while (varias < 1) {
                primeraLetraDelNombre += String.valueOf(nombre.charAt(a));
                a++;
                varias++;
            }

            System.out.println(primeraLetraDelNombre + dosPrimerasLetrasDelPrimerApellido + dosPrimerasLetrasDelSegundoApellido);
        }else System.out.println("Debes introducir todos los datos");

        //APARTADO B
        System.out.println("Introduce tu año de nacimiento: ");
        int nacimientoDelMenda = new Scanner(System.in).nextInt();

        int anio = 2024;

        if (nacimientoDelMenda > anio || nacimientoDelMenda < 0){
            System.out.println("Esa fecha te las inventao eh, uchalo que gracioso");
        }else {
            int edadDeVerdad = anio-nacimientoDelMenda;
            System.out.println(primeraLetraDelNombre + dosPrimerasLetrasDelPrimerApellido + dosPrimerasLetrasDelSegundoApellido+"."+edadDeVerdad);
        }
    }

    static void ejercicio3() {
        //Ejercicio 3
        System.out.println("Introduce el tamaño de tu dimensión: ");
        int tamanio = new Scanner(System.in).nextInt();

        int[][] dimensionXokas = new int[tamanio][tamanio];
        int[][] dimensionIllojuan = new int[tamanio][tamanio];

        if (tamanio > 0) {
            for (int m = 0; m < tamanio; m++) {
                for (int n = 0; n < tamanio; n++) {
                    dimensionXokas[m][n] = (int) (Math.random() * 99 + 0);
                    System.out.print(dimensionXokas[m][n] + " ");
                }
            }
            System.out.println();
            for (int o = 0; o < tamanio; o++) {
                for (int p = 0; p < tamanio; p++) {
                    dimensionIllojuan[o][p] = (int) (Math.random() * 99 + 0);
                    System.out.print(dimensionIllojuan[o][p] + " ");
                }
            }
            System.out.println();
            System.out.print("Suma -> ");
            for (int q = 0; q < tamanio; q++) {
                for (int r = 0; r < tamanio; r++) {
                    int total = dimensionIllojuan[q][r] + dimensionXokas[q][r];
                    System.out.print(total + " ");
                }
            }
            System.out.println();
            System.out.print("Multiplicación -> ");
            for (int q = 0; q < tamanio; q++) {
                for (int r = 0; r < tamanio; r++) {
                    int total2 = dimensionIllojuan[q][r] * dimensionXokas[q][r];
                    System.out.print(total2 + " ");
                }
            }
            System.out.println();
        } else System.out.println("Pero mete un número mayor que 0, no puedo hacer matrices");

        cuadradoMorenoPedroFunciones.imprimirMatriz(dimensionIllojuan);
        cuadradoMorenoPedroFunciones.imprimirMatriz(dimensionXokas);

    }


    public static void main(String[] args) {

        boolean programa = true;

        while (programa) {

            System.out.println("---------------------------------------------------------");
            System.out.println("Introduce el nº correspondiente del ejercicio a realizar.");
            System.out.println("1 - Ejercicio 1.");
            System.out.println("2 - Ejercicio 2.");
            System.out.println("3 - Ejercicio 3.");
            System.out.println("0 - Salir del programa");
            System.out.println("---------------------------------------------------------");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 0 -> programa = false;
                default -> System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }



        }
    }
}