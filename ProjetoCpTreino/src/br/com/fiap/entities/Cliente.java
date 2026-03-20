package br.com.fiap.entities;

public class Cliente {

    // visibilidade, tipo de dados e atributos
    private String nome;
    private int idade;
    private String cpf;
    private double altura;
    private int calcado;
    private Endereco endereco;

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getCalcado() {
        return calcado;
    }

    public void setCalcado(int calcado) {
        this.calcado = calcado;
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
                "\naltura: " + altura +
                "\ncalcado: " + calcado +
                endereco;
    }

}
