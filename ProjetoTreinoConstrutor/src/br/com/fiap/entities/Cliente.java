package br.com.fiap.entities;

public class Cliente {

    // visibilidade, tipo de dados e atributos
    private String nome;
    private int idade;
    private String cpf;
    private double renda;
    private Endereco endereco;

    //metodo construtor vazio
    public Cliente() {
    }
    //metodo construtor com parametro cheio, sem atributo de referencia

    public Cliente(String nome, int idade, String cpf, double renda) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.renda = renda;
    }

    //getters e setters
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

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //to string

    @Override
    public String toString() {
        return "---DADOS DO CLIENTE---" +
                "\nnome: " + nome +
                "\nidade: " + idade +
                "\ncpf: " + cpf +
                "\nrenda: " + renda +
                endereco;
    }

}
