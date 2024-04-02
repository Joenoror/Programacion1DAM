import java.io.Serializable;

public class Socio implements Serializable {
    int id;
    String nombre;

    Socio(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
