public class Cliente implements Comparable<Cliente>{

    String dni;
    String nombre;
    //...
    @Override
    public int compareTo(Cliente o) {
        return dni.compareTo(o.dni);
    }
}
