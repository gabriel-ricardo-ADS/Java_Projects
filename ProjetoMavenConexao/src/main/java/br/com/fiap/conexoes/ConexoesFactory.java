package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexoesFactory {

    //metodo de conexao com o banco de dados
    public Connection conexao() throws ClassNotFoundException, SQLException {
        //Driver
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //Retornar a conexao
        return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
                "USUARIO", "SENHA");

    }

}
