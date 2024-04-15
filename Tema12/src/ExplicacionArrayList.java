import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ExplicacionArrayList {
    public static void main(String[] args) {
        List<Cliente> listaDeClientes = new ArrayList<>();
        Collection coleccionClientes  = listaDeClientes;
        coleccionClientes.add(new Client("001","Paco", "17/10/1993"));
        coleccionClientes.add(new Client("002","Marta", "05/05/2005"));
        Client nuevoCliente = new Client("038","Luis", "30/03/2004");
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
        System.out.println(coleccionClientes.contains(new Client("001","Maria", "10/01/2001")));
        System.out.println(coleccionClientes.contains(new Client("001")));
//        System.out.println(coleccionClientes);

        Iterator<Client> it = coleccionClientes.iterator();
        while(it.hasNext()){
            Client p = it.next();
            if(p.fechaNacimiento.compareTo(LocalDate.of(2000,1,1)) < 0){
                it.remove();
            }
        }

        for (Object c : coleccionClientes) {
            System.out.println(c);
        }



    }
}
