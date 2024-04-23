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

   private static final String url = "50.17.168.173:3306/";
   private static final String user = "admin";
   private static final String password = "ZpVCzKU6bY79xS4V9ZFb";
   
    public static Connection getConexao() {
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
