package FlujosDeSalida;

import java.io.*;
import java.util.Scanner;

public class EjercicioDeClase8 {
    public static void main(String[] args) {
        System.out.println("Introduce un nombre para el fichero");
        String nombreFichero = new Scanner(System.in).nextLine();
        try (BufferedReader in = new BufferedReader(new FileReader(nombreFichero + ".txt"));
             BufferedWriter out = new BufferedWriter(new FileWriter("copia_de_"+nombreFichero+".txt"))){
            int c = in.read();
            while (c != -1){
                out.write(c);
                c = in.read();
            }
        } catch (IOException e){
            e.getMessage();
        }
    }
}
