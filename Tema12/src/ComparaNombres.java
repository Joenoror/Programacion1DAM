public class ComparaNombres implements Comparator<Cliente>{
    @Override
    public int comparable(Cliente o1, Cliente o2) {
        return o1.nombre.compareTo(o2.nombre);
    }
}
