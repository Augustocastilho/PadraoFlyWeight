package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animais = new ArrayList<>();

    public void cadastrarAnimal(String nomeAnimal, String especie, String nomeCategoria, int setor, int numCela) {
        Cela cela = CelaFactory.getCela(nomeCategoria, setor, numCela);
        Animal animal = new Animal(nomeAnimal, especie, cela);
        animais.add(animal);
    }

    public List<String> obterAnimais(){
        List<String> saida = new ArrayList<String>();
        for (Animal animal : this.animais) {
            saida.add(animal.obterAnimal());
        }
        return saida;
    }
}
