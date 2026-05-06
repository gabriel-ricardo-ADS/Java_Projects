package br.com.fiap.entities;

public abstract class Cartao {

    protected int numero;
    protected String banco;
    protected int agencia;
    protected String bandeira;
    protected int cvv;
    protected String anoValidade;
    protected boolean ativo;
    protected Cliente cliente;

    public abstract double calculoLimite();
    public abstract String tipoCartao();

    public Cartao() {
    }

    public Cartao(int numero, String banco, int agencia, String bandeira, int cvv, String anoValidade) {
        this.numero = numero;
        this.banco = banco;
        this.agencia = agencia;
        this.bandeira = bandeira;
        this.cvv = cvv;
        this.anoValidade = anoValidade;
    }

    // 🔹 construtor simples (usado no débito)
    public Cartao(int numero, String bandeira) {
        this.numero = numero;
        this.bandeira = bandeira;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getBanco() { return banco; }
    public void setBanco(String banco) { this.banco = banco; }

    public int getAgencia() { return agencia; }
    public void setAgencia(int agencia) { this.agencia = agencia; }

    public String getBandeira() { return bandeira; }
    public void setBandeira(String bandeira) { this.bandeira = bandeira; }

    public int getCvv() { return cvv; }
    public void setCvv(int cvv) { this.cvv = cvv; }

    public String getAnoValidade() { return anoValidade; }
    public void setAnoValidade(String anoValidade) { this.anoValidade = anoValidade; }

    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    @Override
    public String toString(){
        return "\nCliente: " + cliente +
                "\nNumero: " + numero +
                "\nBandeira: " + bandeira;
    }
}
