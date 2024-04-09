import java.util.ArrayList;
import java.util.Collection;

public class ExplicacionMetodosGlobales {
    public static void main(String[] args) {

        //ejemploDeContainsAll();
        //ejemploDeAddAll();
        //ejemploDeRemoveAll();
        //ejemploDeRetainAll();
    }

    static void ejemploDeContainsAll(){
        //COLECCIÓN 1
        Collection coleccionClientes1  = new ArrayList<>();;
        coleccionClientes1.add(new Cliente("001","Paco", "17/10/1993"));
        coleccionClientes1.add(new Cliente("002","Marta", "05/05/2005"));

        //COLECCIÓN 2
        Collection coleccionClientes2  = new ArrayList<>();;
        coleccionClientes2.add(new Cliente("001","Paco", "17/10/1993"));
        coleccionClientes2.add(new Cliente("002","Marta", "05/05/2005"));

        System.out.println("Compruebo que en la colección 1 se encuentre todo lo que hay en la 2 --> " + coleccionClientes1.containsAll(coleccionClientes2));
        System.out.println("Compruebo que en la colección 2 se encuentre todo lo que hay en la 1 --> " + coleccionClientes2.containsAll(coleccionClientes1));

        Cliente nuevoCliente = new Cliente("038","Luis", "30/03/2004");
        coleccionClientes1.add(nuevoCliente);

        System.out.println("Compruebo que en la colección 2 se encuentre todo lo que hay en la 1 --> " + coleccionClientes2.containsAll(coleccionClientes1));
    }

    static void ejemploDeAddAll(){
        //COLECCIÓN 1
        Collection coleccionClientes1  = new ArrayList<>();;
        coleccionClientes1.add(new Cliente("001","Paco", "17/10/1993"));
        coleccionClientes1.add(new Cliente("002","Marta", "05/05/2005"));

        //COLECCIÓN 2
        Collection coleccionClientes2  = new ArrayList<>();;
        coleccionClientes2.add(new Cliente("001","Paco", "17/10/1993"));
        coleccionClientes2.add(new Cliente("002","Marta", "05/05/2005"));

        System.out.println("Compruebo que puedo añadir todo lo de la 1 en la 2 --> " + coleccionClientes2.addAll(coleccionClientes1));

        System.out.println(coleccionClientes2);

    }

    static void ejemploDeRemoveAll(){
        //COLECCIÓN 1
        Collection coleccionClientes1  = new ArrayList<>();;
        coleccionClientes1.add(new Cliente("001","Paco", "17/10/1993"));
        coleccionClientes1.add(new Cliente("002","Marta", "05/05/2005"));
        coleccionClientes1.add(new Cliente("003","Fernando", "01/07/2000"));

        //COLECCIÓN 2
        Collection coleccionClientes2  = new ArrayList<>();;
        coleccionClientes2.add(new Cliente("001","Paco", "17/10/1993"));
        coleccionClientes2.add(new Cliente("002","Marta", "05/05/2005"));

        System.out.println(coleccionClientes1);
        System.out.println("Borro todo lo de la 2 en la 1 --> " + coleccionClientes1.removeAll(coleccionClientes2));
        System.out.println(coleccionClientes1);

    }

    static void ejemploDeRetainAll(){
        //COLECCIÓN 1
        Collection coleccionClientes1  = new ArrayList<>();;
        coleccionClientes1.add(new Cliente("001","Paco", "17/10/1993"));
        coleccionClientes1.add(new Cliente("002","Marta", "05/05/2005"));
        coleccionClientes1.add(new Cliente("003","Fernando", "01/07/2000"));

        //COLECCIÓN 2
        Collection coleccionClientes2  = new ArrayList<>();;
        coleccionClientes2.add(new Cliente("001","Paco", "17/10/1993"));
        coleccionClientes2.add(new Cliente("002","Marta", "05/05/2005"));

        System.out.println(coleccionClientes1);
        System.out.println("Borro todo lo que no sea similar de la 2 con la 1 --> " + coleccionClientes1.retainAll(coleccionClientes2));
        System.out.println(coleccionClientes1);

    }

}
