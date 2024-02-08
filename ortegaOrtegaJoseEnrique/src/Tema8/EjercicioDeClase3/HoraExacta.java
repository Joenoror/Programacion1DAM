package Tema8.EjercicioDeClase3;

import Tema8.EjercicioDeClase2.Hora;

import java.util.Arrays;
import java.util.Objects;

public class HoraExacta extends Hora {

    int segundos;

    public HoraExacta(int hora, int minutos, int segundos){
        super(hora, minutos);
        setSegundos(segundos);
    }

    public int getSegundos() {
        return segundos;
    }

    public boolean setSegundos(int segundos) {
        boolean aux;
        if(segundos>=0 && segundos <=59){
            this.segundos = segundos;
            aux = true;
        }
        else{
            System.out.println("Segundos erróneos");
            aux = false;
        }
        return aux;
    }

    @Override
    public void inc(){
        if((getSegundos()+1 == 60)){
            super.inc();
            setSegundos(0);
        }
        else{
            setSegundos(getSegundos()+1);
        }
    }

    @Override
    public String toString(){

        String cad = super.toString();
//        char[] charArray = cad.toCharArray();
//        charArray = Arrays.copyOf(charArray, charArray.length -1);
//        cad = String.valueOf(charArray);
        cad = cad.substring(0, cad.length()-1);
        if(getMinutos()<10) cad += ":0" + getSegundos() + ")";
        else cad += ":" + getSegundos() + ")";

        return cad;
    }

    @Override
    public boolean equals(Object o) {
        HoraExacta hEaux = (HoraExacta) o;
        boolean iguales = false;
        if(hEaux.getSegundos() == getSegundos() && super.equals(hEaux)){
            iguales = true;
        }
        return iguales;
    }

    @Override
    public int hashCode() {
        return Objects.hash(segundos);
    }
}
