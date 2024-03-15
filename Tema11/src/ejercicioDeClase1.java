import java.io.*;
import java.util.Arrays;

public class ejercicioDeClase1 {
    public static void main(String[] args) {

        //ESCRITURA EN EL ARCHIVO
        int[] arrayDeEnteros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ObjectOutputStream flujoDeSalida = null;
        try {
            flujoDeSalida = new ObjectOutputStream(new FileOutputStream(".\\Archivos\\datos.dat"));
//            //OPCION 1 - ESCRIBIR ENTERO A ENTERO
//            for (int n: arrayDeEnteros) {
//                flujoDeSalida.writeInt(n);
//            }
            //OPCION 2 - ESCRIBIR T0DO EL OBJETO DE UNA VEZ
            flujoDeSalida.writeObject(arrayDeEnteros);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (flujoDeSalida != null) {
                try {
                    flujoDeSalida.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }


    }
}
