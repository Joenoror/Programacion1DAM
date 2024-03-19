import java.io.*;
import java.util.Arrays;

public class ejercicioDeClase1Ampliado {
    public static void main(String[] args) {
        System.out.println("AHORA PROCEDEREMOS A LEER DEL ARCHIVO EN EL QUE HEMOS ESCRITO");
        try (ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(".\\Archivos\\datos.dat"))){
            //Procederemos con la lectura
            //OPCION 1 - LEER ENTERO A ENTERO
//            int[] lecturaDelArrayDeEnteros = new int[10];
//            for (int i = 0; i < lecturaDelArrayDeEnteros.length; i++) {
//                lecturaDelArrayDeEnteros[i] = flujoEntrada.readInt();
//            }
            //OPCION 2 - LEER T0DO EL OBJETO DE UNA VEZ
            int[] lecturaDelArrayDeEnteros = (int[]) flujoEntrada.readObject();
            System.out.println(Arrays.toString(lecturaDelArrayDeEnteros));
        } catch (IOException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
