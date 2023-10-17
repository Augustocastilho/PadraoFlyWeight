package org.example;

import java.util.HashMap;
import java.util.Map;

public class CelaFactory {

    private static Map<String, Cela> celas = new HashMap<>();

    public static Cela getCela(String nomeCategoria, int setor, int numCela) {
        String chave = nomeCategoria + numCela;
        Cela cela = celas.get(chave);
        if(cela == null) {
            cela = new Cela(nomeCategoria, setor, numCela);
            celas.put(chave, cela);
        }
        return cela;
    }

    public static int getTotalCelas() { return celas.size(); }
}
