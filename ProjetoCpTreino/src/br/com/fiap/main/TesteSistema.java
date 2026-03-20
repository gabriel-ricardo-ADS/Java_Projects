package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;


public class TesteSistema {

    //metodo de execução
    public static void main(String[] args) {

        //instanciar objetos
        Cliente objCliente = new Cliente();
        Endereco objEndereco = new Endereco();
        Produto objProduto = new Produto();

        //entradas
        objCliente.setNome("Gabriel");
        objCliente.setIdade(20);
        objCliente.setCpf("123456789-10");
        objCliente.setAltura(1.80);
        objCliente.setCalcado(41);
        objCliente.setEndereco(objEndereco);

        objEndereco.setLogradouro("Av. Paulista");
        objEndereco.setNumero(100);
        objEndereco.setComplemento("Ap");
        objEndereco.setCep("02010-090");
        objEndereco.setBairro("Paulista");
        objEndereco.setCidade("São Paulo");
        objEndereco.setEstado("SP");

        objProduto.setCodigo(123456789);
        objProduto.setTipo("Calçado");
        objProduto.setMarca("Nike");
        objProduto.setPreco(449.90);

        //saidas
        System.out.println(
                objCliente + "" + objProduto
        );

    }

}
