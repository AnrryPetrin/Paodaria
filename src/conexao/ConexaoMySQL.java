/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author anrry
 */
public class ConexaoMySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/Paodaria";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    
    private static Connection conexao;

    public static Connection obterConexao() {
        if (conexao == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        
        return conexao;
    }

    public static void fecharConexao() {
        if (conexao != null) {
            try {
                conexao.close();
                conexao = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

