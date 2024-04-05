public class Contenedor <T> {
    T objeto;
    T[] objetos;
    Contenedor(){
    }
    <U> void setObjeto(U nuevo){
        this.objeto = (T)nuevo;
    }

    T getObjeto(){
        return this.objeto;
    }

//    void mostrarContenido(){
//        System.out.println("Identificador del contenedor: " + id);
//        for (int i = 0; i < objetos.length; i++) {
//            System.out.println(objetos[i].toString());
//        }
//    }

}
