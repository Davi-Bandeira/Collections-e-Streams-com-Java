package one.digitalinnovation.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TrabalhandoComSet {

    public static void main(String[] args) {

        System.out.println("Ex-1: Crie um conjunto e adicione as notas ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());
        System.out.println();

        System.out.println("Ex-2: Confira se a nota 5.0 esta no conjunto: " + notas.contains(5d));
        System.out.println();

        System.out.println("Ex-3: Exiba a menor nota: " + Collections.min(notas));
        System.out.println();

        System.out.println("Ex-4: Exiba a maior nota: " + Collections.max(notas));
        System.out.println();

        System.out.println("Ex-5: Exiba a maior nota: " + Collections.max(notas));
        System.out.println();

        System.out.println("Ex-6: Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println();

        System.out.println("Ex-7: Exiba a media das notas: " + (soma/notas.size()));
        System.out.println();

        System.out.println("Ex-8: Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);
        System.out.println();

        System.out.println("Ex-9: Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println();

        System.out.println("Ex-10: Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        System.out.println();

        System.out.println("Ex-11: Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        System.out.println();

        System.out.println("Ex-12: Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);
        System.out.println();

        System.out.println("Ex-13: Confira se a lista está vazia: " + notas.isEmpty());
    }
}
