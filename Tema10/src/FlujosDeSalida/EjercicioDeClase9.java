package FlujosDeSalida;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioDeClase9 {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        try (BufferedReader in = new BufferedReader(new FileReader(".\\Archivos\\listaDeContactos.txt")))
        {

            String intentoDeLectura = in.readLine();
            while(intentoDeLectura != null)
            {
                String[] separacion = intentoDeLectura.split(" ");
                agenda.aniadirContacto(new Contacto(separacion[0],separacion[1]));
                intentoDeLectura = in.readLine();
            }

            int opcion = -1;
            while (opcion != 4){
                Menu();
                try {
                    opcion = new Scanner(System.in).nextInt();

                    switch (opcion){
                        case 1 -> agenda.aniadirContacto(agenda.crearContacto());
                        case 2 -> System.out.println("Aquí va el método de buscar un contacto");
                        case 3 -> agenda.mostrarAgenda();
                        default -> System.out.println("ERROR. Opción no válida");
                    }


                } catch (Exception e){
                    System.out.println("Has introducido mal el valor solicitado.");
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
        System.out.println("-2. BUscar contacto-");
        System.out.println("-3. Mostrar contactos-");
        System.out.println("-4. Salir-");
        System.out.println("---------------------------");
        System.out.println("Inserte un valor entre 1 y 4");
        System.out.println("---------------------------");
    }

}
