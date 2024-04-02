// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Contenedor<?> cObj = new Contenedor<Integer>();


        Contenedor<Integer> test = new Contenedor<>();
        Integer[] listaDeIntegers = {1,2,3,6,9,null,0};
        System.out.println(Contenedor.numeroDeNulos(listaDeIntegers));

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