package FlujosDeSalida;

import java.util.Arrays;
import java.util.Scanner;

public class Agenda {
    Contacto[] listaDeContactos = new Contacto[0];
    final private int CONTACTOS_MAXIMOS = 20;

    void mostrarAgenda(){
        System.out.println("MUESTRO LA AGENDA:");
        for (int i = 0; i < listaDeContactos.length; i++) {
            System.out.println("["+i+"]" + listaDeContactos[i].toString());
        }
    }

    void buscarContacto(){
        System.out.println("Introduce el contacto a buscar");
        String claveDeBusqueda = new Scanner(System.in).nextLine();
        System.out.println("CONTACTOS ENCONTRADOS:");
        for (int i = 0; i < listaDeContactos.length; i++) {
            if(listaDeContactos[i].nombre.contains(claveDeBusqueda)){
                System.out.println("["+i+"]" + listaDeContactos[i].toString());
            }
        }

//        for (var contacto: listaDeContactos) {
//            if(contacto.nombre.contains(claveDeBusqueda)){
//                System.out.println("["+contacto+"]" + contacto.toString());
//            }
//        }
    }

    boolean existeContacto(Contacto contacto){
        boolean existe = false;
        for (int i = 0; i < listaDeContactos.length; i++) {
            if(listaDeContactos[i].nombre.toLowerCase().equals(contacto.nombre.toLowerCase())){
                existe = true;
            }
        }
        return existe;
    }

    void aniadirContacto(Contacto contacto){
        if(listaDeContactos.length < CONTACTOS_MAXIMOS){
            if(!existeContacto(contacto)){
                listaDeContactos = Arrays.copyOf(listaDeContactos, listaDeContactos.length+1);
                //System.out.println("Amplio el tamaño de la agenda, ahora tiene un total de " + listaDeContactos.length + " contactos.");
                listaDeContactos[listaDeContactos.length - 1] = contacto;
                //System.out.println("Añado el contacto " + contacto.toString());
            } else System.out.println("ERROR: El contacto introducido ya existe.");
        } else System.out.println("ERROR: Agenda completa.");
    }

    Contacto crearContacto(){
        Contacto nuevoContacto = null;
        boolean nombreCorrecto = false;
        String nombre;
        String telefono;
        try{
            while(!nombreCorrecto){
                System.out.println("Introduce un nombre");
                nombre = new Scanner(System.in).nextLine();
                System.out.println("Introduce un número de teléfono");
                telefono = new Scanner(System.in).nextLine();
                //Ejemplo de posible comprobación
                if(telefono.length() == 9){
                    if(telefono.toLowerCase().matches("[0-9]*")){
                        nuevoContacto = new Contacto(nombre, telefono);
                        nombreCorrecto = true;
                    } else System.out.println("ERROR: Tu teléfono incluye caracteres que no son números");
                } else System.out.println("ERROR: Tu teléfono no tiene exactamente 9 números");
            }
        } catch (Exception e){
            System.out.println("Error al introducir la información");
        }
        return nuevoContacto;
    }

}
