package Tema7.EjercicioDeClase4;

 class Gestor {
    public String nombre;
    public final String telefono;
    private double importeMaximo;

    Gestor(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 10000.0;
    }

     Gestor(String nombre, String telefono, double importeMaximo){
         this.nombre = nombre;
         this.telefono = telefono;
         this.importeMaximo = importeMaximo;
     }


}
