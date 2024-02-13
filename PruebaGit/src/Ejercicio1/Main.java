package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Lista li = new Lista();
        li.mostrarLista();
        li.insertarAlFinal(0);
        li.mostrarLista();
        li.insertarAlPrincipio(1);
        li.mostrarLista();
        li.insertarAlPrincipio(99);
        li.insertarEn(99, 2);
        li.insertarAlPrincipio(99);
        li.mostrarLista();
        li.insertarAlPrincipio(5);
        li.mostrarLista();
        li.insertarAlFinal(2);
        li.mostrarLista();
        li.insertarAlFinal(4);
        li.mostrarLista();
        li.insertarEn(77, 3);
        li.mostrarLista();
        li.borrarEn(3);
        li.mostrarLista();
        System.out.println(li.buscar(99));
    }
}
