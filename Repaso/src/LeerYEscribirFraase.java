import java.io.*;
import java.util.Scanner;

public class LeerYEscribirFraase {
    public static void main(String[] args) {

        BufferedReader reader = null;
        BufferedWriter writer = null;
        String ruta = "repaso.txt";

        try {
            reader = new BufferedReader(new FileReader("repaso.txt"));

            //LEER
            String linea = reader.readLine();
            System.out.println("Se ha leido: " + linea);

        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }

        try{
            writer = new BufferedWriter(new FileWriter("loquesea.txt"));
            //ESCRIBIR
            System.out.println("Introduce una frase");
            String fraseAEscribir = new Scanner(System.in).nextLine();
            writer.write(fraseAEscribir);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            if(reader != null){
                try {
                    writer.close();
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}
