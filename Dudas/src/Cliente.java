public class Cliente implements Comparable<Cliente>{
    String nombre;
    String dni;

    Cliente(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public int compareTo(Cliente o) {
        return dni.compareTo(o.dni);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
