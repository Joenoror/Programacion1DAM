package EjercicioDeClase4;

import java.io.*;
import java.util.Arrays;

public class Registros implements Serializable {

    Registro[] registros = new Registro[0];

    Registros(){

    }

    void nuevoRegistro(Registro nuevoRegistro){
        System.out.println("NUEVO REGISTRO");
        registros = Arrays.copyOf(registros, registros.length + 1);
        registros[registros.length-1] = nuevoRegistro;
    }

    void mostrarRegistros(){
        for (int i = 0; i < this.registros.length; i++) {
            System.out.println("EjercicioDeClase4.Registro["+i+"] " + this.registros[i].toString());
        }
    }

    Registros leerDesdeArchivo(Registros r, String rutaDeArchivo){
        try(ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(rutaDeArchivo))) {
            System.out.println("FICHERO ENCONTRADO");
            System.out.println("DATOS ENCONTRADOS:");
            r = (Registros) flujoEntrada.readObject();
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());

        }
        return r;
    }

    void guardarEnArchivo(Registros r, String rutaDeArchivo){
        try (ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream(rutaDeArchivo))){
            flujoSalida.writeObject(r);
            System.out.println("FICHERO GUARDADO");
        } catch (IOException e){
            System.out.println("ERROR: Archivo no encontrado o no se ha podido abrir");;
        }
    }

}
