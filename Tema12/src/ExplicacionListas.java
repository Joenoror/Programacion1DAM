import java.util.ArrayList;
import java.util.Comparator;

public class ExplicacionListas {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeEnteros = new ArrayList<>();
        listaDeEnteros.add(3);
        listaDeEnteros.add(7);
        listaDeEnteros.add(8);
        listaDeEnteros.add(1);
        listaDeEnteros.add(-5);
        System.out.println(listaDeEnteros);
        System.out.println(listaDeEnteros.get(2));
        System.out.println(listaDeEnteros.get(listaDeEnteros.size()-1));
        listaDeEnteros.set(2, -1);
        System.out.println(listaDeEnteros);
        listaDeEnteros.add(2, 5);
        System.out.println(listaDeEnteros);
        ArrayList<Integer> listaDeEnteros2 = new ArrayList<>();
        listaDeEnteros2.add(1);
        listaDeEnteros2.add(4);

        System.out.print("La nueva lista1 será, la suma de la lista 1: " + listaDeEnteros + " y la suma de la lista 2: " + listaDeEnteros2 + " = ");
        listaDeEnteros.addAll(listaDeEnteros2);
        System.out.println(listaDeEnteros);
        listaDeEnteros.remove(5);
        System.out.println(listaDeEnteros);
        listaDeEnteros.remove(Integer.valueOf(5));
        System.out.println(listaDeEnteros);

        System.out.println(listaDeEnteros.indexOf(1));
        System.out.println(listaDeEnteros.lastIndexOf(1));
        System.out.println(listaDeEnteros.equals(listaDeEnteros2));
        listaDeEnteros.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(listaDeEnteros);
        listaDeEnteros.sort(Comparator.naturalOrder());
        System.out.println(listaDeEnteros);


    }
}
