package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args){

        Queue<String> filaBanco = new LinkedList<>();

        //------MÉTODO ADD------------------------------------
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);
        System.out.print("\n");

        //------MÉTODO POLL------------------------------------
        //Retorna e remove o primeiro elemento da fila
        //Retorna NULL caso a fila esteja vazia
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);
        System.out.print("\n");

        //------MÉTODO PEEK------------------------------------
        //Retorna mas não remove o primeiro elemento da fila
        //Retorna NULL caso a fila esteja vazia
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);
        System.out.print("\n");

        //------MÉTODO ELEMENT------------------------------------
        //Retorna mas não remove o primeiro elemento da fila
        //Retorna uma Exceção caso a fila esteja vazia
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);
        System.out.print("\n");

        //------MÉTODO FOREACH--------------------------------------------------
        System.out.println("Iterando com o FOR:");
        for (String cliente : filaBanco) {
            System.out.println("--->" + cliente);
        }
        System.out.print("\n");


        //------MÉTODO ITERATOR--------------------------------------------------
        System.out.println("Iterando com o ITERATOR:");
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()) {
            //HasNext() retorna um boleano true toda vez que tiver um proximo elemento na lista
            System.out.println("--->" + iteratorFilaBanco.next());
        }
        System.out.print("\n");

        //------MÉTODO SIZE--------------------------------------------------
        System.out.println("Tamanho da fila:\n" + filaBanco.size());
        System.out.print("\n");

        //------MÉTODO ISEMPTY--------------------------------------------------
        System.out.println("Fila esta vazia?\n" + filaBanco.isEmpty());
        System.out.print("\n");

    }
}
