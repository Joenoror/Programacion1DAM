package Ejercicio4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Introduce la cantidad de elementos de la tabla");
        int tamanioTabla = new Scanner(System.in).nextInt();

        Integer[] listaEnteros = new Integer[tamanioTabla];

        System.out.println("Introduce el valor mínimo aleatorio");
        int valorMinimo = new Scanner(System.in).nextInt();
        System.out.println("Introduce el valor máximo aleatorio");
        int valorMaximo = new Scanner(System.in).nextInt();

        rellenoTabla(listaEnteros,valorMinimo, valorMaximo);
        System.out.println("Tabla normal -->" + Arrays.deepToString(listaEnteros));

        Arrays.sort(listaEnteros);
        System.out.println("Tabla ordenada con sort normal -->" + Arrays.deepToString(listaEnteros));

//        Arrays.sort(listaEnteros, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return -((Integer) o1 - (Integer)o2);
//            }
//        });

        Comparator c1 = new ComparaEnteros();
        Arrays.sort(listaEnteros, c1);

        System.out.println("Tabla ordenada usando Operator -->" + Arrays.deepToString(listaEnteros));


    }

    static void rellenoTabla(Integer[] tabla, int valorMinimo, int valorMaximo){
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] =(int) (Math.random() * valorMaximo - valorMinimo) + valorMinimo;
        }
    }


}
