package EjercicioDeClase3;

import java.util.Arrays;

public class Contenedor <T> implements Pila<T>{

    T[] items = (T[]) new Object[0]; //Opción alternativa para crear el array

    Contenedor(T[] items){
        this.items = items;
    }

    void insertarAlFinal(T nuevo){
        items = Arrays.copyOf(items, items.length+1);
        items[items.length-1] = nuevo;
    }

    void insertarAlPrincipio(T nuevo){
        items = Arrays.copyOf(items, items.length+1);
        System.arraycopy(items, 0, items, 1, items.length-1);
        items[0] = nuevo;
    }

    T extraerDelPrincipio(){
        T valorADevolver = null;
        if(items.length != 0){
            valorADevolver = items[0];
            System.arraycopy(items, 1,items, 0, items.length-1);
            items = Arrays.copyOf(items, items.length-1);
        }
        return valorADevolver;
    }

    T extraerDelFinal(){
        T valorADevolver = null;
        if(items.length != 0){
            valorADevolver = items[items.length-1];
            items = Arrays.copyOf(items, items.length-1);
        }
        return valorADevolver;
    }

    void ordenar(){
        Arrays.sort(items);
    }

    void mostrar(){
        System.out.println("-----");
        System.out.println("ARRAY");
        for (T item: items) {
            System.out.print(item.toString() + ",");
        }
        System.out.println("-----");
    }

    @Override
    public void apilar(T nuevo) {
        insertarAlFinal(nuevo);
    }

    @Override
    public T desapilar() {
        return extraerDelFinal();
    }
}
