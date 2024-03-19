import java.io.*;
import java.util.Arrays;

public class ejercicioDeClase1 {
    public static void main(String[] args) {

        int[] arrayDeEnteros = {0,1,2,3,4,5,6,7,8,9};
        ObjectOutputStream flujoDeSalida = null;
        try {
            flujoDeSalida = new ObjectOutputStream(new FileOutputStream(".\\Archivos\\datos.dat"));
//            //OPCION 1 - ESCRIBIR ENTERO A ENTERO
//            for (int n: arrayDeEnteros) {
//                flujoDeSalida.writeInt(n);
//            }
            //OPCION 2 - ESCRIBIR T0DO EL OBJETO DE UNA VEZ
            flujoDeSalida.writeObject(arrayDeEnteros);
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            if(flujoDeSalida != null){
                try {
                    flujoDeSalida.close();
                } catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("AHORA PROCEDEREMOS A LEER DEL ARCHIVO EN EL QUE HEMOS ESCRITO");
        try (ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(".\\Archivos\\datos.dat"))){
            //Procederemos con la lectura
            //OPCION 1 - LEER ENTERO A ENTERO
            //int[] lecturaDelArrayDeEnteros = new int[10];
//            for (int i = 0; i < lecturaDelArrayDeEnteros.length; i++) {
//                lecturaDelArrayDeEnteros[i] = flujoEntrada.readInt();
//            }
            //OPCION 2 - LEER T0DO EL OBJETO DE UNA VEZ
            int[] lecturaDelArrayDeEnteros = (int[]) flujoEntrada.readObject();
            System.out.println(Arrays.toString(lecturaDelArrayDeEnteros));
        } catch (IOException | ClassCastException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
