package br.com.fiap.entities;

public class Produto {
    private int codigo;
    private String tipo;
    private String marca;
    private double valor;
    private double taxaDesconto;

    public Produto() {
    }

    public Produto(int codigo, String tipo, String marca, double valor) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.valor = valor;
        this.atualizarTaxaDesconto();
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public double getValor() { return valor; }

    public void setValor(double valor) {
        this.valor = valor;
        this.atualizarTaxaDesconto();
    }

    public double getTaxaDesconto() { return taxaDesconto; }

    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    // Define apenas a TAXA (porcentagem)
    public void atualizarTaxaDesconto() {
        if (this.valor >= 112.00) {
            this.taxaDesconto = 0.115;
        } else if (this.valor >= 75.00) {
            this.taxaDesconto = 0.055;
        } else {
            this.taxaDesconto = 0;
        }
    }

    // Valor do desconto em reais
    public double calcularDesconto() {
        return this.valor * this.taxaDesconto;
    }

    // Valor final com desconto
    public double calcularValorFinal() {
        return this.valor - calcularDesconto();
    }

    @Override
    public String toString() {
        return "---Dados do Produto---" +
                "\ncódigo: " + codigo +
                "\ntipo: " + tipo +
                "\nmarca: " + marca +
                "\nvalor original: R$" + valor +
                "\npercentual de desconto: " + (taxaDesconto * 100) + "%" +
                "\nvalor do desconto: R$" + calcularDesconto() +
                "\nvalor final: R$" + calcularValorFinal();
    }
}