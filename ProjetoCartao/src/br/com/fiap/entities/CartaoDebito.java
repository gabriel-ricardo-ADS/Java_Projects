package br.com.fiap.entities;

public class CartaoDebito extends Cartao {

    private double saldo;
    private double limiteDiario;
    private double valorUtilizado;

    public CartaoDebito() {
    }

    public CartaoDebito(double saldo, double limiteDiario, double valorUtilizado) {
        this.saldo = saldo;
        this.limiteDiario = limiteDiario;
        this.valorUtilizado = valorUtilizado;
    }

    public CartaoDebito(int numero, String bandeira, double saldo, double limiteDiario, double valorUtilizado) {
        super(numero, bandeira);
        this.saldo = saldo;
        this.limiteDiario = limiteDiario;
        this.valorUtilizado = valorUtilizado;
    }

    public void setSaldo(double saldo) { this.saldo = saldo; }
    public void setValorUtilizado(double valorUtilizado) { this.valorUtilizado = valorUtilizado; }

    @Override
    public double calculoLimite() {

        if (!ativo) return 0;

        if (saldo <= 0) return 0;

        double limiteRestante = limiteDiario - valorUtilizado;

        if (limiteRestante <= 0) return 0;

        if (saldo < limiteRestante) {
            return saldo;
        } else {
            return limiteRestante;
        }
    }

    @Override
    public String tipoCartao() {
        return "CARTAO DE DEBITO";
    }

    public double saldoTotal(){
        return saldo - valorUtilizado;
    }

    @Override
    public String toString() {
        return tipoCartao() +
                super.toString() +
                "\nSaldo: " + saldo +
                "\nLimite Diario: " + limiteDiario +
                "\nValor Utilizado: " + valorUtilizado +
                "\nSaldo Total: " + saldoTotal() +
                "\nLimite Disponivel: " + calculoLimite();
    }
}
