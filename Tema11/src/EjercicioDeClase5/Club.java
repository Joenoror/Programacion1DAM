package EjercicioDeClase5;

import EjercicioDeClase4.Registro;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Club{

    //String nombre;
    Deportista[] afiliados = new Deportista[0];

    void alta(Deportista nuevoRegistro){
        System.out.println("NUEVO REGISTRO");
        afiliados = Arrays.copyOf(afiliados, afiliados.length + 1);
        afiliados[afiliados.length-1] = nuevoRegistro;
    }

    void baja(String DNI){
        for (int i = 0; i < afiliados.length; i++) {
            if(afiliados[i].DNI.equals(DNI)){
                System.out.println("Deportista encontrado");
                afiliados[i] = afiliados[afiliados.length-1];
                afiliados = Arrays.copyOf(afiliados, afiliados.length -1);
            }
        }
    }

    void cambiarDatos(String DNI){
        for (int i = 0; i < afiliados.length; i++) {
            if(afiliados[i].DNI.equals(DNI)){
                System.out.println("Deportista encontrado");
                System.out.println("Introduce el nuevo nombre");
                afiliados[i].setNombre(new Scanner(System.in).nextLine());
                System.out.println("Introduce el nuevo deporte");
                afiliados[i].setDeporte(new Scanner(System.in).nextLine());
            }
        }
        mostrarAfiliados();
    }


    void mostrarAfiliados(){
        for (var deportista:afiliados) {
            System.out.println(deportista);
        }
    }

    void ordenarPorLaEdad(Club c){
        ComparaEdades cE = new ComparaEdades();
        Arrays.sort(c.afiliados, cE.reversed());
        c.mostrarAfiliados();
    }

    void ordenarPorElNombre(Club c){
        ComparaNombres cN = new ComparaNombres();
        Arrays.sort(c.afiliados, cN);
        c.mostrarAfiliados();
    }

    void guardarEnFichero(Club c){
        try(ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("club.data"))){
            flujoSalida.writeObject(c);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    Club leerDesdeFichero(){
        Club aux = new Club();
        try(ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("club.data"))){
            aux = (Club) flujoEntrada.readObject();
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        return aux;
    }


}
