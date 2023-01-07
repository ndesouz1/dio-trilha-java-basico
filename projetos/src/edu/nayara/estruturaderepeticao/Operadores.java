package edu.nayara.estruturaderepeticao;

public class Operadores{ 
public static void main (String [] args) {
    int numero = 5;
    numero = - numero;

    System.out.println(numero);

    //  numero = + numero;
    // System.out.println( ++ numero);
    // System.out.println( numero --);
    numero = numero * -1; //numero volta a ser positivo

    System.out.println(numero);

    boolean variavel = true;
    System.out.println(!variavel);
    System.out.println(variavel);

    variavel = ! variavel;
    System.out.println(variavel);

    // String resultado = a == b ? "verdadeiro": "falso"; 
    // int result = a == b ? 1 : 0;

}

}
