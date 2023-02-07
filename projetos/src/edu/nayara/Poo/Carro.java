package edu.nayara.Poo;

/**
 * Classe de exemplo para o exercício da Aula 2 de Orientação a Objetos.
 */
class Carro {                //Classe
    String cor;             //atributo
    String modelo;         //atributo
    int capacidadeTanque; //atributo

    //SOBRECARGA
    Carro() {   //construtor (objeto vazio)

    }

    //construtor com sobrecarga (com alguns valores iniciais)
    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;   // this = cria objeto (this.ATRUBUTO da classe = PARAMETRO do metodo)
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor) {  //set (coloca um valor para o atributo cor) //void = sem retorno (só quremos guardar um valor no atributo)
        this.cor = cor;
    }

    String getCor() {   //get (retorna algo...retorna a cor do carro)..logo nao pode ser void
        return cor;
    }

    void setModelo(String modelo) {  //set
        this.modelo = modelo;
    }

    String getModelo() {  //get
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) { //atributo do tipo int
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() { //get vai retornar algo e nao precisa de parametro //se o atributo eh do tipo int o metodo get tem que ser tb
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}

