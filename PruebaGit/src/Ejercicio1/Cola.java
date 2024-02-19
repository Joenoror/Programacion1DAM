package Ejercicio1;

public interface Cola{

    int version = 1;

    public void encolar(Object integerAEncolar);
    Integer desencolar();

    default void encolarMultiple(Integer integerAEncolar, int numeroDeVecesAEncolar){
        for (int i = 0; i < numeroDeVecesAEncolar; i++) {
            encolar(integerAEncolar);
        }
    }



}
