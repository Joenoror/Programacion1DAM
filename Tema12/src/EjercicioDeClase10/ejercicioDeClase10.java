package EjercicioDeClase10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ejercicioDeClase10 {
    public static void main(String[] args) {
        //CREAMOS ARBOL DE CONJUNTOS, POR DEFECTO ORDENADOR POR EL ORDEN NATURAL/compareTo EN CASO DE ESTAR DECLARADO.

        TreeSet<Cliente> conjuntoDeClientes = new TreeSet<Cliente>();

        System.out.println("Elementos del conjunto -->" + conjuntoDeClientes);

        Cliente c1 = new Cliente("005","Paco", "17/10/1993");
        conjuntoDeClientes.add(c1);
        conjuntoDeClientes.add(new Cliente("001","Luis", "10/10/1990"));
        conjuntoDeClientes.add(new Cliente("004","Sergio", "05/12/2001"));
        conjuntoDeClientes.add(new Cliente("003","Angela", "07/04/2009"));
        conjuntoDeClientes.add(new Cliente("002","Maria", "19/05/1985"));

        //ORDENADO EN FUNCIÓN DEL DNI(COMPARE TO)
        System.out.println(conjuntoDeClientes);

        TreeSet<Cliente> conjuntoDeClientesOrdenadoPorEdad = new TreeSet<>(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.edad() - o2.edad();
            }
        });
        conjuntoDeClientesOrdenadoPorEdad.addAll(conjuntoDeClientes);
        System.out.println(conjuntoDeClientesOrdenadoPorEdad);

        TreeSet<Cliente> conjuntoDeClientesOrdenadoPorNombre = new TreeSet<>(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.nombre.compareTo(o2.nombre);
            }
        });
        conjuntoDeClientesOrdenadoPorNombre.addAll(conjuntoDeClientes);
        System.out.println(conjuntoDeClientesOrdenadoPorNombre);

    }
}
