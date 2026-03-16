package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

public class TesteSistema {

    // metodo de execução
    public static void main(String[] args) {

        // instanciar objetos
        Colaborador objColaborador = new Colaborador();
        Endereco objEndereco = new Endereco();
        Produto objProduto = new Produto();

        // entradas
        objColaborador.setNome("Daniel");
        objColaborador.setCpf("123.456.789-10");
        objColaborador.setCargo("Gerente");
        objColaborador.setIdade(21);
        objColaborador.setSalario(5.000);

        objEndereco.setLogradouro("Rua Aca");
        objEndereco.setNumero(90);
        objEndereco.setComplemento("Apartamento");
        objEndereco.setCep("01234-080");
        objEndereco.setBairro("Paulista");
        objEndereco.setCidade("São Paulo");
        objEndereco.setEstado("SP");

        objProduto.setCodigo(122333);
        objProduto.setTipo("Tenis");
        objProduto.setMarca("Nike");
        objProduto.setPreco(400);

        objColaborador.setEndereco(objEndereco);


        // saidas
        System.out.println(
                "Nome: " + objColaborador.getNome() +
                        "\nCPF: " + objColaborador.getCpf() +
                        "\nIdade: " + objColaborador.getIdade() +
                        "\nCargo: " + objColaborador.getCargo() +
                        "\nSalario: " + objColaborador.getSalario() +
                        "\n\nEndereço\nLogradouro: " + objColaborador.getEndereco().getLogradouro() +
                        "\nNumero: " + objColaborador.getEndereco().getNumero() +
                        "\nComplemento :" + objColaborador.getEndereco().getComplemento() +
                        "\nCep: " + objColaborador.getEndereco().getCep() +
                        "\nBairro: " + objColaborador.getEndereco().getBairro() +
                        "\nCidade: " + objColaborador.getEndereco().getCidade() +
                        "\nEstado: " + objColaborador.getEndereco().getEstado() +
                        "\n\nProduto\nCodigo: " + objProduto.getCodigo() +
                        "\nTipo: " + objProduto.getTipo() +
                        "\nMarca: " + objProduto.getMarca() +
                        "\nPreco: " + objProduto.getPreco()
                );


    }
}
