import java.util.*;
import java.util.Comparator;
import EjercicioDeClase10.Cliente;

public class ExplicacionMetodosCollections {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.addAll(Arrays.asList(new Integer[]{5,9,5,9,9,1,3}));
        System.out.println(listaEnteros);
        Collections.sort(listaEnteros);
        System.out.println(listaEnteros);
        System.out.println(Collections.binarySearch(listaEnteros, 5));

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente("035","Paco", "17/10/1993"));
        Cliente nuevo = new Cliente("002","Marta", "05/05/2005");
        listaClientes.add(nuevo);
        listaClientes.add(new Cliente("038","Luis", "30/03/2004"));
        System.out.println(listaClientes);
        Collections.sort(listaClientes, new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.dni.compareTo(o2.dni);
            }
        });
        System.out.println(listaClientes);

        int indice = Collections.binarySearch(listaClientes, nuevo);
        System.out.println(indice);

        Comparator<Cliente> ComparaNombres = new Comparator<Cliente>(){

            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.nombre.compareTo(o2.nombre);
            }
        };

        Collections.sort(listaClientes, ComparaNombres);
        System.out.println(listaClientes);

        indice = Collections.binarySearch(listaClientes, new Cliente("Paco"), ComparaNombres);
        System.out.println(indice);

        System.out.println(listaEnteros);
        Collections.swap(listaEnteros, 0, 3);

        System.out.println(listaEnteros);
        Collections.replaceAll(listaEnteros,5, 10);
        System.out.println("listaEnteros --> " + listaEnteros);
        ArrayList<Integer> listaEnterosNueva = new ArrayList<>(List.of(new Integer[]{4, 7, 8, 1, 2, 3, 4}));
        System.out.println("listaEnterosNueva --> " + listaEnterosNueva);
        Collections.copy(listaEnteros, listaEnterosNueva);
        System.out.println("listaEnteros tras copiar el contenido de la listaEnterosNueva en listaEnteros--> " + listaEnteros);
        System.out.println("listaEnteros --> " + listaEnteros);
        Collections.shuffle(listaEnteros);
        System.out.println("listaEnteros --> " + listaEnteros);
        System.out.println(Collections.frequency(listaEnteros, 4));
        System.out.println(Collections.max(listaEnteros));
        System.out.println(Collections.min(listaEnteros));


        System.out.println(listaClientes);
        System.out.println(Collections.max(listaClientes));
        System.out.println(Collections.max(listaClientes, new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.dni.compareTo(o2.dni);
            }
        }));

        System.out.println(listaEnteros);
        Collections.reverse(listaEnteros);
        System.out.println(listaEnteros);
        System.out.println(listaEnteros.removeAll(Collections.singleton(4)));




    }

}
