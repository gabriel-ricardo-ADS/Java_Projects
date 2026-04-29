package br.com.fiap.main;

import br.com.fiap.entities.PessoaFisica;
import br.com.fiap.entities.PessoaJuridica;
import br.com.fiap.entities.DadosBancarios;

import javax.swing.*;

public class TesteSistema {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }
    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {
        PessoaFisica objPessoaFisica = new PessoaFisica(
                texto("Informação da pessoa física:\nNome: "),
                texto("Email: "),
                texto("Fone: "),
                real("Renda: "),
                texto("Cpf: "),
                texto("RG: "),
                texto("Data de nascimento: ")
        );

        PessoaJuridica objPessoaJuridica = new PessoaJuridica(
                texto("Informações da pessoa jurídica:\nNome: "),
                texto("Email: "),
                texto("Fone: "),
                real("Renda: "),
                texto("Cnpj: "),
                texto("Razão Social: "),
                texto("Segmento: ")
        );

        DadosBancarios objDadosBancarios = new DadosBancarios(
                texto("Dados Bancários:\nBanco: "),
                texto("Agencia: "),
                texto("Numero da conta: "),
                texto("Tipo de conta: ")
        );
        objPessoaFisica.setDadosBancarios(objDadosBancarios);

        System.out.println(objPessoaFisica + "\n" + objPessoaJuridica);

    }
}
