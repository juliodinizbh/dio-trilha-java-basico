public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();

        smartTv.diminuirVolume();

        smartTv.aumentarCanal();

        System.out.println("canal atual " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("canal alterado " + smartTv.canal);

        System.out.println("Tv ligada? " + smartTv.ligada);

        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status Tv: " + smartTv.ligada);

        


    }
}
