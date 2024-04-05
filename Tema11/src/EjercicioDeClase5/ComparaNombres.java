package EjercicioDeClase5;

import java.util.Comparator;

public class ComparaNombres implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Deportista)o1).nombre.compareTo(((Deportista)o2).nombre);
    }
}
