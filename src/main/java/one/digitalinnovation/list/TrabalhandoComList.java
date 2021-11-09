package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TrabalhandoComList {

    public static void main(String[] args) {

        System.out.println("Ex-01: Crie uma lista e adicione as sete notas:");

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(5.0);
        notas.add(0.0);
        notas.add(3.6);
        notas.add(9.0);
        notas.add(6.0);
        notas.add(7.0);
        System.out.println(notas.toString());
        System.out.println();

        System.out.println("Ex-02: Exiba a posição da nota 5.0: " + notas.indexOf(5.0));
        System.out.println();

        System.out.println("Ex-03: Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas.toString());
        System.out.println();

        System.out.println("Ex-04: Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas.toString());
        System.out.println();

        System.out.println("Ex-05: Confira se a nota 5.0 está na lista: " + notas.contains(5.0));
        System.out.println();

        System.out.println("Ex-06: Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);
        System.out.println();

        System.out.println("Ex-07: Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());
        System.out.println();

        System.out.println("Ex-08: Exiba a menor notas: " + Collections.min(notas));
        System.out.println();

        System.out.println("Ex-09: Exiba a maior notas: " + Collections.max(notas));
        System.out.println();

        System.out.println("Ex-10: Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println();

        System.out.println("Ex-11: Exiba a media das notas: " + (soma/notas.size()));
        System.out.println();

        System.out.println("Ex-12: Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);
        System.out.println();

        System.out.println("Ex-13: Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);
        System.out.println();

        System.out.println("Ex-14: Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println();

        System.out.println("Ex-15: Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);
        System.out.println();

        System.out.println("Ex-16: Confira se a lista está vazia: " + notas.isEmpty());
    }
}
