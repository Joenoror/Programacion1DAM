package FlujosDeSalida;

import xml.Club;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioDeClase9 {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        System.out.println("Introduce un 1 si quieres leer los datos desde XML");


        try{
            JAXBContext context = JAXBContext.newInstance(Agenda.class);
            Unmarshaller um = context.createUnmarshaller();
            agenda = (Agenda) um.unmarshal(new File(".\\Tema10\\src\\xml\\agenda.xml"));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        try (BufferedReader in = new BufferedReader(new FileReader(".\\Archivos\\listaDeContactos.txt")))
        {
            //INTRODUZCO LOS DATOS DE MI FICHERO EN MI AGENDA
            String intentoDeLectura = in.readLine();
            while(intentoDeLectura != null)
            {
                String[] separacion = intentoDeLectura.split(";");
                agenda.aniadirContacto(new Contacto(separacion[0],separacion[1]));
                intentoDeLectura = in.readLine();
            }

            int opcion = -1;
            while (opcion != 5){
                Menu();
                try {
                    opcion = new Scanner(System.in).nextInt();

                    switch (opcion){
                        case 1 -> agenda.aniadirContacto(agenda.crearContacto());
                        case 2 -> agenda.buscarContacto();
                        case 3 -> agenda.mostrarAgenda();
                        case 4 -> Agenda.exportarXML(agenda);
                        case 5 -> System.out.println("HAS SELECCIONADO SALIR DE LA AGENDA");
                        default -> System.out.println("ERROR. Opción no válida");
                    }
                } catch (Exception e){
                    System.out.println("ERROR. Opción no disponible.");
                }

            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        try(BufferedWriter out = new BufferedWriter(new FileWriter(".\\Archivos\\listaDeContactos.txt"))){
            for (var contacto: agenda.listaDeContactos) {
                out.write(contacto.toString());
                out.newLine();
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    static void Menu(){
        System.out.println("------AGENDA PERSONAL------");
        System.out.println("-1. Nuevo contacto-");
        System.out.println("-2. Buscar contacto-");
        System.out.println("-3. Mostrar contactos-");
        System.out.println("-4. Exportar XML-");
        System.out.println("-5. Salir-");
        System.out.println("---------------------------");
        System.out.println("Inserte un valor entre 1 y 5");
        System.out.println("---------------------------");
    }

}
