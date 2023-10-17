package org.example;

public class Cela {

    private String categoria;
    private int setor;
    private int numCela;

    public Cela(String categoria, int setor, int numCela) {
        this.categoria = categoria;
        this.setor = setor;
        this.numCela = numCela;
    }

    public String getCategoria() {
        return categoria;
    }
    public int getSetor() {
        return setor;
    }
    public int getNumCela() {
        return numCela;
    }
}
