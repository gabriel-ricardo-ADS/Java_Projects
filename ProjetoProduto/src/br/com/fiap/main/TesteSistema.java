package br.com.fiap.main;

import br.com.fiap.entities.Produto;
import javax.swing.JOptionPane;

public class TesteSistema {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        int codigo = inteiro("DADOS DO PRODUTO:\nCódigo:");
        String tipo = texto("Tipo:");
        String marca = texto("Marca:");
        double valor = real("Valor:");

        Produto objProduto = new Produto(codigo, tipo, marca, valor);

        JOptionPane.showMessageDialog(null, objProduto.toString());
    }
}
