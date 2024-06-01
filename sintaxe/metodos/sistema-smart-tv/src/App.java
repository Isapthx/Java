public class App {
    public static void main(String[] args) throws Exception {
        SmartTv SmartTv = new SmartTv();

        System.out.println("A TV está ligada? " + SmartTv.ligada);
        System.out.println("O canal atual: " + SmartTv.canal);
        System.out.println("O volume atual: " + SmartTv.volume);

        SmartTv.ligarDesligar();
        SmartTv.aumentarVolume();
        SmartTv.mudarCanal(54);

        System.out.println("\nA TV está ligada? " + SmartTv.ligada);
        System.out.println("O canal atual: " + SmartTv.canal);
        System.out.println("O volume atual: " + SmartTv.volume);
    }
}
