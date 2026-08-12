package br.com.fiap.main;
import br.com.fiap.entities.Remedio;

import javax.swing.*;
import java.awt.*;

public class TesteVetor {

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

        Remedio[] vetorRemedio = new Remedio[3];

        int indice = 0;

        do{

            vetorRemedio[indice] = new Remedio();
            vetorRemedio[indice].setCodigo(inteiro("Código"));
            vetorRemedio[indice].setLaboratorio(texto("Laboratório"));
            vetorRemedio[indice].setNome(texto("Nome"));
            vetorRemedio[indice].setDataFabricacao(texto("Data de Fabricação"));
            vetorRemedio[indice].setDataValidade(texto("Data de validade"));
            vetorRemedio[indice].setPreco(real("Preço"));

            indice ++;

        }while(
                JOptionPane.showConfirmDialog(null,
                        "Adicionar mais remédios?",
                        "Espaço de remédios",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) ==0);
        for (int buscar=0; buscar<indice; buscar++){
            System.out.println(
                    vetorRemedio[buscar].toString()
            );
        }
    }
}