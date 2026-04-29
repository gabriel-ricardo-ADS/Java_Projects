package br.com.fiap.entities;

public class PessoaFisica extends Pessoa { //extends = uma classe herdar a outra

    private String cpf;
    private String rg;
    private String dataNascimento;
    private DadosBancarios dadosBancarios; //atributo de referencia

    public PessoaFisica() {
    }

    public PessoaFisica(String cpf, String rg, String dataNascimento) {
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public DadosBancarios getDadosBancarios() {
        return dadosBancarios;
    }

    public void setDadosBancarios(DadosBancarios dadosBancarios) {
        this.dadosBancarios = dadosBancarios;
    }

    public PessoaFisica(String nome, String email, String fone, double renda, String cpf, String rg, String dataNascimento) {
        super(nome, email, fone, renda);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return
                tipoPessoa() +
                super.toString() +
                "\ncpf=" + cpf +
                "\nrg=" + rg +
                "\ndataNascimento=" + dataNascimento + dadosBancarios;
    }

    @Override
    public String tipoPessoa() {
        return "\n\nPessoaFisíca";
    }
}