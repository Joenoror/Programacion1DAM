package EjercicioDeClase4;

import java.io.Serializable;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Registro implements Serializable {
    double temperatura;
    String fecha;
    String hora;

    Registro(double temperatura){
        this.temperatura = temperatura;
        this.fecha = LocalDate.now().toString();
        this.hora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "Temperatura: "  + this.temperatura +" ºC " + ", Fecha de hoy: " + this.fecha + ", Hora de hoy: " + this.hora;
    }
}
