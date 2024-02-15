public interface Sonido {
    int version = 1;
    void voz(); //Emite sonido

    default void vozDurmiendo(){
        System.out.println("Zzz");
    }

}

