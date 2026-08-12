package br.com.fiap.main;


import br.com.fiap.entities.Remedio;

import javax.swing.*;
import java.sql.Array;
import java.util.ArrayList;

public class TesteArrayList {
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
        ArrayList<Remedio> listaRemedio = new ArrayList<Remedio>();

        Remedio objRemedio = null;

        do{
            objRemedio = new Remedio();
            objRemedio.setCodigo(inteiro("Código"));
            objRemedio.setLaboratorio(texto("Laboratório"));
            objRemedio.setNome(texto("Nome"));
            objRemedio.setDataFabricacao(texto("Data de fabricação"));
            objRemedio.setDataValidade(texto("Data de validade"));
            objRemedio.setPreco(real("Preço"));

            listaRemedio.add(objRemedio);
        }while(
                JOptionPane.showConfirmDialog(null,
                        "Adicionar mais remédios?",
                        "Lista de Remédios",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE)
         ==0 );

        for(Remedio r : listaRemedio){
            System.out.println(r.toString());
        }
    }
}
