package br.com.fiap.main;
import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

import javax.swing.*;
import java.sql.Statement;

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
        //double codigo, String nome, String cpf, int idade, double valorHora
        Cliente objCliente = new Cliente(
                real("DADOS DO CLIENTE:\ncódigo: "),
                texto("nome: "),
                texto("cpf: "),
                inteiro("idade: "),
                real("valor da hora: ")
        );
        //String logradouro, int numero, String complemento, String cep, String bairro, String cidade, String estado
        Endereco objEndereco = new Endereco(
                texto("DADOS DO ENDERECO:\nlogradouro: "),
                inteiro("numero: "),
                texto("complemento: "),
                texto("cep: "),
                texto("bairro: "),
                texto("cidade: "),
                texto("estado: ")
        );
        //double codigo, String tipo, String nome, String autor, double preco
        Produto objProduto = new Produto(
                real("DADOS DO PRODUTO:\ncódigo: "),
                texto("tipo: "),
                texto("nome: "),
                texto("autor: "),
                real("preco: ")
        );

        objCliente.setEndereco(objEndereco);

        System.out.println(objCliente + " " + objProduto);
    }
}
