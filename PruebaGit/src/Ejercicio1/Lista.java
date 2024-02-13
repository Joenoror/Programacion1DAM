package Ejercicio1;

import java.util.Arrays;
import java.util.Objects;

public class Lista implements Cola{
    Integer[] listaDeNumeros;

    //Constructor que inicializa la tabla con tamanio 0
    Lista(){
        listaDeNumeros = new Integer[0];
    }

    //Obtener el nº de elemetnos de la tabla

    public int numeroDeElementos(){
        return listaDeNumeros.length;
    }

    public void insertarAlFinal(Integer numeroAInsertar){
        listaDeNumeros = Arrays.copyOf(listaDeNumeros, listaDeNumeros.length+1);
        listaDeNumeros[listaDeNumeros.length-1] = numeroAInsertar;
    }

    public void insertarAlPrincipio(Integer numeroAInsertar){
        Integer[] listaAux = Arrays.copyOf(listaDeNumeros, listaDeNumeros.length+1);
        listaAux[0] = numeroAInsertar;
        for (int i = 0; i < listaDeNumeros.length; i++) {
            listaAux[i+1] = listaDeNumeros[i];
        }
        listaDeNumeros = listaAux;
    }

    public void insertarEn(Integer numeroAInsertar, int posicion){
        posicion = posicion-1; //Para que si dices que se inserte en 3º posicion no se inserte en la posicion 3
        Integer[] listaAux = Arrays.copyOf(listaDeNumeros, listaDeNumeros.length+1);
        listaAux[posicion] = numeroAInsertar;
        for (int i = posicion; i < listaDeNumeros.length; i++) {
            listaAux[i+1] = listaDeNumeros[i];
        }
        listaDeNumeros = listaAux;
    }

    public void borrarEn(int posicion){
        posicion = posicion-1; //Para que si dices que se inserte en 3º posicion no se inserte en la posicion 3
        System.arraycopy(listaDeNumeros,posicion+1, listaDeNumeros, posicion, listaDeNumeros.length -1- posicion);
        listaDeNumeros = Arrays.copyOf(listaDeNumeros, listaDeNumeros.length-1);
    }

    public int buscar(Integer numeroABuscar){

        int encontrado = -1;
        for (int i = 0; i < listaDeNumeros.length; i++) {
            if(Objects.equals(listaDeNumeros[i], numeroABuscar) && encontrado == -1){
                encontrado = i;
            }
        }
        return encontrado;
    }

    public void mostrarLista(){
        for (Integer numero: listaDeNumeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

}
