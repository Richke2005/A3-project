/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import connection.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author richard
 */
public class StudentDAO extends Student{
    
    public StudentDAO(String name, String adress, String phoneNumber, String email, String course){
        super( name, adress, phoneNumber, email, course);
    }
    
    public void addStudent(Student person){
        String sql = "INSERT INTO Student (nome, endereco, celular, email, curso) VALUES(?,?,?,?,?)";
        
        PreparedStatement ps = null;
        
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, person.getName());
            ps.setString(2, person.getAdress());
            ps.setString(3, person.getPhone());
            ps.setString(4, person.getEmail());
            ps.setString(5, person.getCourse());
            
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<StudentDAO> readStudent(){
        String sql = "SELECT * FROM Student";
        
        List<StudentDAO> students = new ArrayList<StudentDAO>();
        
         PreparedStatement ps = null;
         //Class who recover data bases
         ResultSet rset = null;
         
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            rset = ps.executeQuery();
            
            while(rset.next()){
                StudentDAO student = new StudentDAO( rset.getString("nome"), rset.getString("endereco"), rset.getString("celular"), rset.getString("email"), rset.getString("curso"));
                student.setRa(rset.getInt("ra"));
                students.add(student);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try{
                if(rset != null){
                     rset.close();
                }
                if(ps != null){
                     ps.close();
                }
             } catch (SQLException ex) {
                    Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
                }      
            }
        return students;
    }
    
    public void updateStudent(Student person){
          String sql = "UPDATE Student SET nome = '?', endereco = '?', celular = '?', email = '?' curso ='?' WHERE nome='?' ";
        
        PreparedStatement ps = null;
        
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, person.getName());
            ps.setString(2, person.getAdress());
            ps.setString(3, person.getPhone());
            ps.setString(4, person.getEmail());
            ps.setString(5, person.getCourse());
            
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteStudent(){
        
    }
}
