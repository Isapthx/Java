public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligarDesligar() {
        ligada = !ligada;
    }
    public void aumentarVolume() {
        System.out.println("Aumentando Volume...");
        volume++;
    }
    public void reduzirVolume() {
        System.out.println("Diminuindo Volume...");
        volume--;
    }
    public void mudarCanal(int canalDestino) {
        canal = canalDestino;
        System.out.println("Mudando o canal para: " + canal);
    }
}
