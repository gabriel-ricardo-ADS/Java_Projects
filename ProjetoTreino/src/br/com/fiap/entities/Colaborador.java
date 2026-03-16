package br.com.fiap.entities;

public class Colaborador {
    //visibilidade, tipo de dados e atributos
    private String nome; // Gabriel
    private String cpf; // 444.444.444-44
    private String cargo; // Gerente
    private int idade; // 20
    private double salario; // 5000
    private Endereco endereco; //Rua Ali

    // setters e getters

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //toString

    @Override
    public String toString() {
        return "Colaborador " +
                "\nnome: " + nome +
                "\ncpf: " + cpf +
                "\ncargo: " + cargo +
                "\nidade: " + idade +
                "\nsalario: " + salario + endereco;
    }
}
