import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExplicacionArrayList {
    public static void main(String[] args) {
        List<Cliente> listaDeClientes = new ArrayList<>();
        Collection coleccionClientes  = listaDeClientes;
        coleccionClientes.add(new Cliente("001","Paco", "17/10/1993"));
        coleccionClientes.add(new Cliente("002","Marta", "05/05/1995"));
        Cliente nuevoCliente = new Cliente("038","Luis", "30/03/2004");
        coleccionClientes.add(nuevoCliente);
        System.out.println(coleccionClientes.toString());
//        coleccionClientes.remove(nuevoCliente);
//        System.out.println(coleccionClientes.toString());
//        coleccionClientes.remove("001");
//        System.out.println(coleccionClientes.toString());
//        coleccionClientes.remove(new Cliente("001","Paco", "17/10/1993"));
//        System.out.println(coleccionClientes.toString());
//        coleccionClientes.clear();
//        System.out.println(coleccionClientes.toString());
        System.out.println(coleccionClientes.size());
        System.out.println(coleccionClientes.isEmpty());
        System.out.println(coleccionClientes.contains(new Cliente("001","Maria", "10/01/2000")));
        System.out.println(coleccionClientes.contains(new Cliente("001")));
        System.out.println(coleccionClientes);

    }
}
