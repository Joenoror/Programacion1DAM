package Tema7.EjercicioDeClase9;

enum EmisorasPrincipales{ EUROPAFM, LOCAFM, CADENASER, RTVE1, LOS40}
public class Radio {
    final double FRECUENCIAMAXIMA = 108;
    final double FRECUENCIAMINIMA = 80;
    double frecuencia;

    public String toString(){
        String cad;
        cad = "Frecuencia actual " + frecuencia;
        return cad;
    }

    Radio(double frecuencia){
        setFrecuencia(frecuencia);
    }
    Radio(){
        setFrecuencia(FRECUENCIAMINIMA);
    }

    public void setFrecuencia(double frecuencia) {
        if(frecuencia>FRECUENCIAMAXIMA)this.frecuencia = FRECUENCIAMINIMA;
        else if(frecuencia<FRECUENCIAMINIMA) this.frecuencia = FRECUENCIAMAXIMA;
        else this.frecuencia = frecuencia;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    void aumentarFrecuencia(){
        setFrecuencia(getFrecuencia()+0.5);
    }
    void disminuirFrecuencia(){
        setFrecuencia(getFrecuencia()-0.5);
    }


}
