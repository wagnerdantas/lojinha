package br.com.lojinha.pojo;

public class Produto {

    private String nome;
    private String marca;
    private double valor;
    private String tamanho;
    private String itensInclusos;
    public String getNome() {
        return nome;
    }
    //Constructor
    public void Produto(){
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        this.tamanho = tamanho;
        this.itensInclusos= itensInclusos;
    }

    //Getters and Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(String itensInclusos) {
        this.itensInclusos = itensInclusos;
    }


}
