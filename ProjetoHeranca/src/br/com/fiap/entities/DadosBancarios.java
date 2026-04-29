package br.com.fiap.entities;

public class DadosBancarios {
    private String banco;
    private String agencia;
    private String numeroConta;
    private String tipoDeConta;

    public DadosBancarios() {
    }

    public DadosBancarios(String banco, String agencia, String numeroConta, String tipoDeConta) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoDeConta = tipoDeConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    @Override
    public String toString() {
        return "\nDadosBancarios: " +
                "\nbanco=" + banco +
                "\nagencia=" + agencia +
                "\nnumeroConta=" + numeroConta +
                "\ntipoDeConta=" + tipoDeConta;
    }
}
