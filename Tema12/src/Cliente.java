import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Cliente implements Comparable<Cliente>{

    String dni;
    String nombre;
    LocalDate fechaNacimiento;

    Cliente(String dni, String nombre, String fechaNacimiento){
        this.dni = dni;
        this.nombre = nombre;
        //Convertir un String a formato LocalDate con un patrón
        DateTimeFormatter formatoFechas= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento,formatoFechas);
    }

    Cliente(String dni){
        this.dni = dni;
    }


    int edad(){
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public boolean equals(Object o) {
        return dni.equals(((Cliente)o).dni);
    }

    @Override
    public int compareTo(Cliente o) {
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
