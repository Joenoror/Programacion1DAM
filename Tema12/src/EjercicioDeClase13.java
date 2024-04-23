import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class EjercicioDeClase13 {
    public static void main(String[] args) {

        Random random = new Random();

        TreeSet<Integer> conjunto1 = new TreeSet<>();
        TreeSet<Integer> conjunto2 = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            conjunto1.add(random.nextInt(0,10));
            conjunto2.add(random.nextInt(0,10));
        }

        System.out.println(conjunto1);
        System.out.println(conjunto2);


        TreeSet<Integer> conjuntoUnion = new TreeSet<>(union(conjunto1,conjunto2));
        TreeSet<Integer> conjuntoInterseccion = new TreeSet<>(interseccion(conjunto1,conjunto2));
        System.out.println(conjuntoUnion);
        System.out.println(conjuntoInterseccion);

    }

    static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2){
        Set<E> conjunto3 = new LinkedHashSet<>(conjunto1);
        conjunto3.addAll(conjunto2);
        return conjunto3;
    }
    static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2){
        Set<E> conjunto3 = new LinkedHashSet<>();
        for (E value:conjunto1) {
            if(conjunto2.contains(value)){
                conjunto3.add(value);
            }
        }
        return conjunto3;
    }


}
