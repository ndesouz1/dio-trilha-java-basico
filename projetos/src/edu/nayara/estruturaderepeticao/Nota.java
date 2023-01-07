package edu.nayara.estruturaderepeticao;

import java.util.Scanner;

/**
 * ler nota de 0 - 10
 * mandar mensagem até aparecer valor válido
 */

public class Nota {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        // | = ||
        while(nota < 0 | nota > 10){ 
            System.out.println("Nota inválida, digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
