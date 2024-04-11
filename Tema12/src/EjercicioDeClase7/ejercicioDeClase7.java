package EjercicioDeClase7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class ejercicioDeClase7 {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        Collection<Integer> collectionEnteros = listaEnteros;

        ArrayList<Integer> listaEnteros2 = new ArrayList<>();
        Collection<Integer> collectionEnteros2 = listaEnteros2;

        collectionEnteros2.add(5);


        //APARTADO 1

        for (int i = 0; i < 100; i++) {
            collectionEnteros.add(new Random().nextInt(0,11));
        }
        System.out.println(collectionEnteros);

        //APARTADO 2

        collectionEnteros.removeAll(collectionEnteros2);
        System.out.println(collectionEnteros);

        //APARTADO 3

        ArrayList<Integer> listaEnteros3 = new ArrayList<>();
        Collection<Integer> collectionEnteros3 = listaEnteros3;

        for (Iterator<Integer> it = collectionEnteros.iterator();it.hasNext();){
            Integer n = it.next();
            if(!(n%2 == 0)){
                collectionEnteros3.add(n);
            }
        }
        System.out.println(collectionEnteros3);
        collectionEnteros.removeAll(collectionEnteros3);
        System.out.println(collectionEnteros);

        //APARTADO 4

        ArrayList<Integer> listaEnteros4 = new ArrayList<>();
        Collection<Integer> collectionEnteros4 = listaEnteros4;

        for (int i = 0; i < 30; i++) {
            collectionEnteros4.add(new Random().nextInt(0,11));
        }
        collectionEnteros.addAll(collectionEnteros4);
        System.out.println(collectionEnteros);







    }
}
