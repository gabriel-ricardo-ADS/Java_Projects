package br.com.fiap.dao;

import br.com.fiap.conexoes.ConexoesFactory;
import br.com.fiap.entities.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDao {

    public Connection minhaConexao;

    public ProdutoDao() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexoesFactory().conexao();
    }

    //insert
    public String inserir(Produto produto) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("INSERT INTO TB_FIAP_PRODUTO");

        return "Produto cadastrado com sucesso";
    }
}


