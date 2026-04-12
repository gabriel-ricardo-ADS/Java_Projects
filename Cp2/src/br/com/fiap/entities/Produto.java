package br.com.fiap.entities;

public class Produto {
    private double codigo;
    private String tipo;
    private String nome;
    private String autor;
    private double preco;

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(double codigo, String tipo, String nome, String autor, double preco) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\n---DADOS DO PRODUTO---" +
                "\ncódigo: " + codigo +
                "\ntipo: " + tipo +
                "\nnome: " + nome +
                "\nautor: " + autor +
                "\npreco: " + preco;
    }
}
