public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        if (volume < 0)
            volume = -volume;
    }

    public void diminuirVolume() {
        if (volume > 0)
            volume = -volume;
    }

    public void mudarCanal() {
        if (canal == 1)
            canal = 2;
        else
            desligar();
    }
}