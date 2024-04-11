package EjercicioDeClase6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class ejercicioDeClase6 {
    public static void main(String[] args) {


        ArrayList<Integer> listaEnteros = new ArrayList<>();
        Collection<Integer> collectionEnteros = listaEnteros;

        //APARTADO 1

        for (int i = 0; i < 100; i++) {
            collectionEnteros.add(new Random().nextInt(0,11));
        }
        System.out.println(collectionEnteros);

        //APARTADO 2


        for(Iterator<Integer> it = collectionEnteros.iterator();it.hasNext();){
            Integer n = it.next();
            if(n == 5){
                it.remove();
            }
        }
        System.out.println(collectionEnteros);

        //APARTADO 3
        for(Iterator<Integer> it = collectionEnteros.iterator();it.hasNext();){
            Integer n = it.next();
            if(!(n%2 == 0)){
                it.remove();
            }
        }
        System.out.println(collectionEnteros);

    }
}
