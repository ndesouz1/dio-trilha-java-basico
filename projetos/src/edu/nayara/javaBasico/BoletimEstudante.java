package edu.nayara.javaBasico;

public class BoletimEstudante {

    public static void main(String[] args) {
        int mediaFinal = 7;
        if(mediaFinal < 6)
            System.out.println("REPROVADO");
        else if(mediaFinal == 6)
            System.out.println("PROVA DE MINERVA");
        else
            System.out.println("APROVADO");

    }
}
