package one.digitalinnovation.list;

import java.util.ArrayList;
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


    }
}
