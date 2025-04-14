package com.github.nataliatsi.streams.exercicios;

public class Pessoa {

    private String nome;
    private int idade;
    private String personalidade;
    private String ocupacao;
    private String cidade;

    public Pessoa(String nome, int idade, String personalidade, String ocupacao, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.personalidade = personalidade;
        this.ocupacao = ocupacao;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "nome: '" + nome + '\'' +
                ", idade: " + idade +
                ", personalidade: '" + personalidade + '\'' +
                ", ocupação: '" + ocupacao + '\'' +
                ", cidade: '" + cidade + '\'' +
                '}';
    }
}
