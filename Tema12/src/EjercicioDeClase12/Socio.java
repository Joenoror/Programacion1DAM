package EjercicioDeClase12;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Socio implements Comparable<Socio>, Serializable {

    private int id;
    String dni;
    String nombre;
    LocalDate fechaAlta;

    Socio(int id, String dni, String nombre, String fechaAlta) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        //Convertir un String a formato LocalDate con un patrón
        DateTimeFormatter formatoFechas= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaAlta = LocalDate.parse(fechaAlta,formatoFechas);
    }

    Socio(String dni, String nombre, String fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        //Convertir un String a formato LocalDate con un patrón
        DateTimeFormatter formatoFechas= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaAlta = LocalDate.parse(fechaAlta,formatoFechas);
    }

    Socio(String dni){
        this.dni = dni;
    }

    Socio(){}


    int antiguedad(){
        return (int) fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return Objects.equals(dni, socio.dni);
    }

    @Override
    public int compareTo(Socio o) {
        return this.dni.compareTo(o.dni);
    }

    @Override
    public String toString() {
        return "Socio{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaAlta=" + antiguedad() +
                '}' + "\n";
    }
}
