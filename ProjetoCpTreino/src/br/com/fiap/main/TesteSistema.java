package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

import javax.swing.*;


public class TesteSistema {

    //metodo de execução
    public static void main(String[] args) {

        //instanciar objetos
        Cliente objCliente = new Cliente();
        Endereco objEndereco = new Endereco();
        Produto objProduto = new Produto();

        //entradas
        objCliente.setNome(JOptionPane.showInputDialog("Informações pessoais\nInforme o nome: "));
        objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
        objCliente.setCpf(JOptionPane.showInputDialog("Informe o cpf: "));
        objCliente.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: ")));
        objCliente.setCalcado(Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do calçado: ")));
        objCliente.setEndereco(objEndereco);

        objEndereco.setLogradouro(JOptionPane.showInputDialog("Endereço\nInforme o logradouro: "));
        objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe a numero: ")));
        objEndereco.setComplemento(JOptionPane.showInputDialog("Informe o complemento: "));
        objEndereco.setCep(JOptionPane.showInputDialog("Informe o cep: "));
        objEndereco.setBairro(JOptionPane.showInputDialog("Informe o Bairro: "));
        objEndereco.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
        objEndereco.setEstado(JOptionPane.showInputDialog("Informe o Estado: "));

        objProduto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Produto\naInforme o codigo: ")));
        objProduto.setTipo(JOptionPane.showInputDialog("Informe o tipo: "));
        objProduto.setMarca(JOptionPane.showInputDialog("Informe a marca: "));
        objProduto.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço: ")));

        //saidas
        System.out.println(
                objCliente + "" + objProduto
        );

    }

}
