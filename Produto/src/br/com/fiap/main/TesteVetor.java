package br.com.fiap.main;

import br.com.fiap.entities.Produto;

import javax.swing.*;

public class TesteVetor {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }


    static void main(String[] args) {



        Produto[] vetorProdutos = new Produto[3];

        int indice = 0;

        do {
            vetorProdutos[indice] = new Produto();
            vetorProdutos[indice].setCodigo(inteiro("Código"));
            vetorProdutos[indice].setTipo(texto("Tipo"));
            vetorProdutos[indice].setMarca(texto("Marca"));
            vetorProdutos[indice].setValor(real("Valor"));

            indice ++;

        }while(JOptionPane.showConfirmDialog(null,
                "Adicionar mais produto?", "Carrinho de compras",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        for(int buscar = 0; buscar<indice; buscar++){
            System.out.println(
                    "\n\nCódigo: " + vetorProdutos[buscar].getCodigo() +
                    "\nTipo: " + vetorProdutos[buscar].getTipo() +
                    "\nMarca: " + vetorProdutos[buscar].getMarca() +
                    "\nValor: " + vetorProdutos[buscar].getValor()
            );

        }

    }

}