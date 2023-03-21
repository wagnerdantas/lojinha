package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) throws Exception {
        Produto meuProduto = new Produto();

        meuProduto.setNome("Playstation");
        meuProduto.setValor(1);
        meuProduto.setMarca("Sony");
        meuProduto.setTamanho("Médio");
        meuProduto.setItensInclusos("Dois controle e um jogo");

        System.out.println(meuProduto.getValor());

    }
}
