package EjercicioDeClase10;

import java.util.TreeSet;

public class ejercicioDeClase10 {
    public static void main(String[] args) {
        //CREAMOS ARBOL DE CONJUNTOS, POR DEFECTO ORDENADOR POR EL ORDEN NATURAL/compareTo EN CASO DE ESTAR DECLARADO.

        TreeSet<Cliente> conjuntoDeClientees = new TreeSet<Cliente>();

        System.out.println("Elementos del conjunto -->" + conjuntoDeClientees);

        Cliente c1 = new Cliente("001","Paco", "17/10/1993");

        conjuntoDeClientees.add(c1);
//        conjuntoDeClientees.add(new Clientee("002","Marta", "05/05/2005"));

        System.out.println("Elementos del conjunto -->" + conjuntoDeClientees);


    }
}
