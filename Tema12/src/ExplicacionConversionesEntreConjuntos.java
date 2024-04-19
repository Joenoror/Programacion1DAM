import EjercicioDeClase10.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExplicacionConversionesEntreConjuntos {
    public static void main(String[] args) {

        Cliente[] arrayDeClientees = new Cliente[]{new Cliente("001", "Jose", "17/10/1993")};

        System.out.println(Arrays.deepToString(arrayDeClientees));

        ArrayList<Cliente> listaDeClientees = new ArrayList<>();
        listaDeClientees.addAll(Arrays.asList(arrayDeClientees));

        System.out.println(listaDeClientees);

        listaDeClientees.add(new Cliente("010", "Maria", "01/01/1991"));
        listaDeClientees.add(new Cliente("005", "Sebas", "07/12/2010"));
        listaDeClientees.add(new Cliente("005", "Sebas", "07/12/2010"));
        listaDeClientees.add(new Cliente("005", "Sebas", "07/12/2010"));

        System.out.println(listaDeClientees);

        LinkedHashSet<Cliente> conjuntoDeClientees = new LinkedHashSet<>(listaDeClientees);

        System.out.println(conjuntoDeClientees);

        TreeSet<Cliente> conjuntoOrdenadoDeClientees = new TreeSet<>(conjuntoDeClientees);

        System.out.println(conjuntoOrdenadoDeClientees);





    }
}
