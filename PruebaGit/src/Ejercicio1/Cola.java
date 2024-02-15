package Ejercicio1;

public interface Cola{

    int version = 1;

    public void encolar(Integer integerAEncolar);
    Integer desencolar();

    default void encolarMultiple(Integer integerAEncolar, int repeticiones){
        for (int i = 0; i < repeticiones; i++) {
            encolar(integerAEncolar);
        }
    }

}
