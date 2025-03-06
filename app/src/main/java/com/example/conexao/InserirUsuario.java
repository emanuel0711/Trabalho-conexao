package com.example.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Classe responsável por inserir um usuário no banco de dados.
 */
public class InserirUsuario {

    /**
     * Método para inserir um usuário na tabela "usuarios".
     *
     * @param conexao Objeto de conexão com o banco de dados.
     * @param nome Nome do usuário.
     * @param email Email do usuário.
     */
    public static void inserirUsuario(Connection conexao, String nome, String email) {
        
        String sql = "INSERT INTO usuarios(nome, email) VALUES (?, ?)";
        
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            
            /**
             * Try e Catch:
             * - O bloco try contém o código que pode gerar exceções (erros inesperados).
             * - O bloco catch captura e trata esses erros, evitando que o programa falhe abruptamente.
             */
            
            /**
             * PreparedStatement (pstmt):
             * - Interface do Java usada para executar comandos SQL parametrizados.
             * - Melhora a segurança contra injeção de SQL e pode otimizar o desempenho.
             */
            
            // Define os valores dos parâmetros da consulta
            pstmt.setString(1, nome); // Define o valor do primeiro parâmetro "?" com a string "nome".
            pstmt.setString(2, email); // Define o valor do segundo parâmetro "?" com a string "email".
            
            /**
             * pstmt.executeUpdate():
             * - Executa a query de inserção no banco de dados.
             */
            pstmt.executeUpdate();
            
            System.out.println("Usuario inserido com sucesso.");
            
        } catch (SQLException e) {
            
            // Captura e exibe o erro caso ocorra alguma exceção SQL
            System.out.println("Erro ao inserir usuário: " + e.getMessage());
        }
        
    }
}
