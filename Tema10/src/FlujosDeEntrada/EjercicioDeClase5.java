package FlujosDeEntrada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EjercicioDeClase5 {
    public static void main(String[] args) {
        BufferedReader in = null; //null para cuando cerremos, que no cerremos algo que no esté abierto
        try {
            in = new BufferedReader(new FileReader(".\\Archivos\\prueba.txt"));
            Scanner s;
            double numero;
            double suma = 0;
            String[] nombres = new String[0];
            String linea = in.readLine();
            while(linea != null){
                s = new Scanner(linea).useLocale(Locale.US);
                if(s.hasNextDouble()){
                    numero = s.nextDouble();
                    suma += numero;
                }
                else if(s.hasNext()){
                    nombres = Arrays.copyOf(nombres, nombres.length+1);
                    nombres[nombres.length-1] = s.next();
                    System.out.println(nombres[nombres.length-1]);
                }
                linea = in.readLine();
            }
            System.out.println("Suma: " + suma);
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            if(in != null){
                try {
                    in.close();
                } catch (IOException e){
                    System.out.println(e);
                }
            }
        }



    }
}
