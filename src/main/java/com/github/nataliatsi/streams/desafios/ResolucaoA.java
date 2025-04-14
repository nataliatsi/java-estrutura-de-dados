package com.github.nataliatsi.streams.desafios;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ResolucaoA {

        public static void main(String[] args) {

                List<Integer> numeros = IntStream.rangeClosed(1, 10_000_000)
                                .boxed()
                                .collect(Collectors.toList());

                System.out.println("Gerando lista com 10 milhões de números...");
                System.out.println("Lista gerada!");

                long inicioSequencial = System.currentTimeMillis();
                long somaSequencial = numeros.stream().mapToLong(Integer::longValue).sum();
                long fimSequencial = System.currentTimeMillis();

                System.out.println("\nSoma (stream): " + somaSequencial);
                System.out.println("Tempo (stream): " + (fimSequencial - inicioSequencial) + "ms");

                long inicioParalela = System.currentTimeMillis();
                long somaParalela = numeros.parallelStream().mapToLong(Integer::longValue).sum();
                long fimParalela = System.currentTimeMillis();

                System.out.println("\nSoma (parallelStream): " + somaParalela);
                System.out.println("Tempo (parallelStream): " + (fimParalela - inicioParalela) + "ms");

                // Usando reduce para soma
                long inicioReduce = System.currentTimeMillis();
                long somaReduce = numeros.stream().mapToLong(Integer::longValue).reduce(0, Long::sum);
                long fimReduce = System.currentTimeMillis();

                System.out.println("\nSoma (stream + reduce): " + somaReduce);
                System.out.println("Tempo (reduce): " + (fimReduce - inicioReduce) + "ms");

                long inicioReduceParalela = System.currentTimeMillis();
                long somaReduceParalela = numeros.parallelStream().mapToLong(Integer::longValue).reduce(0, Long::sum);
                long fimReduceParalela = System.currentTimeMillis();

                System.out.println("\nSoma (parallelStream + reduce): " + somaReduceParalela);
                System.out.println("Tempo (reduce paralelo): " + (fimReduceParalela - inicioReduceParalela) + "ms");
        }

}
