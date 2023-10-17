package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void deveRetornarAnimais() {
        Zoo zoo = new Zoo();
        zoo.cadastrarAnimal("Jorge","Papagaio", "Ave", 17, 3);
        zoo.cadastrarAnimal("Alex","Leao", "Mamífero", 2, 1);
        zoo.cadastrarAnimal("Vanessa","Cobra", "Réptil", 15, 3);
        zoo.cadastrarAnimal("Twelves","Macaco", "Mamífero", 3, 2);

        List<String> saida = Arrays.asList(
                "Nome: Jorge; Espécie: Papagaio; Categoria: Ave; Setor: 17; Número da Cela: 3",
                "Nome: Alex; Espécie: Leao; Categoria: Mamífero; Setor: 2; Número da Cela: 1",
                "Nome: Vanessa; Espécie: Cobra; Categoria: Réptil; Setor: 15; Número da Cela: 3",
                "Nome: Twelves; Espécie: Macaco; Categoria: Mamífero; Setor: 3; Número da Cela: 2");

        assertEquals(saida, zoo.obterAnimais());
    }

    @Test
    void deveRetornarTotalCelas() {
        Zoo zoo = new Zoo();
        zoo.cadastrarAnimal("Jorge","Papagaio", "Ave", 17, 3);
        zoo.cadastrarAnimal("Alex","Leao", "Mamífero", 2, 1);
        zoo.cadastrarAnimal("Vanessa","Cobra", "Réptil", 15, 3);
        zoo.cadastrarAnimal("Twelves","Macaco", "Mamífero", 3, 2);
        zoo.cadastrarAnimal("Renato","Macaco", "Mamífero", 3, 2);

        assertEquals(4, CelaFactory.getTotalCelas());
    }
}