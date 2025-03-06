/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.conexao;

/**
 *
 * @author emanu
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginValidar{
    public static boolean validarUsuario(Connection conexao, String nome, String email) {
        String sql = "SELECT * FROM usuarios WHERE nome = ? AND email = ?";

        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            pstmt.setString(2, email);

            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next(); // Retorna true se encontrar um usuário com nome e email correspondentes
            }
        } catch (SQLException e) {
            System.out.println("Erro ao validar usuário: " + e.getMessage());
            return false;
        }
    }
}