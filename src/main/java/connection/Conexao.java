/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author richard
 */
public class Conexao {
   
    public static void main(String[] args) throws SQLException{
        Connection conexao = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/faculdade", "root", "root");
            ResultSet rsClient = conexao.createStatement().executeQuery("SELECT * FROM Student;");
            while(rsClient.next()){
                System.out.println("Nome: " + rsClient.getString("nome"));
                System.out.println("Email: " + rsClient.getString("email"));
                System.out.println("celular : " +  rsClient.getString("celular"));
                
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco");
        }finally{
            if(conexao!=null){
                conexao.close();
            }
        }
    
   }

    
}
