public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMario = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //casting

        int numero = 5;
        numero = 120;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; //assim a variavel nao pode ser alterada

    }
}


// package edu.nayara.primeirasemana;

// public class MinhaClasse{
//     public static void main (String [] args){
        
//         String primeiroNome = "Ana";
//         String segundoNome = "de Souza Machado";

//         String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    
//         System.out.println(nomeCompleto);
//     }

//     public static String nomeCompleto (String primeiroNome, String segundoNome){
//         return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
//     }
        
// }
