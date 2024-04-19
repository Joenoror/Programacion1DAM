import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Client implements Comparable<Client> {

    String dni;
    String nombre;
    LocalDate fechaNacimiento;

    Client(String dni, String nombre, String fechaNacimiento){
        this.dni = dni;
        this.nombre = nombre;
        //Convertir un String a formato LocalDate con un patrón
        DateTimeFormatter formatoFechas= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento,formatoFechas);
    }

    Client(String dni){
        this.dni = dni;
    }


    int edad(){
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(dni, client.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public int compareTo(Client o) {
        return dni.compareTo(o.dni);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad()+
                '}' + "\n" ;
    }

}
