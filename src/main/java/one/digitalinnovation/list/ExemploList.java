package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        //MÉTODO ADD
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println("Adicionando nomes:\n" + nomes);
        System.out.print("\n");

        //------ORDENAR DE ORDEM ALFABETICA------------------------------------
        Collections.sort(nomes);
        System.out.println("Ordenando a lista em ordem alfabetica:\n" + nomes);
        System.out.print("\n");

        //------MÉTODO SET----------------------------------------------------
        nomes.set(3, "Larissa");  //método set é um método de atualização
        System.out.println("Atualizando o indice 3 de Juliana para Larissa:\n" + nomes);
        System.out.print("\n");

        //------MÉTODO REMOVE--------------------------------------------------
        nomes.remove(4); //removendo passando o indice
        System.out.println("Removendo o indice 4:\n" + nomes);
        System.out.print("\n");

        nomes.remove("Larissa");//removendo passando o objeto que quer remover
        System.out.println("Removendo o objeto Larissa:\n" + nomes);
        System.out.print("\n");

        //------MÉTODO GET--------------------------------------------------
        String nome = nomes.get(1);
        System.out.println("Retornando o indice 1:\n" + nome);
        System.out.print("\n");

        //------MÉTODO INDEXOF--------------------------------------------------
        int posicao = nomes.indexOf("Carlos");
        System.out.println("Buscando o indice do objeto Carlos:\n" + posicao);
        System.out.print("\n");

        //------MÉTODO SIZE--------------------------------------------------
        int tamanho = nomes.size();
        System.out.println("Tamanho da lista:\n" + tamanho);
        System.out.print("\n");

        //------MÉTODO CONTAINS--------------------------------------------------
        boolean temAnderson = nomes.contains("Anderson");
        System.out.println("Tem Anderson na lista ? " + temAnderson);

        boolean temFernando = nomes.contains("Fernando");
        System.out.println("Tem Fernando na lista ? " + temFernando);
        System.out.print("\n");

        //------MÉTODO FOREACH--------------------------------------------------
        System.out.println("Iterando com o FOR:");
        for (String nomeDoItem: nomes) {
            System.out.println("--->" + nomeDoItem);
        }
        System.out.print("\n");

        //------MÉTODO Iterator--------------------------------------------------
        System.out.println("Iterando com o ITERATOR:");
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            //HasNext() retorna um boleano true toda vez que tiver um proximo elemento na lista
            System.out.println("--->" + iterator.next());
        }
        System.out.print("\n");

        //------MÉTODO ISEMPTY--------------------------------------------------
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println("Lista esta vazia ? " + listaEstaVazia);
        System.out.print("\n");

        //------MÉTODO CLEAR--------------------------------------------------
        System.out.println("Aplicando o método clear na lista:");
        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println("Lista esta vazia ? " + listaEstaVazia);
        System.out.print("\n");
    }
}
