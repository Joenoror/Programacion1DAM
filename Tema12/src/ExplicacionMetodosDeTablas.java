import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ExplicacionMetodosDeTablas {
    public static void main(String[] args) {

        Collection coleccionClientes1  = new ArrayList<>();;
        coleccionClientes1.add(new Cliente("001","Paco", "17/10/1993"));
        coleccionClientes1.add(new Cliente("002","Marta", "05/05/2005"));

        System.out.println(coleccionClientes1);
        Object[] clientes = coleccionClientes1.toArray();
        System.out.println(Arrays.deepToString(clientes));
//        System.out.println(clientes[0].nombre); //NO LO RECONOCE
        System.out.println(((Cliente)clientes[0]).nombre); //DEBEMOS HACER UN CAST

        Cliente[] clientes2 = (Cliente[]) coleccionClientes1.toArray(new Cliente[0]);
        System.out.println(clientes2[0].nombre);

        String[] nombres = {"Jose", "Luis", "Michael", "Samantha"};
        Collection coleccionDeNombres = new ArrayList();
        coleccionDeNombres.addAll(Arrays.asList(nombres));
        System.out.println(coleccionDeNombres);





    }
}
