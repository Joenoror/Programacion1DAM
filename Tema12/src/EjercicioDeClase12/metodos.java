package EjercicioDeClase12;

import EjercicioDeClase10.Cliente;
import com.sun.source.tree.Scope;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class metodos {

    static LinkedHashSet<Socio> aniadirSocio(LinkedHashSet<Socio> socios){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un dni");
        String dni = sc.nextLine();
        System.out.println("Introduce un nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce la fecha de alta");
        String fechaAlta = sc.nextLine();

        socios.add(new Socio(socios.size(),dni, nombre, fechaAlta));

        return socios;
    }

    static void borrarSocio(LinkedHashSet<Socio> socios){

        Socio aux = new Socio();

        boolean borrado = false;
        while (!borrado){
            System.out.println("Introduce el dni del socio que quieres borrar.");
            System.out.println("Si te has equivocado escribe -1");
            String dni = new Scanner(System.in).nextLine();

            if(socios.contains(new Socio(dni))){
                socios.remove(new Socio(dni));
                borrado = true;
            }else if(dni.equals("-1")){
                borrado = true;
            }else System.out.println("Has introducido mal el dni. Repite de nuevo.");

        }
    }

//    public static LinkedHashSet<Socio> modificarSocio(LinkedHashSet<Socio> socios){
//
//
//
//    }

    public static void ordenarPorDNI(LinkedHashSet<Socio> socios){
        TreeSet<Socio> sociosOrdenadosPorDNI = new TreeSet<>();
        sociosOrdenadosPorDNI.addAll(socios);
        System.out.println(sociosOrdenadosPorDNI);

    }
    public static void ordenarPorAntiguedad(LinkedHashSet<Socio> socios){

        TreeSet<Socio> sociosOrdenadosPorAntiguedad = new TreeSet<>(new Comparator<Socio>() {
            @Override
            public int compare(Socio o1, Socio o2) {

                int comparacion = 0;

                if(o2.antiguedad() - o1.antiguedad() == 0){
                    comparacion = o1.dni.compareTo(o2.dni);
                }
                else{
                    comparacion = o2.antiguedad() - o1.antiguedad();
                }

                return comparacion;
            }
        });

        sociosOrdenadosPorAntiguedad.addAll(socios);
        System.out.println(sociosOrdenadosPorAntiguedad);

    }


    //FICHEROS

    public static void guardarEnFichero(LinkedHashSet<Socio> socios){
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("socios.dat"))){
            outputStream.writeObject(socios);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static LinkedHashSet<Socio> leerDeFichero(LinkedHashSet<Socio> socios){
        try(ObjectInputStream output = new ObjectInputStream(new FileInputStream("socios.dat"))){
            socios = (LinkedHashSet<Socio>) output.readObject();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return socios;
    }


}
