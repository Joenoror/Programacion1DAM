public class Leon extends Animal implements Sonido{

    @Override
    public void voz() {
        System.out.println("Grrr");
    }

    @Override
    public void vozDurmiendo() {
        System.out.println("Grrr......");
    }
}
