import java.io.*;
import java.util.Arrays;
public class ejercicioDeClase3 {
    public static void main(String[] args) {


        Socio[] socios = new Socio[]
                {
                new Socio(1, "Pepe"),
                        new Socio(2, "Juan"),
                        new Socio(3, "Lucas"),
                        new Socio(4, "Raul")
                };

        String rutaDeArchivo = "socios.dat";

        //ESCRITURA FORMA DESGLOSADA
        ObjectOutputStream flujoSalida = null;
        try {
            flujoSalida = new ObjectOutputStream(new FileOutputStream(rutaDeArchivo));
            flujoSalida.writeObject(socios);
        } catch (IOException e){
            System.out.println("ERROR: Archivo no encontrado o no se ha podido abrir");;
        } finally {
            if(flujoSalida != null){
                try{
                    flujoSalida.close();
                } catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }

        //LECTURA FORMA COMPACTA
        try(ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(rutaDeArchivo))){

            Socio[] arrayDeLectura = (Socio[]) flujoEntrada.readObject();
            System.out.println(Arrays.deepToString(arrayDeLectura));

        } catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
