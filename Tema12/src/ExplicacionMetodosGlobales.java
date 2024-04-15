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
        Collection coleccionClients1  = new ArrayList<>();;
        coleccionClients1.add(new Client("001","Paco", "17/10/1993"));
        coleccionClients1.add(new Client("002","Marta", "05/05/2005"));

        //COLECCIÓN 2
        Collection coleccionClients2  = new ArrayList<>();;
        coleccionClients2.add(new Client("001","Paco", "17/10/1993"));
        coleccionClients2.add(new Client("002","Marta", "05/05/2005"));

        System.out.println("Compruebo que en la colección 1 se encuentre todo lo que hay en la 2 --> " + coleccionClients1.containsAll(coleccionClients2));
        System.out.println("Compruebo que en la colección 2 se encuentre todo lo que hay en la 1 --> " + coleccionClients2.containsAll(coleccionClients1));

        Client nuevoClient = new Client("038","Luis", "30/03/2004");
        coleccionClients1.add(nuevoClient);

        System.out.println("Compruebo que en la colección 2 se encuentre todo lo que hay en la 1 --> " + coleccionClients2.containsAll(coleccionClients1));
    }

    static void ejemploDeAddAll(){
        //COLECCIÓN 1
        Collection coleccionClients1  = new ArrayList<>();;
        coleccionClients1.add(new Client("001","Paco", "17/10/1993"));
        coleccionClients1.add(new Client("002","Marta", "05/05/2005"));

        //COLECCIÓN 2
        Collection coleccionClients2  = new ArrayList<>();;
        coleccionClients2.add(new Client("001","Paco", "17/10/1993"));
        coleccionClients2.add(new Client("002","Marta", "05/05/2005"));

        System.out.println("Compruebo que puedo añadir todo lo de la 1 en la 2 --> " + coleccionClients2.addAll(coleccionClients1));

        System.out.println(coleccionClients2);

    }

    static void ejemploDeRemoveAll(){
        //COLECCIÓN 1
        Collection coleccionClients1  = new ArrayList<>();;
        coleccionClients1.add(new Client("001","Paco", "17/10/1993"));
        coleccionClients1.add(new Client("002","Marta", "05/05/2005"));
        coleccionClients1.add(new Client("003","Fernando", "01/07/2000"));

        //COLECCIÓN 2
        Collection coleccionClients2  = new ArrayList<>();;
        coleccionClients2.add(new Client("001","Paco", "17/10/1993"));
        coleccionClients2.add(new Client("002","Marta", "05/05/2005"));

        System.out.println(coleccionClients1);
        System.out.println("Borro todo lo de la 2 en la 1 --> " + coleccionClients1.removeAll(coleccionClients2));
        System.out.println(coleccionClients1);

    }

    static void ejemploDeRetainAll(){
        //COLECCIÓN 1
        Collection coleccionClients1  = new ArrayList<>();;
        coleccionClients1.add(new Client("001","Paco", "17/10/1993"));
        coleccionClients1.add(new Client("002","Marta", "05/05/2005"));
        coleccionClients1.add(new Client("003","Fernando", "01/07/2000"));

        //COLECCIÓN 2
        Collection coleccionClients2  = new ArrayList<>();;
        coleccionClients2.add(new Client("001","Paco", "17/10/1993"));
        coleccionClients2.add(new Client("002","Marta", "05/05/2005"));

        System.out.println(coleccionClients1);
        System.out.println("Borro todo lo que no sea similar de la 2 con la 1 --> " + coleccionClients1.retainAll(coleccionClients2));
        System.out.println(coleccionClients1);

    }

}
