package EjercicioDeClase5;

import java.util.Comparator;

public class ComparaEdades implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Deportista)o1).getEdad() - ((Deportista)o2).getEdad();
    }
}
