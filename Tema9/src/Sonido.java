public interface Sonido {
    int version = 1;
    void voz();
    default void vozDurmiendo(){
        System.out.println("Zzz");
    }

    static void bostezo(){
        System.out.println("Aaaaaaauh");
    }
}
