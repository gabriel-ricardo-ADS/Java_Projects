package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;

public class TesteSistema {

    // metodo de execução
    public static void main(String[] args) {

        // instanciar objetos
        Cliente objCliente = new Cliente();
        Endereco objEndereco = new Endereco();

        // entradas
        objCliente.setNome("Gabriel");
        objCliente.setCpf("123.456.789-10");
        objCliente.setIdade(21);
        objCliente.setAltura(1.75);

        objEndereco.setLogradouro("Rua Ali");
        objEndereco.setNumero(890);
        objEndereco.setComplemento("Casa");
        objEndereco.setCep("00000-000");
        objEndereco.setBairro("Paulista");
        objEndereco.setCidade("São Paulo");
        objEndereco.setEstado("SP");

        objCliente.setEndereco(objEndereco);

        // saidas
        System.out.println(
                "Nome: " + objCliente.getNome() +
                "\nCPF: " + objCliente.getCpf() +
                "\nIdade: " + objCliente.getIdade() +
                "\nAltura: " + objCliente.getAltura() +
                "\n\nEndereço\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
                "\nNumero: " + objCliente.getEndereco().getNumero() +
                "\nComplemento :" + objCliente.getEndereco().getComplemento() +
                "\nCep: " + objCliente.getEndereco().getCep() +
                "\nBairro: " + objCliente.getEndereco().getBairro() +
                "\nCidade: " + objCliente.getEndereco().getCidade() +
                "\nEstado: " + objCliente.getEndereco().getEstado()

        );
    }
}
