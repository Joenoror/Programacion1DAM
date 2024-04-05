import java.util.Arrays;

public class Contenedor <T> {
    public T objeto;

    private T[] tabla;
    public Contenedor(){
    }
    public Contenedor(T nuevo){
        objeto = nuevo;
    }
    void guardar(T nuevo){
        objeto = nuevo;
    }
    T extraer() {
        T res = objeto;
        objeto = null;
        return res;
    }

    static <U extends Number> int numeroDeNulos(U[] tabla){
        int cont = 0;
        for(U e : tabla){
            if(e == null){
                cont++;
            }
        }
        return cont;
    }



}
