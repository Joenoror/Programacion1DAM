package EjercicioDeClase5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class ejercicioDeClase5 {
    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> listaEnteros = new ArrayList<>();
        Collection<Integer> collectionEnteros = listaEnteros;

        //APARTADO 1

        int contador = 20;
        while(contador > 0){
            collectionEnteros.add(random.nextInt(0,11));
            contador--;
        }

        System.out.println(collectionEnteros);

        //APARTADO 2

        ArrayList<Integer> listaSinRepeticiones = new ArrayList<>();

        for (Integer numero:collectionEnteros) {
            if(!listaSinRepeticiones.contains(numero)){
                listaSinRepeticiones.add(numero);
            }
        }

        System.out.println(listaSinRepeticiones);

    }
}
