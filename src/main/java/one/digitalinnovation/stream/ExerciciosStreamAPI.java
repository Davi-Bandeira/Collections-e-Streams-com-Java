package one.digitalinnovation.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String:");
        numerosAleatorios.forEach(System.out::println);
        System.out.println("");

        System.out.println("Pegue os 5 primeiros números e colque dentro de um SET:");
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(collectSet);
        System.out.println("");

        System.out.println("Transforme essa lista de String em uma lista de números inteiros:");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collectList);
        System.out.println("");

        System.out.println("Pegue os numeros pares e maiores que 2:");
        List<Integer> collectToList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(collectToList);
        System.out.println("");

        System.out.println("Mostre a média dos números:");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
        System.out.println("");

        System.out.println("Remova os valores impares:");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numerosAleatoriosInteger.removeIf(integer -> integer % 2 != 0);
        System.out.println(numerosAleatoriosInteger);
        System.out.println("");
    }
}
