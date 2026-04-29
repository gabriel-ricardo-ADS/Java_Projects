package br.com.fiap.entities;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String razaoSocial;
    private String segmento;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String razaoSocial, String segmento) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.segmento = segmento;
    }

    public PessoaJuridica(String nome, String email, String fone, double renda, String cnpj, String razaoSocial, String segmento) {
        super(nome, email, fone, renda);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.segmento = segmento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    @Override
    public String toString() {
        return
                tipoPessoa() +
                super.toString() +
                "\ncnpj=" + cnpj +
                "\nrazaoSocial=" + razaoSocial +
                "\nsegmento=" + segmento;
    }

    @Override
    public String tipoPessoa() {
        return "\n\nPessoaJurídica";
    }
}
