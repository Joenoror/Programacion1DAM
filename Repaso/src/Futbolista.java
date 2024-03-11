public class Futbolista implements Comparable{
    String dni;
    String nombre;
    int edad;
    int numeroDeGoles;

    Futbolista(String dni, String nombre, int edad, int numeroDeGoles){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDeGoles = numeroDeGoles;
    }

    @Override
    public String toString() {
        return "dni: " + dni + ",nombre: " + nombre + ", edad: " + edad + ",numero de goles: " + numeroDeGoles;
    }

    @Override
    public boolean equals(Object obj) {
        Futbolista objFutbolista = (Futbolista) obj;
//        boolean resultado = false;
//        if(this.edad == objFutbolista.edad){
//            resultado = true;
//        } else resultado = false;
//        return resultado;
        return this.edad == objFutbolista.edad;
    }

    @Override
    public int compareTo(Object o) {
        Futbolista objFutbolista = (Futbolista) o;
        int resultado;
        if(this.edad > objFutbolista.edad) resultado = 1;
        else if(this.edad < objFutbolista.edad) resultado = -1;
        else resultado = 0;
        return resultado;
    }

    //    @Override
//    public int compareTo(Object o) {
//        Futbolista objFutbolista = (Futbolista) o;
//            return this.dni.compareTo(objFutbolista.dni);
//    }


    //    //EQUALS PARA STRINGS
//    @Override
//    public boolean equals(Object obj) {
//        Futbolista objFutbolista = (Futbolista) obj;
//        return this.dni.equals(objFutbolista.dni);
//    }

}
