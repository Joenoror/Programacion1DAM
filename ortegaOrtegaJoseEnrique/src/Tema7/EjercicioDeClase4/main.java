package Tema7.EjercicioDeClase4;

import java.util.Scanner;
import java.time.LocalTime;

public class main {
    public static void main(String[] args) {
        int opcion = 1;
        Scanner sc = new Scanner(System.in);
        CuentaCorriente c = null;
        //Crear una cuenta
        //Sacar dinero

        LocalTime horaActual;

//        Gestor gestor1 = new Gestor("Paco", "+34957777777");
//        Gestor gestor2 = new Gestor("Paco", "+34957777777");

        while (opcion != 0){
            System.out.println("POSIBLES OPCIONES");
            System.out.println("1 - CREAR CUENTA");
            System.out.println("2 - SACAR DINERO");
            System.out.println("3 - INGRESAR DINERO");
            System.out.println("4 - MOSTRAR INFORMACIÓN");

            opcion = sc.nextInt();
            switch (opcion){
                case 1 -> c = crearCuenta();
                case 2 -> {
                    if(c != null) c.sacarDinero();
                    else{
                        System.out.println("ERROR: NO HAS CREADO UNA CUENTA");
                    }
                }
                case 3 ->{
                    if(c!= null) c.ingresarDinero();
                    else{
                        System.out.println("ERROR: NO HAS CREADO UNA CUENTA");
                    }
                }
                case 4 ->{
                    if(c != null) c.mostrarInformacion();
                    else{
                        System.out.println("ERROR: NO HAS CREADO UNA CUENTA");
                    }
                }
                default -> System.out.println("ERROR");
            }
        }



    }

    public static CuentaCorriente crearCuenta(){
        Scanner sc = new Scanner(System.in);
        CuentaCorriente cuentaNueva;

        System.out.println("Introduce tu dni");
        String dni = sc.nextLine();
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();

        cuentaNueva = new CuentaCorriente(dni, nombre);

        return cuentaNueva;
    }




}
