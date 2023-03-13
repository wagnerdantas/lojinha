package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.nome = "Playstation";
        meuProduto.valor = 5000;
        meuProduto.marca = "Sony";
        meuProduto.tamanho = "Médio";
        meuProduto.itensInclusos = "2 Controles e 1 Jogo";

        System.out.println();

    }
}
