package FlujosDeEntrada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        BufferedReader in = null;
        double suma = 0;
        double[] arrayDeNumeros = new double[0];
        try {
            in = new BufferedReader(new FileReader(".\\Archivos\\NumerosReales.txt"));
            System.out.println("----ABRO EL ARCHIVO----");
            try {
                String cad = in.readLine();
                Scanner s = new Scanner(cad).useLocale(Locale.US);
                while(cad != null){
                    arrayDeNumeros = Arrays.copyOf(arrayDeNumeros, arrayDeNumeros.length+1);
                        double numero = s.nextDouble();
                        arrayDeNumeros[arrayDeNumeros.length-1] = numero;
                        suma += numero;
                }

            } catch (NullPointerException e){
                System.out.println("No has rellenado el fichero.");
            } catch (NumberFormatException e){
                System.out.println("Has incluido , en vez de .");
            }

            for (int i = 0; i < arrayDeNumeros.length; i++) {
                System.out.print(arrayDeNumeros[i] + " ");
            }

            System.out.println("\nEl tamaño de mi array es: " + arrayDeNumeros.length);
            System.out.println("El valor de la suma es: " + suma);
            System.out.println("La media de mi array es :" + suma/arrayDeNumeros.length);

        } catch (IOException e){
            System.out.println("No encuentro el archivo");
        } finally {
            if(in != null){
                try {
                    in.close();
                    System.out.println("----CIERRO EL ARCHIVO----");
                } catch (IOException e){
                    System.out.println("No se ha llegado a abrir el archivo, asi que no cierro nada.");
                }
            }
        }

    }
}
