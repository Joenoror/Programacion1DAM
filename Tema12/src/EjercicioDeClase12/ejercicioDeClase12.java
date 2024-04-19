package EjercicioDeClase12;

import java.io.*;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class ejercicioDeClase12 {
    public static void main(String[] args) {
        //CREAR NUESTRA COLECCIÓN.
        LinkedHashSet<Socio> socios = new LinkedHashSet<>();
        socios = metodos.leerDeFichero(socios);
        int opcion = -1;
        while(opcion!=6){
        try {
            while(opcion!=6){
                System.out.println("MENU\n" +
                        "1. Alta\n" +
                        "2. Baja\n" +
                        "3. Modificacion\n" +
                        "4. Listado por DNI\n" +
                        "5. Listado por antigüedad\n" +
                        "6. Salir\n");
                opcion = new Scanner(System.in).nextInt();

                switch (opcion){
                    case 1 -> metodos.aniadirSocio(socios);
                    case 2 -> metodos.borrarSocio(socios);
//                    case 3 -> metodos.modificarSocio(socios);
                    case 4 -> metodos.ordenarPorDNI(socios);
                    case 5 -> metodos.ordenarPorAntiguedad(socios);
                    case 6 -> metodos.guardarEnFichero(socios);
                }

            }
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        }

    }
}
