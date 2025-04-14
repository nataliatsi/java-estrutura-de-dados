package com.github.nataliatsi.steams.exercicios.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.github.nataliatsi.steams.exercicios.Produto;

public class ProdutoService {

    public static List<Produto> getProdutos() {
        return List.of(
                new Produto("Mouse", 30.0),
                new Produto("Teclado", 80.0),
                new Produto("Monitor", 500.0),
                new Produto("Cadeira", 200.0));
    }

    public static List<String> filtrarProdutosCaros(List<Produto> produtos) {
        return produtos.stream()
                .filter(p -> p.getPreco() > 50)
                .map(Produto::getNome).collect(Collectors.toList());
    }

    public static Map<String, List<String>> agruparPorFaixaDePreco(List<Produto> produtos) {
        return produtos.stream()
                .collect(Collectors.groupingBy(
                        p -> {
                            if (p.getPreco() < 100)
                                return "abaixo_de_100";
                            else if (p.getPreco() <= 300)
                                return "entre_100_e_300";
                            else
                                return "acima_de_300";
                        },
                        LinkedHashMap::new,
                        Collectors.mapping(Produto::getNome, Collectors.toList())));
    }

    public static void main(String[] args) {
        System.out.println("\n=== Produtos filtrados ===");
        List<Produto> produtos = ProdutoService.getProdutos();
        List<String> filtrados = ProdutoService.filtrarProdutosCaros(produtos);
        System.out.println(filtrados);

        System.out.println("\n=== Produtos agrupados por faixa de preço ===");
        Map<String, List<String>> agrupados = ProdutoService.agruparPorFaixaDePreco(produtos);
        agrupados.forEach((faixa, nome) -> {
            System.out.println(faixa + ": " + nome);
        });
    }

}
