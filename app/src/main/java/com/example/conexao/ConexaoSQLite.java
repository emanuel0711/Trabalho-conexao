/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author emanu
 */
public class ConexaoSQLite {

    // metodo para conectar ao banco de dados
    public Connection conectar() {
        Connection conexao = null;
        String url = "jdbc:sqlite:usuariosNovo.db";

        try {

            conexao = DriverManager.getConnection(url);
            System.out.println("conexao com o SQL estabelecida");
        } catch (SQLException e) {
            System.out.println("erro ao conectar ao banco:" + e.getMessage());
        }
        return conexao;
    }

    //metodo para fechar a conexao com o banco de dados
    public void desconectar(Connection conexao) {
    }

}
