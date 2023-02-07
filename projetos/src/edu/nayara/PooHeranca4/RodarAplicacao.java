package edu.nayara.PooHeranca4;

/**
 * Classe de exemplo para o exercício da Aula 4 de Orientação a Objetos.
 */
class RodarAplicacao {

    public static void main(String[] args) {

        //vetor[] com 3 objetos{}
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //polimorfismo, o metodo se comportou de acordo com o tipo de dado
        //polimorfismo ocorre nos objetos...ClasseFilha1(), ClasseFilha2() ...aqui nao tem polimorfismo: ClasseMae
        for (ClasseMae classe: classes) { //percorrer os objetos
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }

}
