package FlujosDeEntrada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String numeros = "1 34 22 0 143 9";
        Scanner s = new Scanner(numeros);

        //s = new Scanner(System.in);
        int[] tabla = new int[5];

        System.out.println("Introducir una serie de 5 enteros: ");
        for (int i = 0; i < tabla.length; i++) {
            int n = s.nextInt();
            tabla[i] = n;
        }
        System.out.println(Arrays.toString(tabla));

        //Ejemplo con un int y un double en la misma línea
//        int edad;
//        double altura;
//        edad = s.nextInt();
//        altura = s.nextDouble();
//        System.out.println("Su edad es " + edad + " y su altura es " + altura);

    }
}
