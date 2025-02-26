/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.conexao;

/**
 *
 * @author emanu
 */
public class InserirUsuario {
   public static void inserirUsuario(Connection conexao, String nome, String email){
    String sql = "INSERT INTO usuarios(nome, email) VALUES (? , ? )";
    
    try ( PrepareStatement  pstmt = conexao.prepareStatement(sql)) {
    
            pstmt.setString( 1, nome);
            pstmt.setString( 2, email);
            
            pstmt.executeUpdate(sql);
            
            System.out.println("usuario inserido com sucesso");
     } catch (Exception e){
        System.out.println("Erro ao inserir usuario" + e.getMessage());
        }
    
}
    
   }