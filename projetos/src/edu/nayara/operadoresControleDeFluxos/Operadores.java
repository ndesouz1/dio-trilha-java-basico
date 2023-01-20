package edu.nayara.operadoresControleDeFluxos;

public class Operadores{ 
public static void main (String [] args) {
    int numero = 5;
    int a, b;
    a = 5;
    b = 6;
    int numero1 = 1;
    int numero2 = 2;
    String nomeUm = "Nayara";
    String nomeDois = "Nayara";
    String nomeTres = new String("Nayara"); //objeto (tem que usar equals)
    boolean cond1=true;
    boolean cond2=false;

    System.out.println(nomeUm == nomeDois); //true
    System.out.println(nomeUm.equals(nomeTres)); //equals compara conteudo

    if(cond1 && cond2){
        System.out.println("As duas condicoes sao verdadeiras");
    }

    if(cond1 && (7 > 4)){
        System.out.println("As duas condicoes sao verdadeiras");
    }

    if(cond1 || cond2){
        System.out.println("Uma das duas condicoes sao verdadeiras");
    }

    numero = - numero;
    System.out.println(numero); //-5

    //  numero = + numero;
    // System.out.println( ++ numero);
    // System.out.println( numero --);
    numero = numero * -1; //numero volta a ser positivo
    System.out.println(numero); //5

    boolean variavel = true;
    System.out.println(!variavel); //false
    System.out.println(variavel); //true

    variavel = !variavel;
    System.out.println(variavel); //false

    String resultado = a == b ? "verdadeiro": "falso";
    //int resultado = a == b ? 1 : 0; //se verdadeiro(1) se falso(0)
    System.out.println(resultado); //falso


    boolean simNao = numero1 == numero2;
    System.out.println("numeroUm é igual a numeroDois? " + simNao);

    //mudando valor da variavel
    simNao = numero1 != numero2;
    System.out.println("numeroUm é diferente a numeroDois? " + simNao);

    simNao = numero1 > numero2;
    System.out.println("numeroUm é maior a numeroDois? " + simNao);

    if(numero1 < numero2){ //true
        System.out.println("A nossa condição é verdadeira");
    }

}

}
