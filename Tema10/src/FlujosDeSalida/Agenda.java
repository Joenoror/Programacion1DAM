package FlujosDeSalida;

import xml.Club;
import xml.Socio;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

@XmlRootElement(name="agenda") //El elemento raíz se llamará socio
@XmlType(propOrder = {"listaDeContactos"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Agenda {
    @XmlElementWrapper(name = "contactos")
    @XmlElement(name = "contacto")
    Contacto[] listaDeContactos = new Contacto[0];
    @XmlTransient
    final int CONTACTOS_MAXIMOS = 20;

    static void exportarXML(Agenda agenda){
        try{
            JAXBContext context = JAXBContext.newInstance(Agenda.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(agenda, new FileWriter(".\\Tema10\\src\\xml\\agenda.xml"));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

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
                if(telefono.length() == 9){ //Se puede omitir esto cambiando la exp. reg. poniendo *9?
                    if(telefono.matches("[0-9]*")){
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
