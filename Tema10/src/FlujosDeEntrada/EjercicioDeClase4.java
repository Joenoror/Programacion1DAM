package FlujosDeEntrada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EjercicioDeClase4 {
    public static void main(String[] args) {
        BufferedReader in = null;
        double[] arrayDeNumeros = new double[0];
        double suma = 0;
        try {
            in = new BufferedReader(new FileReader(".\\Archivos\\numeros.txt"));
            Scanner s;
            String linea = in.readLine();
            String[] lineas = linea.split(" ");

            for (int i = 0; i < lineas.length; i++) {
                arrayDeNumeros = Arrays.copyOf(arrayDeNumeros, arrayDeNumeros.length + 1);
                arrayDeNumeros[i] = Double.valueOf(lineas[i]);
                suma += arrayDeNumeros[i];
                if(i != lineas.length - 1) System.out.print(arrayDeNumeros[i] + " ");
                else System.out.print(arrayDeNumeros[i]);
            }

            System.out.println("\nCantidad de números --> " + arrayDeNumeros.length);
            System.out.println("Suma de los números --> " + suma);
            System.out.println("Media de los números --> " + suma/arrayDeNumeros.length);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
