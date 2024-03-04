package FlujosDeSalida;

import java.io.*;
import java.util.Scanner;

public class EjercicioDeClase8 {
    public static void main(String[] args) {
        System.out.println("Introduce un nombre para el fichero");
        String nombreFichero = new Scanner(System.in).nextLine();
        try (BufferedReader in = new BufferedReader(new FileReader(".\\Archivos\\" + nombreFichero + ".txt"));
             BufferedWriter out = new BufferedWriter(new FileWriter(".\\Archivos\\" + "copia_de_"+nombreFichero+".txt"))){

            //EJEMPLO CON CARACTER A CARACTER
//            int c = in.read();
//            while (c != -1){
//                out.write(c);
//                c = in.read();
//            }

            //EJEMPLO CON CADENA DE TEXTO A CADENA DE TEXTO
//            String cad = in.readLine();
//            while (cad != null){
//                out.write(cad);
//                out.newLine();
//                cad = in.readLine();
//            }


        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
