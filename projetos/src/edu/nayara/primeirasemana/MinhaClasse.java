package edu.nayara.primeirasemana;

public class MinhaClasse{
    public static void main (String [] args){
        
        String primeiroNome = "Nayara";
        String segundoNome = "de Souza";

        // Variável nomeCompleto recebe um metodo nomeCompleto que tem seus parametros:
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        //conca = concatena/junta
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
        
}
