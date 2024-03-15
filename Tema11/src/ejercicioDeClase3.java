import java.io.*;
import java.util.Arrays;

public class ejercicioDeClase3 {
    public static void main(String[] args) {

        Socio[] socios = new Socio[4];
        socios[0] = new Socio("1", "Jose");
        socios[1] = new Socio("2", "Pepe");
        socios[2] = new Socio("100", "Enrique");
        socios[3] = new Socio("30", "Maria");

        //Mostramos los socios
        System.out.println(Arrays.deepToString(socios));

        ObjectOutputStream  salida= null;
        //Creamos un flujo de salida binario y escribimos en él
        try{
            salida = new ObjectOutputStream(new FileOutputStream("socios.dat"));
            salida.writeObject(socios);
        } catch(FileNotFoundException e){
            System.out.println("ERROR: Fallo al encontrar el archivo");
        } catch(IOException e){
            System.out.println("ERROR: Fallo al guardar el fichero");
        } finally {
            if(salida != null) {
                try {
                    salida.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        //Creamos un nuevo array de socios para que no haya trampa
        Socio[] nuevoArray = new Socio[4];

        //Recogemos la información del archivo socios.dat
        try(ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("socios.dat"))) {
            nuevoArray = (Socio[]) entrada.readObject();
        } catch(IOException e){
            System.out.println("ERROR: Fallo al leer el fichero");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: Fallo al importar la clase del fichero");
        }

        //Mostramos los socios
        System.out.println(Arrays.deepToString(nuevoArray));

    }
}


