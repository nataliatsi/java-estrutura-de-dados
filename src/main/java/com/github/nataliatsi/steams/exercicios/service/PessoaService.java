package com.github.nataliatsi.steams.exercicios.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.github.nataliatsi.steams.exercicios.Pessoa;

public class PessoaService {

    public static List<Pessoa> getPessoas() {
        return List.of(
                new Pessoa("Homer Simpson", 39, "Preguiçoso", "Inspetor de segurança", "Springfield"),
                new Pessoa("Lisa Simpson", 8, "Analítica", "Estudante", "Springfield"),
                new Pessoa("Bart Simpson", 10, "Travesso", "Estudante", "Springfield"),
                new Pessoa("Marge Simpson", 36, "Cuidadosa", "Dona de casa", "Springfield"),
                new Pessoa("Rick Sanchez", 70, "Genial", "Cientista", "Cidadela dos Ricks"),
                new Pessoa("Morty Smith", 14, "Ansioso", "Estudante", "Earth Dimension C-137"),
                new Pessoa("Finn Mertens", 16, "Corajoso", "Aventureiro", "Terra de Ooo"),
                new Pessoa("Jake the Dog", 28, "Relaxado", "Companheiro de aventuras", "Terra de Ooo"),
                new Pessoa("Bob Esponja", 20, "Otimista", "Cozinheiro", "Fenda do Biquíni"),
                new Pessoa("Patrick Estrela", 20, "Desligado", "Desempregado", "Fenda do Biquíni"));
    }

    public static List<Pessoa> filtrarCorajosos(List<Pessoa> pessoas) {
        return pessoas.stream()
                .filter(p -> p.getPersonalidade().equalsIgnoreCase("Corajoso"))
                .collect(Collectors.toList());
    }

    public static List<Pessoa> ordenarPorIdade(List<Pessoa> pessoas) {
        return pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getIdade))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("\n=== Pessoas extrovertidas ===");
        List<Pessoa> pessoas = PessoaService.getPessoas();
        PessoaService.filtrarCorajosos(pessoas).forEach(System.out::println);

        System.out.println("\n=== Pessoas ordenadas por idade ===");
        PessoaService.ordenarPorIdade(pessoas).forEach(System.out::println);
    }
}
