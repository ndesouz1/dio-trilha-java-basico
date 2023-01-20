package edu.nayara.javaBasico;
public class Usuario {
    public static void main(String[] args) throws Exception {
        //Criar classe
        SmartTv smartTV = new SmartTv();

        smartTV.diminuirVolume();//24
        smartTV.diminuirVolume();//23
        smartTV.diminuirVolume();//22
        smartTV.aumentarVolume();//23
        System.out.println("Canal Atual " + smartTV.canal);//1
        smartTV.mudarCanal(13);
        System.out.println("Canal Atual " + smartTV.canal);//13

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTV.ligada);//true

        smartTV.desligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTV.ligada);//false


        System.out.println("Canal Atual " + smartTV.canal);


        



        System.out.println("TB Ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);


        smartTV.ligar();
        System.out.println("TV Ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo status => TV Ligada?" + smartTV.ligada);

    }
}
