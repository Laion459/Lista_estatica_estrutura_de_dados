package estrutura.de.dados;

import java.util.Random;

public class Main {

    public static void main(String[] args) {



        int lista[] = {1,2,3,4,5,9,8,55,4,0,22,14,4,5,6};
        ListaEstatica listaEstatica = new ListaEstatica(lista);
        listaEstatica.setCardianalidade(lista.length);

        // Verifica se lista esta vazia
        System.out.println("1- Lista tem elementos? : " + listaEstatica.validList(lista));

        // Verifica se tem espaço na lista
        System.out.println("2- Verifica se tem espaço na lista: " + listaEstatica.checkIfThereIsSpaceInTheList(lista));

        // Recupera o elemento da lista
        System.out.println("3- Recupera elemento da lista: " + listaEstatica.elementList(lista,2));

        // Verifica se a elementos na lista
        System.out.println("4- Elemento esta na lista? : " + listaEstatica.checkElementInList(lista,22));

        // Verifica se uma posição qualquer eastá na lista
        System.out.println("5- Verifica se uma posição qualquer eastá na lista: " + listaEstatica.checkPositionInList(lista,2));

        // Recuperar um elemento da lista
        System.out.println("6- Recuperar um elemento da lista: " + listaEstatica.retrieveElementFromList(lista,55));

        // Recuperar a posição da lista
        System.out.println("7- Recupera a posição do elemento na lista: " + listaEstatica.retrievePositionFromList(lista,55));

        // Inserir um elemento no final da lista
        listaEstatica.insertEndInTheList(1000);
        System.out.println("8- Inserir um elemento na lista: ");

        // Insere elemento no inicio da lista
        //listaEstatica.insertStartInTheList(500);
        System.out.println("9- Insere elemento no inicio da lista: ");

        // Insere elemento em posição especifica da lista

        // Retirar um elemento da lista
        System.out.println("11- Remove um elemento da lista: ");
        //listaEstatica.removePosition(10);

        // Show list
        System.out.println("12- Imprime a lista: ");
        listaEstatica.showElementsList(lista);


        // parte das açoes e seus valores com oscilaçoes
        Random random = new Random();
        ListaGenericaExemplo acoes = new ListaGenericaExemplo<Integer>(100);
        acoes.insertEnd(6);
        Integer novoPreco;

        Integer tempo = 0;
        while (tempo <= 18){
            tempo++;
            System.out.println(acoes);
            novoPreco = acoes.getCardinalidade() + random.nextInt(7) - 3;
            acoes.insertEnd(novoPreco);
        }

        // Testes com arrayList
        System.out.println("Lista com nomes: ");
        ListaGenericaExemplo listaGenericaExemplo = new ListaGenericaExemplo<String>(10);
        listaGenericaExemplo.insertEnd("Leonardo");
        listaGenericaExemplo.insertEnd("Alessandro");
        System.out.println("1° Lista: " + listaGenericaExemplo);

        System.out.println("Lista com idade: ");
        ListaGenericaExemplo listaGenericaExemplo1 = new ListaGenericaExemplo<Integer>(10);
        listaGenericaExemplo1.insertEnd(01);
        listaGenericaExemplo1.insertEnd(02);
        System.out.println("2° Lista: " + listaGenericaExemplo1);

        Person person = new Person("Leonardo", 30);
        Person person1 = new Person("Alessandro", 15);

        System.out.println("Lista com object Pesssoa: ");
        ListaGenericaExemplo listaGenericaExemplo2 = new ListaGenericaExemplo<Person>(10);
        listaGenericaExemplo2.insertEnd(person);
        listaGenericaExemplo2.insertEnd(person1);
        System.out.println("3° Lista: " + listaGenericaExemplo2);

    }
}
