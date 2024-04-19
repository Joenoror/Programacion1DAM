import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExplicacionConjuntos {
    public static void main(String[] args) {


        //CREAMOS ARBOL DE CONJUNTOS, POR DEFECTO ORDENADOR POR EL ORDEN NATURAL/compareTo EN CASO DE ESTAR DECLARADO.
        LinkedHashSet<Integer> conjuntoEnteros = new LinkedHashSet<>();

        System.out.println("Elementos del conjunto -->" + conjuntoEnteros);

        System.out.println("Si intento añadir un elemento que no existe -->" + conjuntoEnteros.add(5));
        conjuntoEnteros.add(9);
        conjuntoEnteros.add(1);
//
//        //A PESAR DE HABERLOS INSERTADOS DESORDENADOS, EL ÁRBOL LOS ORDENA AUTOMÁTICMENTE
        System.out.println("Elementos del conjunto -->" + conjuntoEnteros);

        TreeSet<Integer> conjuntoEnterosOrdenado = new TreeSet<>();
        conjuntoEnterosOrdenado.addAll(conjuntoEnteros);
        System.out.println("Elementos del conjunto, pero con TreeSet -->" + conjuntoEnterosOrdenado);


//        //NO PUEDO AÑADIR ELEMENTOS QUE YA EXISTEN
        System.out.println("Si intento añadir un elemento que ya existe -->" + conjuntoEnteros.add(1));
        System.out.println("Elementos del conjunto -->" + conjuntoEnteros);
        System.out.println("Si intento añadir un elemento que ya existe -->" + conjuntoEnterosOrdenado.add(1));
        System.out.println("Elementos del conjunto -->" + conjuntoEnterosOrdenado);


    }
}
