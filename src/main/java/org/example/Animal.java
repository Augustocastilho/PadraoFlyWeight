package org.example;

public class Animal {

    private String nome;
    private String especie;
    private Cela cela;

    public Animal(String nome, String especie, Cela cela) {
        this.nome = nome;
        this.especie = especie;
        this.cela = cela;
    }

    public String obterAnimal() {
        return "Nome: " + this.nome +
                "; Espécie: " + this.especie +
                "; Categoria: " + this.cela.getCategoria() +
                "; Setor: " + this.cela.getSetor() +
                "; Número da Cela: " + this.cela.getNumCela();
    }
}
