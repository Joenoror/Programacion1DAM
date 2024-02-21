package Ejercicio4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] listaEnteros = new Integer[20];

        listaEnteros = rellenoTabla(listaEnteros);
        System.out.println("Tabla normal -->" + Arrays.deepToString(listaEnteros));

        Arrays.sort(listaEnteros);
        System.out.println("Tabla ordenada con sort normal -->" + Arrays.deepToString(listaEnteros));

        Arrays.sort(listaEnteros, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return -((Integer) o1 - (Integer)o2);
            }
        });

        System.out.println("Tabla ordenada usando Operator -->" + Arrays.deepToString(listaEnteros));


    }

    static Integer[] rellenoTabla(Integer[] tabla){
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] =(int) (Math.random() * (100 + 1) - 1);
        }
        return tabla;
    }


}
