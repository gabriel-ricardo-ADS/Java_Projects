package br.com.fiap.entities;

public class Colaborador {

    private String nome;
    private int numeroRegistro;
    private String cpf;
    private double valorHora;
    private double quantidadeHora;
    private Endereco endereco;

    public Colaborador() {
    }

    public Colaborador(String nome, int numeroRegistro, String cpf, double valorHora, double quantidadeHora) {
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.cpf = cpf;
        this.valorHora = valorHora;
        this.quantidadeHora = quantidadeHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQuantidadeHora() {
        return quantidadeHora;
    }

    public void setQuantidadeHora(double quantidadeHora) {
        this.quantidadeHora = quantidadeHora;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "---DADOS DO COLABORADOR---" +
                "\nnome: " + nome +
                "\nnúmero de registro: " + numeroRegistro +
                "\ncpf: " + cpf +
                "\nvalor hora: " + valorHora +
                "\nquantidade de horas: " + quantidadeHora + endereco;
    }
}
