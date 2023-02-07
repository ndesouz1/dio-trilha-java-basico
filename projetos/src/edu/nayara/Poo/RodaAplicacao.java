package edu.nayara.Poo;

/**
 * Classe de exemplo para o exercício da Aula 2 de Orientação a Objetos.
 */
class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro(); //criando objeto a partir do construtor vazio

        //setando
        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        //printando usando get
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        //criando objeto que tem parametros...utilizamos a sobrecarga:
        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);

        //Nesse caso nao precisou do set pq ja veio no construtor...ai so printar o get
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}