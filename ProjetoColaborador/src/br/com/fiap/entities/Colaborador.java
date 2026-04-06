package br.com.fiap.entities;

public class Colaborador {

    private int numeroRegistro;
    private String nome;
    private String cargo;
    private double qtdHora;
    private double valorHora;
    private double percentual; // Será calculada automaticamente

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(double qtdHora) {
        this.qtdHora = qtdHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public Colaborador(int numeroRegistro, String nome, String cargo, double qtdHora, double valorHora) {
        this.numeroRegistro = numeroRegistro;
        this.nome = nome;
        this.cargo = cargo;
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        double irCalculado = calcularIr();

        return "\n---DADOS DO COLABORADOR---" +
                "\nNúmero de Registro: " + numeroRegistro +
                "\nNome: " + nome +
                "\nCargo: " + cargo +
                "\nStatus: " + status() +
                "\n---CÁLCULO DE SALÁRIO---\n" +
                "Salário Bruto: R$ " + calcularSalario() +
                "\nPercentual aplicado: " + percentual + "%" +
                "\nDesconto IR: R$ " + irCalculado +
                "\nSalário Líquido: R$ " + salarioLiquido();
    }

    // Métodos Workers
    public double calcularSalario() {
        return qtdHora * valorHora;
    }

    public double calcularIr() {

        if (calcularSalario() <= 5000.00) {
            this.percentual = 0;
            return 0;
        } else {
            this.percentual = 27.5;
            return (calcularSalario() * 0.275);
        }
    }

    public double salarioLiquido() {
        return calcularSalario() - calcularIr();
    }

    public String status() {
        if (calcularSalario() <= 5000.00) {
            return "Isento de IR";
        } else {
            return "Contribuinte de IR";
        }
    }
}