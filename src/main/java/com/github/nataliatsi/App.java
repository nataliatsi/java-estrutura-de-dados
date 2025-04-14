package com.github.nataliatsi;

import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println("=== Números Pares ===");
        List<Integer> numeros = List.of(10, 15, 20, 25, 30, 35, 40);
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        System.out.println("\n=== Nomes em Caps Lock ===");
        List<String> nomes = List.of("ana", "bruno", "carla", "daniel");
        nomes.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("\n=== Palavras com mais de 5 letras ===");
        List<String> palavras = List.of("banana", "uva", "computador", "sol", "teclado");
        long count = palavras.stream().filter(p -> p.length() > 5).count();
        System.out.println(count);

        System.out.println("\n=== Soma ===");
        List<Integer> somar = List.of(5, 10, 15, 20, 25);
        int soma = somar.stream().reduce(0, Integer::sum);
        System.out.println(soma);

        System.out.println("\n=== Maior Número ===");
        List<Integer> numerosMaior = List.of(3, 9, 7, 1, 12, 5);
        int maior = numerosMaior.stream().reduce(0, Integer::max);
        System.out.println("Com reduce(): " + maior);

        int max = numerosMaior.stream().max(Integer::compareTo).orElseThrow();
        System.out.println("Com max(): " + max);

        System.out.println("\n=== Concatenando palavras ===");
        List<String> palavrasTec = List.of("Java", "Spring", "Docker", "Kubernetes");
        String frase = palavrasTec.stream().reduce((a, b) -> a + ", " + b).orElse("Vazio");
        System.out.println("\"" + frase + "\"");

    }

}
