package edu.nayara.estruturaderepeticao;

import java.util.Scanner;

/**
 * ler 5 numeros
 * informar maior numero
 * informar media dos numeros
 */
public class MaiorMenor {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        
        int count = 0;
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            
            soma = soma + numero;

            if(numero > maior) maior = numero;
            count = count + 1;
        }while(count < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma)/5);
    }
}
