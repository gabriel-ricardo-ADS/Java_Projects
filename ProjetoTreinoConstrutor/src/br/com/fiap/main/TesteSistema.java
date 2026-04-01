package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

import javax.swing.*;

public class TesteSistema {
    //String
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    //double
    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    //int
    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));

    }

    public static void main(String[] args) {

        //String nome, int idade, String cpf, double renda
        Cliente objCliente = new Cliente(
                texto("DADOS DO CLIENTE:\n nome"),
                inteiro("idade"),
                texto("cpf"),
                real("renda")
        );

        //String logradouro, int numero, String complemento, String cep, String bairro, String cidade, String estado
        Endereco objEndCliente = new Endereco(
                texto("ENDEREÇO DO CLIENTE:\n logradouro"),
                inteiro("Número"),
                texto("Complemento"),
                texto("cep"),
                texto("Bairro"),
                texto("Cidade"),
                texto("Estado")
        );

        //String codigo, String tipo, String marca, double valor
        Produto objProduto = new Produto(
                texto("DADOS DO PRODUTO:\n codigo"),
                texto("tipo"),
                texto("marca"),
                real("valor")
        );

    objCliente.setEndereco(objEndCliente);

        System.out.println(
                objCliente + "" + objProduto
        );

    }


}