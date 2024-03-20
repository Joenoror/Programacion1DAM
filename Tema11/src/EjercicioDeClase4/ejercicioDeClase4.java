package EjercicioDeClase4;

import java.util.Scanner;

public class ejercicioDeClase4 {
    public static void main(String[] args) {

        try{
            Registros r = new Registros();
            String rutaDeArchivo = ".\\Archivos\\registros.data";
            r = r.leerDesdeArchivo(r, rutaDeArchivo);
            int opcion = -1;

            while (opcion != 3){
                System.out.println("INTRODUCE UNA OPCIÓN");
                System.out.println("1-NUEVO REGISTRO");
                System.out.println("2-MOSTRAR HISTÓRICO");
                System.out.println("3-SALIR");
                opcion = new Scanner(System.in).nextInt();

                switch (opcion){
                    case 1 -> {
                        System.out.println("Introduce la temperatura actual");
                        double nuevaTemperatura = new Scanner(System.in).nextDouble();
                        r.nuevoRegistro(new Registro(nuevaTemperatura));
                    }
                    case 2 -> r.mostrarRegistros();
                    case 3 -> {
                        System.out.println("Hasta luego.");
                        r.guardarEnArchivo(r, rutaDeArchivo);
                    }
                    default -> System.out.println("Opción no válida.");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
