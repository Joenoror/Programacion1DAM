package EjercicioDeClase4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.function.Predicate;

public class EjercicioDeClase4 {
    public static void main(String[] args) {

        ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
        Collection<Integer> numeros = listaDeNumeros;

        //APARTADO 1 - INTRODUCIR LOS NÚMEROS

        System.out.println("Introduce números.\n-1 si quieres salir.");
        Integer n = new Scanner(System.in).nextInt();
        while(n != -1){
            numeros.add(n);
            System.out.println("Introduce -1 si quieres salir.");
            n = new Scanner(System.in).nextInt();
        }

        //APARTADO 2 - MOSTRAR LA COLECCIÓN

        System.out.println(numeros);

        //APARTADO 3 - MOSTRAR ÚNICAMENTE LOS VALORES PARES

        for (Integer numero:numeros) {
            if((numero)%2 == 0){
                System.out.print(numero + " ");
            }
        }

        //APARTADO 4 - ELIMINAR LOS MÚLTIPLOS DE 3

        //OPCIÓN 1
        Predicate<Integer> predicado = a -> (a%3 == 0);
        numeros.removeIf(predicado);
        System.out.println(numeros);

        //OPCIÓN 2
//        ArrayList<Integer> temporal = new ArrayList<>();
//        for (Integer numero:numeros) {
//            if((numero)%3 == 0){
//                temporal.add(numero);
//            }
//        }
//        System.out.println(temporal);


    }
}

//Borrar todos los elementos en función de una condición
//        Predicate<Integer> pr= a->(a%3 == 0);
//        numeros.removeIf(pr);
