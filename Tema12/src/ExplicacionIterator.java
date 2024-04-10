import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class ExplicacionIterator {
    public static void main(String[] args) {

        ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
        Collection<Cliente> numeros = listaDeClientes;

        listaDeClientes.add(new Cliente("001","Paco", "17/10/1993"));
        listaDeClientes.add(new Cliente("002","Marta", "05/05/2005"));

        Iterator<Cliente> it = numeros.iterator();

        for (; it.hasNext(); ) {
            Cliente p = it.next();
            if(p.nombre.equals("Paco")){
                it.remove();
            }
            System.out.println(p);
        }

        System.out.println(listaDeClientes);


    }
}
