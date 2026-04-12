package br.com.fiap.entities;

public class Cliente {
    private double codigo;
    private String nome;
    private String cpf;
    private int idade;
    private double valorHora;
    private Endereco endereco;

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente(double codigo, String nome, String cpf, int idade, double valorHora) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "---DADOS DO CLIENTE---" +
                "\ncódigo: " + codigo +
                "\nnome: " + nome +
                "\ncpf: " + cpf +
                "\nidade: " + idade +
                "\nvalorHora: " + valorHora + endereco;
    }
}
