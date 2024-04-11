// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//


        //COLECCIÓN 1
        Collection coleccionClientes1  = new ArrayList<>();;
        coleccionClientes1.add(new Cliente("001","Paco", "17/10/1993"));
        coleccionClientes1.add(new Cliente("002","Marta", "05/05/2005"));

//COLECCIÓN 2
        Collection coleccionClientes2  = new ArrayList<>();;
        coleccionClientes2.add(new Cliente("001","Paco", "17/10/1993"));
        coleccionClientes2.add(new Cliente("002","Marta", "05/05/2005"));

        System.out.println("Compruebo que en la colección 1 se encuentre todo lo que hay en la 2 -->" + coleccionClientes1.containsAll(coleccionClientes2));
        System.out.println("Compruebo que en la colección 2 se encuentre todo lo que hay en la 1 -->" + coleccionClientes2.containsAll(coleccionClientes1));

        Cliente nuevoCliente = new Cliente("038","Luis", "30/03/2004");
        coleccionClientes1.add(nuevoCliente);


        System.out.println("Compruebo que en la colección 1 se encuentre todo lo que hay en la 2 -->" + coleccionClientes1.containsAll(coleccionClientes2));
        System.out.println("Compruebo que en la colección 2 se encuentre todo lo que hay en la 1 -->" + coleccionClientes2.containsAll(coleccionClientes1));







//
//        ArrayList<Cliente> listaDeClientes = new ArrayList<>();
//
//        Collection coleccionDeClientes = listaDeClientes;
//
//        Cliente c1 = new Cliente("0001", "Maria", "01/01/1995");
//        coleccionDeClientes.add(new Cliente("0000", "Paco", "10/10/2010"));
//        System.out.println(coleccionDeClientes.add(c1));
//        System.out.println(coleccionDeClientes);
//        System.out.println(coleccionDeClientes);
//        System.out.println(coleccionDeClientes.size());
//        System.out.println(coleccionDeClientes.isEmpty());
//        System.out.println(coleccionDeClientes);
//        System.out.println(coleccionDeClientes.contains(c1));
//        coleccionDeClientes.clear();
//        System.out.println(coleccionDeClientes);
//
//




//        System.out.println(coleccionDeClientes.remove("pepepeppepep"));
//        System.out.println(coleccionDeClientes);
//        System.out.println(coleccionDeClientes.remove(new Cliente("Paco")));
//        System.out.println(coleccionDeClientes);
//        System.out.println(coleccionDeClientes.remove(c1));
//        System.out.println(coleccionDeClientes);
//        Cliente c1 = new Cliente();
//        Contenedor<Integer> test = new Contenedor<>();
//        Integer[] listaDeIntegers = {1,2,3,6,9,null,0};
//        System.out.println(Contenedor.numeroDeNulos(listaDeIntegers));

//
//        Comparator<Integer> ordenInteger = Comparator.naturalOrder();
//
//        Comparator<Integer> ordenIntergerInverso = ordenInteger.reversed();
//
//        Arrays.sort(listaDeIntegers, ordenInteger);
//        System.out.println(Arrays.deepToString(listaDeIntegers));
//        Arrays.sort(listaDeIntegers, ordenIntergerInverso);
//        System.out.println(Arrays.deepToString(listaDeIntegers));

//        Contenedor c = new Contenedor();
//        c.guardar(7); //Se guarda 7 como Object
//        //Si quisiéramos extraerlo tendríamos que hacer el casting apropiado.
//        int numero = (int) c.extraer();
//        System.out.println(numero);
//        c.guardar("examen"); //Se guarda "examen" como Object
//        String cad = (String) c.extraer();
//        System.out.println(cad);


//
//        Contenedor<Integer> c = new Contenedor<>();
//        c.guardar(5);
//        Integer n = c.extraer();
//        System.out.println("El número extraido era un " + n);
//
//        Contenedor<String> s = new Contenedor<>();
//        s.guardar("HOLA");
//        String ns = s.extraer();
//        System.out.println("El string extraido era un " + ns);

//        Contenedor<Double> c1 = new Contenedor<>();
//        Contenedor<Socio> s1 = new Contenedor<>();
//
//        c1.guardar(4.6);
//        s1.guardar(new Socio("1", "LUCAS"));
//
//        double dato = c1.extraer();
//        System.out.println(dato);
//        String nombreSocio = s1.extraer().nombre;
//        System.out.println(nombreSocio);
//
//        //...


    }
}