package model;

import java.util.ArrayList;

public class Banco {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static int contadorId = 1;

    public static void adicionar(Produto p) {
        p.setId(contadorId++);
        produtos.add(p);
    }

    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
