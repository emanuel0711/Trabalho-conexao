/*
 * This source file was generated by the Gradle 'init' task
 */
package com.example.conexao;

import java.sql.Connection;

public class App {

    public static void main(String[] args) {
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        Connection conexao = conexaoSQLite.conectar();
        
        CriarTabela.criarTabelaUsuarios(conexao);
        InserirUsuario.inserirUsuario(conexao, "emanuel" , "emanuelchaves@gmail.com");
        InserirUsuario.inserirUsuario(conexao, "Ariel" , "ariellorenz@gmail.com");
        InserirUsuario.inserirUsuario(conexao, "natan" , "natansilva@gmail.com");
        InserirUsuario.inserirUsuario(conexao, "gustavo" , "gustavoribeiro@gmail.com");
    }
}
