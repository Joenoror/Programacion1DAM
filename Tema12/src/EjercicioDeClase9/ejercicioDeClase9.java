package EjercicioDeClase9;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicioDeClase9 {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnterosPositivos = new ArrayList<>();

        try{

            Integer n = new Scanner(System.in).nextInt();
            while(n>=0){
                listaEnterosPositivos.add(n);
                n = new Scanner(System.in).nextInt();
            }
            int cont = 0;
            for (Integer enteroPositivo : listaEnterosPositivos) {
                if(enteroPositivo%2 == 0){
                    System.out.println(enteroPositivo + " es par.");
                    System.out.println("El índice de " + enteroPositivo + " es " + cont + " y x100 es --> " + enteroPositivo*100);
                }
                cont++;
            }



        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
