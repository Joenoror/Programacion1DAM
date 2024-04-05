import java.util.Comparator;

public class ComparaNombres implements Comparator<Cliente> {
//    @Override
//    public int compare(Object o1, Object o2) {
//        return ((Cliente)o1).nombre.compareTo(((Cliente)o2).nombre);
//    }

    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.nombre.compareTo((o2.nombre));
    }
}
