package edu.nayara.segundasemana;

import java.util.Scanner;

/**
 * repetir ate digitar zero no nome
 */
public class Nome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){

            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();  
        }
        System.out.println("Guardando seus dados...");
    }
}
