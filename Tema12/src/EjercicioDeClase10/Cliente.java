package EjercicioDeClase10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Cliente implements Comparable<Cliente> {

    public String dni;
    public String nombre;
    public LocalDate fechaNacimiento;

    public Cliente(String dni, String nombre, String fechaNacimiento){
        this.dni = dni;
        this.nombre = nombre;
        //Convertir un String a formato LocalDate con un patrón
        DateTimeFormatter formatoFechas= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento,formatoFechas);
    }



    public Cliente(String nombre){
        this.nombre = nombre;
    }


    int edad(){
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

//    @Override
//    public boolean equals(Object o) {
//        return dni.equals(((Cliente)o).dni);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente client = (Cliente) o;
        return Objects.equals(dni, client.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public int compareTo(Cliente o) {
        return this.dni.compareTo(o.dni);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad()+
                '}' + "\n" ;
    }




//    @Override
//    public int compareTo(Object o) {
//        return dni.compareTo(((Cliente)o).dni);
//    }
}
