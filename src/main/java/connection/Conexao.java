/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author richard
 */
public class Conexao {

   private static final String url = "jdbc:mysql://localhost/faculdade";
   private static final String user = "root";
   private static final String password = "";
   
    protected static Connection getConexao() {
        try {
            final Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao ok");
            return conn;
        }
        catch (SQLException ex) {
           System.out.println("Driver do banco de dados não localizado");
           System.out.println(ex.getMessage());
            return null;
        }
    }
}
