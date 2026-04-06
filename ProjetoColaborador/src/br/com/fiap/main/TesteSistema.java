package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;
import javax.swing.*;

public class TesteSistema {


    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }
    //pedi para a IA como arrumar os statics apenas
    static double real(String j) {
        String res = JOptionPane.showInputDialog(j);
        return (res != null && !res.isEmpty()) ? Double.parseDouble(res) : 0;
    }

    static int inteiro(String j) {
        String res = JOptionPane.showInputDialog(j);
        return (res != null && !res.isEmpty()) ? Integer.parseInt(res) : 0;
    }

    public static void main(String[] args) {
        //int numeroRegistro, String nome, String cargo, double qtdHora, double valorHora, double percentual
        Colaborador objColaborador = new Colaborador(
                inteiro("DADOS DO COLABORADOR:\nNúmero de Registro:"),
                texto("Nome:"),
                texto("Cargo:"),
                real("Quantidade de Horas Trabalhadas:"),
                real("Valor da Hora Trabalhada:")
        );

        System.out.println(objColaborador);

    }
}