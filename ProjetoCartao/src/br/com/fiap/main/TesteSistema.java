package br.com.fiap.main;

import br.com.fiap.entities.*;

import javax.swing.*;

public class TesteSistema {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    static boolean bool(String j){
        int op = JOptionPane.showConfirmDialog(null, j, "Ativo?", JOptionPane.YES_NO_OPTION);
        return op == JOptionPane.YES_OPTION;
    }

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                texto("Nome:"),
                texto("CPF:"),
                texto("Email:")
        );

        int tipo = inteiro("1 - Credito\n2 - Debito");

        if (tipo == 1){

            CartaoCredito c = new CartaoCredito(
                    inteiro("Numero:"),
                    texto("Banco:"),
                    inteiro("Agencia:"),
                    texto("Bandeira:"),
                    inteiro("CVV:"),
                    texto("Validade:"),
                    real("Renda:"),
                    real("Limite utilizado:"),
                    inteiro("Score:")
            );

            c.setCliente(cliente);
            c.setAtivo(bool("Cartão ativo?"));

            JOptionPane.showMessageDialog(null, c);

        } else if (tipo == 2){

            double saldo = real("Saldo:");
            double limiteDiario = real("Limite diario:");
            double usado = real("Valor utilizado hoje:");

            CartaoDebito d = new CartaoDebito(
                    inteiro("Numero:"),
                    texto("Bandeira:"),
                    saldo,
                    limiteDiario,
                    usado
            );

            d.setCliente(cliente);
            d.setAtivo(bool("Cartão ativo?"));

            JOptionPane.showMessageDialog(null, d);

        } else {
            JOptionPane.showMessageDialog(null, "Opcao invalida");
        }
    }
}
