/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.ConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import objetos.Produto;
import objetos.Util;
/**
 *
 * @author anrry
 */
public class ProdutoDAO {
    private final ConexaoMySQL conexao;
    private final Connection conn;
    
    public ProdutoDAO() {
        this.conexao = new ConexaoMySQL();
        this.conn = ConexaoMySQL.obterConexao(); 
    }
    
    public void inserir(Produto produto) {
        String sql = "INSERT INTO Produto(nome, preco, quantidade) VALUES "
                + "?, ? ,?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setString(3, produto.getQuantidade());
            stmt.execute();
        } catch(SQLException e) {
            Util.exibirMensagem("Erro ao inserir produto: " + e.getMessage());
        }
    }
}
