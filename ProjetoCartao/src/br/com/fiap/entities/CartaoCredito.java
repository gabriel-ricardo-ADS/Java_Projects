package br.com.fiap.entities;

public class CartaoCredito extends Cartao {

    private double renda;
    private double limiteUtilizado;
    private int scoreCredito;

    public CartaoCredito() {
    }

    public CartaoCredito(double renda, double limiteUtilizado, int scoreCredito) {
        this.renda = renda;
        this.limiteUtilizado = limiteUtilizado;
        this.scoreCredito = scoreCredito;
    }

    public CartaoCredito(int numero, String banco, int agencia, String bandeira, int cvv, String anoValidade,
                         double renda, double limiteUtilizado, int scoreCredito) {

        super(numero, banco, agencia, bandeira, cvv, anoValidade);
        this.renda = renda;
        this.limiteUtilizado = limiteUtilizado;
        this.scoreCredito = scoreCredito;
    }

    @Override
    public double calculoLimite() {

        if (!ativo) return 0;

        double limite = renda * 2;

        if (scoreCredito >= 700) {
            limite += 1000;
        }

        double limiteDisponivel = limite - limiteUtilizado;

        if (limiteDisponivel <= 0) return 0;

        return limiteDisponivel;
    }

    @Override
    public String tipoCartao() {
        return "CARTAO DE CREDITO";
    }

    @Override
    public String toString() {
        return tipoCartao() +
                "\nCliente: " + cliente +
                "\nRenda: " + renda +
                "\nLimite Utilizado: " + limiteUtilizado +
                "\nScore Credito: " + scoreCredito +
                "\nNumero: " + numero +
                "\nBanco: " + banco +
                "\nAgencia: " + agencia +
                "\nBandeira: " + bandeira +
                "\nLimite Disponivel: " + calculoLimite();
    }
}