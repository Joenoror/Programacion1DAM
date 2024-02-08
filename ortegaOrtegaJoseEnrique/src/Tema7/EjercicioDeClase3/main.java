package Tema7.EjercicioDeClase3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del aula en el que vas a impartir clase");
        String nombreAula = sc.nextLine();
        System.out.println("Introduce la cantidad de alumnos que pueden entrar en el aula");
        int alumnosMaximos = sc.nextInt();

        Aula a = new Aula(alumnosMaximos, nombreAula);

        String sexoIntroducido = new Scanner(System.in).nextLine();
        Alumno a1 = new Alumno("Jose", 30, 5, Sexo.HOMBRE);
        Alumno a2 = new Alumno("Pedro", 23, 10, sexoIntroducido);
        System.out.println(a1.sexo);
        System.out.println(a2.sexo);

        if(alumnosMaximos != 0){
            System.out.println("Vemos que en el aula hay un total de " + alumnosMaximos + " alumnos.");
            System.out.println("Procederemos a rellenar con sus datos");
            a.rellenarAlumnos();
        }
        int opcion = 1;

        while(opcion != 0){
            System.out.println("1. Añadir un nuevo alumno");
            System.out.println("2. Mostrar la lista de alumnos de la clase");
            System.out.println("3. Abrir/Cerrar el aula");
            System.out.println("4. Mostrar datos del aula");
            System.out.println("0. Salir del programa");
            opcion = sc.nextInt();
            switch (opcion){
                case 1 -> a.alumnoNuevo();
                case 2 -> a.mostrarAlumnos();
                case 3 -> a.cambiarEstadoAula();
                case 4 -> a.mostrarDatosDelAula();
                case 0 -> System.out.println("HAS SELECCIONADO SALIR");
                default -> System.out.println("ERROR. No has seleccionado correctamente la opción");
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }






    }
}
