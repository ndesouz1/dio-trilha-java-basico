package edu.nayara.estruturaderepeticao;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de mesês: ");
        int entrada = leitor.nextInt();
        int mesada = 50;

        // TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada
        int valor = entrada * mesada;

        if(entrada >=1){
            System.out.println(" Voce tera " + valor + " reais");
        }
    }
}