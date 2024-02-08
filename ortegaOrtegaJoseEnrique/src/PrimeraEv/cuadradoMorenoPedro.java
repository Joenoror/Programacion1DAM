package PrimeraEv;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class cuadradoMorenoPedro {

      public static void ejercicio1(){




            int [] arrayEnteros = new int [10];

            for (int i = 0; i < arrayEnteros.length; i++) {

                arrayEnteros [i] = (int) (Math.random() * 10);
            }



            System.out.println("Se ha creado aleatoriamente un array con valores del 0 al 10, introduce tu número para ver cuantas veces se repite");
            System.out.println(Arrays.toString(arrayEnteros));

            Scanner sc = new Scanner (System.in);

            int n = sc.nextInt();

            int contador = 0;
            int valor;
            
            for (int i = 0; i < arrayEnteros.length; i++) {

                if (n == arrayEnteros [i] ) {
                    contador++;
                }
            }

            System.out.println("Tu número aparece " + contador + " veces en el array.");
            System.out.println(" ");


            System.out.println("Ahora introduce otro número entero");

            int n2 = sc.nextInt();



            boolean verdadFalso2 =  cuadradoMorenoPedroFunciones.verdadFalso(n2, arrayEnteros, contador);

            if (verdadFalso2) {

                System.out.println("VERDADERO");
            }
            else {
                System.out.println("FALSO");
            }
            boolean mayorOMenor = verdadFalso2;

          System.out.println(" ");

          System.out.println(mayorOMenor ? "Mayor " : "Menor ");

        }




        static void ejercicio2(){
            //Rellena con tu código aquí
        }

        static void ejercicio3(){


            System.out.println("Introduce un número n para generar dose matrices nxn:");

            Scanner sc = new Scanner (System.in);

            int n = sc.nextInt();

            int [][] matrizA = cuadradoMorenoPedroFunciones.generarMatriz(n);

            int [][] matrizB = cuadradoMorenoPedroFunciones.generarMatriz(n);


            System.out.println(" ");
            System.out.println("Las matrices generadas son las siguientes:");
            System.out.println(" ");


            System.out.println("Matriz A: ");

            cuadradoMorenoPedroFunciones.imprimirMatriz(matrizA);
            System.out.println("");
            System.out.println("Matriz B:  ");

            cuadradoMorenoPedroFunciones.imprimirMatriz(matrizB);
            System.out.println("");

            System.out.println("La matriz resultado de la MULTIPLICACIÓN de estas matrices A y B es:");
            int [][] matrizResultado =  cuadradoMorenoPedroFunciones.multiplicarMatrices(matrizA, matrizB);
            cuadradoMorenoPedroFunciones.imprimirMatriz(matrizResultado);

            System.out.println("");

            System.out.println("La matriz resultado de la SUMA de matrices A y B es: ");
            int [][] matrizResultado2 =  cuadradoMorenoPedroFunciones.sumarMatrices(matrizA, matrizB);
            cuadradoMorenoPedroFunciones.imprimirMatriz(matrizResultado2);
        }







        public static void main(String[] args) {

            boolean programa = true;

            while(programa){

                System.out.println("---------------------------------------------------------");
                System.out.println("Introduce el nº correspondiente del ejercicio a realizar.");
                System.out.println("1 - Ejercicio 1.");
                System.out.println("2 - Ejercicio 2.");
                System.out.println("3 - Ejercicio 3.");
                System.out.println("0 - Salir del programa");
                System.out.println("---------------------------------------------------------");

                Scanner sc = new Scanner(System.in);
                int opcion = sc.nextInt();

                switch (opcion){
                    case 1 -> ejercicio1();
                    case 2 -> ejercicio2();
                    case 3 -> ejercicio3();
                    case 0 -> programa = false;
                    default ->
                            System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
                }


            }


        }

    }


