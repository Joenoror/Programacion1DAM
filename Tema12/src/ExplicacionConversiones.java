import java.util.*;

public class ExplicacionConversiones {
    public static void main(String[] args) {


        Integer[] arrayEnteros = new Integer[]{5,9,5,9,9,1,3};
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.addAll(Arrays.asList(arrayEnteros));
        System.out.println(listaEnteros);

        LinkedHashSet<Integer> coleccionEnteros = new LinkedHashSet<>(listaEnteros);
        System.out.println(coleccionEnteros);

        TreeSet<Integer> coleccionEnterosOrdenada = new TreeSet<>(coleccionEnteros);
        System.out.println(coleccionEnterosOrdenada);

    }
}
