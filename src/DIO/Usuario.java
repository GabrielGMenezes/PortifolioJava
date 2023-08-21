package DIO;

import DIO.SmartTv;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada? " + smartTv.ligada);
        System.out.println("Em qual canal a Tv está? " + smartTv.canal);
        System.out.println("Qual o volume da Tv? " + smartTv.volume);

        System.out.println("\n");

        smartTv.ligar();
        System.out.println("E agora a Tv está ligada¹? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("E agora a Tv está ligada²? " + smartTv.ligada);

        System.out.println("\n");

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("\n");

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(13);

    }
}