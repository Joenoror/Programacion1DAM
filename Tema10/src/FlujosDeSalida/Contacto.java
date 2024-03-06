package FlujosDeSalida;

public class Contacto {
    String nombre;
    String telefono;

    Contacto(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre+" "+telefono;
    }
}
