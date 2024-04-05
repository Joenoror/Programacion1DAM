package EjercicioDeClase5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

enum Deportes {NATACION, REMO, VELA, WATERPOLO}
public class Deportista implements Comparable{
    String DNI;
    String nombre;
    LocalDate fechaDeNacimiento;
    Deportes deporte;

    public Deportista(String dni, String nombre, LocalDate fechaDeNacimiento, String deporte){
        this.DNI = dni;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.deporte = Deportes.valueOf(deporte.toUpperCase());
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", deporte=" + deporte +
                '}';
    }

    int getEdad(){
        Period period = Period.between(fechaDeNacimiento, LocalDate.now());
        return  period.getYears();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDeporte(String deporte) {
        this.deporte = Deportes.valueOf(deporte.toUpperCase());
    }

    @Override
    public int compareTo(Object o) {
        return this.nombre.compareTo(((Deportista)o).nombre);
    }
}
