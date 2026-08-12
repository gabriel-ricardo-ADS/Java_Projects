package br.com.fiap.entities;

public class Remedio {
    private int codigo;
    private String  laboratorio;
    private String nome;
    private String dataFabricacao;
    private String dataValidade;
    private double preco;

    public Remedio() {
    }

    public Remedio(int codigo, String laboratorio, String nome, String dataFabricacao, String dataValidade, double preco) {
        this.codigo = codigo;
        this.laboratorio = laboratorio;
        this.nome = nome;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\n\nRemédio:" +
                "\ncodigo=" + codigo +
                "\nlaboratorio='" + laboratorio + '\'' +
                "\nnome='" + nome + '\'' +
                "\ndataFabricacao='" + dataFabricacao + '\'' +
                "\ndataValidade='" + dataValidade + '\'' +
                "\npreco=" + preco;
    }

}
