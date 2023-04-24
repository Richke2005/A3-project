/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classes;
import connection.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author richa
 */
public class FirstCrud {

    public static void main(String[] args){
       cadastrar();
       
    }
    
    public static void cadastrar(){
        String nome = "ailton";
        String end = "rua ines de castro";
        String num = "119471009";
        String email = "leodke18";
        String curso = "ciencia da computação";
        
        String sql = "INSERT INTO Student(nome, endereco, celular, email, curso) VALUES(?,?,?,?,?)";
        PreparedStatement stm = null;
        
        try {
            stm = Conexao.getConexao().prepareStatement(sql);
            stm.setString(1, nome);
            stm.setString(2, end);
            stm.setString(3, num);
            stm.setString(4, email);
            stm.setString(5, curso);
            
            stm.execute();
            stm.close();
           
        } catch (SQLException ex) {
            System.out.println("erro ao cadastrar no banco");
            System.out.println( ex.getMessage());
        }
        
        
    }
}
