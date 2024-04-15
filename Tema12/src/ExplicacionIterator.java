import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class ExplicacionIterator {
    public static void main(String[] args) {

        ArrayList<Client> listaDeClientes = new ArrayList<Client>();
        Collection<Client> numeros = listaDeClientes;

        listaDeClientes.add(new Client("001","Paco", "17/10/1993"));
        listaDeClientes.add(new Client("002","Marta", "05/05/2005"));

        Iterator<Client> it = numeros.iterator();

        for (; it.hasNext(); ) {
            Client p = it.next();
            if(p.nombre.equals("Paco")){
                it.remove();
            }
            System.out.println(p);
        }

        System.out.println(listaDeClientes);


    }
}
