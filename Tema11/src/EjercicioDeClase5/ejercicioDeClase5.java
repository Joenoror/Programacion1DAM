package EjercicioDeClase5;

import java.time.LocalDate;
import java.util.Arrays;

public class ejercicioDeClase5 {
    public static void main(String[] args) {
        Club c = new Club();
        c = c.leerDesdeFichero();
        c.alta(new Deportista("1", "Pepe", LocalDate.of(1993,10,17) , "WATERPOLO"));
        c.alta(new Deportista("2", "Lucas", LocalDate.of(1995,3,20) , "REMO"));
        c.alta(new Deportista("3", "Aaul", LocalDate.of(1989,1,12) , "VELA"));
        c.alta(new Deportista("4", "Zelipe", LocalDate.of(2003,7,1) , "WATERPOLO"));
//
//        c.mostrarAfiliados();
//        c.baja("3");

        c.ordenarPorLaEdad(c);
        c.ordenarPorElNombre(c);

        c.cambiarDatos("2");

        c.guardarEnFichero(c);

    }
}
