package EjercicioDeClase3;

import java.util.Random;
import java.util.Scanner;

public class EjercicioDeClase3 {
    public static void main(String[] args) {


        Integer[] tabla = new Integer[0];
        Contenedor<Integer> contenedor = new Contenedor<>(tabla);

        for (int i = 0; i < 5; i++) {
            contenedor.insertarAlFinal(new Random().nextInt(10));
            contenedor.insertarAlPrincipio(new Random().nextInt(10));
        }
        contenedor.mostrar();
        for (int i = 0; i < 3; i++) {
            contenedor.extraerDelFinal();
            contenedor.extraerDelPrincipio();
        }
        contenedor.mostrar();
        contenedor.ordenar();
        contenedor.mostrar();

        Integer n = new Scanner(System.in).nextInt();
        while(n!=-1){
            contenedor.apilar(n);
            n = new Scanner(System.in).nextInt();
        }
        contenedor.mostrar();

        while(n!=null){
            n = contenedor.desapilar();
        }

        contenedor.mostrar();


    }
}
