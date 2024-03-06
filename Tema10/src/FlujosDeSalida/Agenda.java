package FlujosDeSalida;

import java.util.Arrays;
import java.util.Scanner;

public class Agenda {
    Contacto[] listaDeContactos = new Contacto[0];
    final int CONTACTOS_MAXIMOS = 20;


    void mostrarAgenda(){
        System.out.println("MUESTRO LA AGENDA:");
        for (int i = 0; i < listaDeContactos.length; i++) {
            System.out.println("["+i+"]" + listaDeContactos[i].toString());
        }
    }

    void buscarContacto(String claveDeBusqueda){
        System.out.println();
    }

    void aniadirContacto(Contacto contacto){
        if(listaDeContactos.length < CONTACTOS_MAXIMOS){
            listaDeContactos = Arrays.copyOf(listaDeContactos, listaDeContactos.length+1);
            System.out.println("Amplio el tamaño de la agenda, ahora tiene un total de " + listaDeContactos.length + " contactos.");
            listaDeContactos[listaDeContactos.length - 1] = contacto;
            System.out.println("Añado el contacto " + contacto.toString());
        }
        else {
            System.out.println("ERROR: Agenda completa.");
        }
    }

    Contacto crearContacto(){
        System.out.println("Introduce un nombre");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce un número de teléfono");
        String telefono = new Scanner(System.in).nextLine();

        Contacto nuevoContacto = new Contacto(nombre, telefono);
        return nuevoContacto;
    }

}
