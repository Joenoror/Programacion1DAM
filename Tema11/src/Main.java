import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try {
            //PASO 1 - PIDO EL FICHERO
            //1. SI NO EXISTE LO CREA
            //2. SI EXISTE, LO BORRA Y LO SUSTITUYE
            System.out.println("Introduce el nombre del fichero a abrir" +
                    "\n**RECUERDA PONER LA EXTENSIÓN**");
            String rutaArchivo = new Scanner(System.in).nextLine();
            FileOutputStream archivo = new FileOutputStream(".\\Archivos\\" + rutaArchivo);
            System.out.println("ARCHIVO " + rutaArchivo.toUpperCase() + " ABIERTO");

            //PASO 2 - ENVUELVO AL FICHERO
            ObjectOutputStream out = new ObjectOutputStream(archivo);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}