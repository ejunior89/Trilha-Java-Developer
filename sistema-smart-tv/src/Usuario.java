public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ?" + smartTv.ligada);
        System.out.println("canal atual ?" + smartTv.canal);
        System.out.println("volume atual " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("TV ligada?" + smartTv.ligada);

        smartTv.canal = 2;
        System.out.println("canal atual?" + smartTv.canal);

        smartTv.mudarCanal();
        System.out.println("canal?" + smartTv.canal);
    }
}
