package edu.nayara.Poo3;

/**
 * Classe de exemplo para o exercício da Aula 4 de Orientação a Objetos.
 */
class RodarAplicacao {

    public static void main(String[] args) {

        //instanciar
        Funcionario funcionario = new Funcionario(); //"criou"um objeto

        //Upcasting
        Funcionario gerente = new Gerente(); //Funcionario = supertipo (classe mae)
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Dowcast
        //Gerente gerente_ = new Funcionario();
        //Vendedor vendedor_ = (Vendedor) new Funcionario(); //downcast de funcionario para vendedor
        //vai dar erro no dowcast...evitaar downcast!!! Alguns dados se perdem no caminho!

    }
}
