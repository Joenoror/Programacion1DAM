package Tema7.EjercicioDeClase8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Menu();
    }

    static void Menu(){

        System.out.println("Introduce la longitud máxima de tu texto");
        int longitudMaxima = new Scanner(System.in).nextInt();
        String textoAIntroducir = "";
        Texto texto = new Texto(longitudMaxima);

        int opcion = 1;
        while(opcion != 0){

            System.out.println("INTRODUCE UNA OPCIÓN");
            System.out.println("1. Introduce un texto al principio.");
            System.out.println("2. Introduce un texto al final.");
            System.out.println("3. Mostrar texto.");
            System.out.println("4. Mostrar vocales.");
            System.out.println("5. Mostrar historial de cambios.");
            System.out.println("6. Mostrar información del texto.");
            System.out.println("0. Salir del programa.");

            opcion = new Scanner(System.in).nextInt();
            switch (opcion){
                case 1 -> {
                    textoAIntroducir = new Scanner(System.in).nextLine();
                    if(textoAIntroducir.length()==1) texto.agregarTexto(textoAIntroducir.toCharArray()[0], Posicion.DELANTE);
                    else texto.agregarTexto(textoAIntroducir, Posicion.DELANTE);
                }
                case 2 -> {
                    textoAIntroducir = new Scanner(System.in).nextLine();
                    if(textoAIntroducir.length()==1) texto.agregarTexto(textoAIntroducir.toCharArray()[0], Posicion.DETRAS);
                    else texto.agregarTexto(textoAIntroducir, Posicion.DETRAS);
                }
                case 3 -> System.out.println(texto.getCadena());
                case 4 ->         System.out.println("Cantidad de vocales: " + texto.obtenerVocales());
                case 5 -> texto.registroDeCambiosDetallado();
                case 6 -> texto.mostrarInformacion();
            }




        }
    }


}
