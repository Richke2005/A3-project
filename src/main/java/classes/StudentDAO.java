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
//    
//    public StudentDAO(String name, String adress, String phoneNumber, String email, String course){
//        super( name, adress, phoneNumber, email, course);
//    }
    
    
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
    
    public List<Student> readStudent(){
        String sql = "SELECT * FROM Student";
        
        List<Student> students = new ArrayList<Student>();
        
         PreparedStatement ps = null;
         //Class who recover data bases
         ResultSet rset = null;
         
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            rset = ps.executeQuery();
            
            //int i =1;
            while(rset.next()){
                Student student = new Student();
                student.setRa(rset.getInt("ra"));
                student.setName(rset.getString("nome"));
                student.setAdress(rset.getString("endereco"));
                student.setPhone(rset.getString("celular"));
                student.setEmail(rset.getString("email"));
                student.setCourse(rset.getString("curso"));
                //System.out.println(i++);
                //In each loop realized this add one student object in array: students;
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
          String sql = "UPDATE Student SET nome = ?, endereco = ?, celular = ?, email = ?, curso =? WHERE ra=? ";
        
        PreparedStatement ps = null;
        
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, person.getName());
            ps.setString(2, person.getAdress());
            ps.setString(3, person.getPhone());
            ps.setString(4, person.getEmail());
            ps.setString(5, person.getCourse());
            ps.setInt(6, person.getRa());
            
            ps.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                if(ps!=null){
                   ps.close();
                }
            }catch(SQLException ex){
                Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void deleteStudent(Student person){
        String sql = "DELETE FROM Student WHERE ra=?";
        
        PreparedStatement ps = null;
        
        try{
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, person.getRa());
            
            ps.execute();
        }catch(SQLException ex){
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                if(ps!=null){
                    ps.close();
                }
            }catch(SQLException ex){
                 Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);        
            }
        }
        
        
    }

    public static ResultSet autheticateUser(Student person){
        String sql = "SELECT * FROM Student WHERE nome=? and email=? ";
        
        PreparedStatement ps = null;
        
        try{
        ps = Conexao.getConexao().prepareStatement(sql);
        ps.setString(1, person.getName());
        ps.setString(2, person.getEmail());
        ResultSet rset = ps.executeQuery();
        //return the result of query realized on rset
        return rset;
        
        
        }catch(SQLException ex){
            System.out.println("authenticate User:");
            ex.getStackTrace();
            return null;
         }//finally{
//            try{
//                if(ps!=null){
//                    ps.close();
//                }
//            }catch(SQLException ex){
//                System.out.println("error on auth, close");
//                ex.getStackTrace();
//          }
//        }
        
    }
}
