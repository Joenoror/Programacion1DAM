import java.io.*;
import java.util.Scanner;

public class LeerYEscribirFraseAbreviado {
    public static void main(String[] args) {


        try(BufferedReader reader = new BufferedReader(new FileReader("repaso.txt"));) {
            //LEER
            String linea = reader.readLine();
            System.out.println("Se ha leido: " + linea);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("repaso.txt", true));){
            //ESCRIBIR
            System.out.println("Introduce una frase");
            String fraseAEscribir = new Scanner(System.in).nextLine();
            writer.newLine();
            writer.write(fraseAEscribir);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
