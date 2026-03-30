package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Empresa;

import javax.swing.*;

public class TesteSistema {
    //String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    //double
    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    //int
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));

    }


    public static void main(String[] args) {

        //String nome, int numeroRegistro, String cpf, double valorHora, double quantidadeHora
        Colaborador objColaborador = new Colaborador(
                texto("Nome"),
                inteiro("Número de Registro"),
                texto("cpf"),
                real("Valor da hora trabalhada"),
                real("Quantidade de horas trabalhadas")
        );
        //String logradouro, int numero, String complemento, String cep, String bairro, String cidade, String estado
        Endereco objEndereco = new Endereco(
                texto("logradouro"),
                inteiro("Número"),
                texto("Complemento"),
                texto("cep"),
                texto("Bairro"),
                texto("Cidade"),
                texto("Estado")

        );

        //String cnpj, String nomeFantasia, String razaoSocial, String segmento
        Empresa objEmpresa = new Empresa(
                texto("cnpj"),
                texto("Nome Fantasia"),
                texto("Razão Social"),
                texto("Segmento")
        );

        objColaborador.setEndereco(objEndereco);

        System.out.println(
                objColaborador + "" + objEmpresa
        );


    }

}
