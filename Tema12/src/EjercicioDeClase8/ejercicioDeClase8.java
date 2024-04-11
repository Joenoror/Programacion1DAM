package EjercicioDeClase8;

import java.util.*;

public class ejercicioDeClase8 {
    public static void main(String[] args) {

        Collection<Integer> collectionEnteros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            collectionEnteros.add(new Random().nextInt(0,101));
        }
        System.out.println("Colección de enteros aleatoria -->" + collectionEnteros);

        Integer[] arrayEnteros = collectionEnteros.toArray(new Integer[0]);
        Arrays.sort(arrayEnteros);

        System.out.println("Array de enteros ordenado de menor a mayor -->" + Arrays.deepToString(arrayEnteros));


        collectionEnteros.clear();
        collectionEnteros.addAll(Arrays.asList(arrayEnteros));

        System.out.println("Colección de enteros ordenada de menor a mayor -->" + collectionEnteros);

        Arrays.sort(arrayEnteros, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println("Array de enteros ordenado de mayor a menor -->" + Arrays.deepToString(arrayEnteros));

        collectionEnteros.clear();
        collectionEnteros.addAll(Arrays.asList(arrayEnteros));

        System.out.println("Colección de enteros ordenada de mayor a menor -->" + collectionEnteros);

    }
}
