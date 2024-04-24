package model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import connection.Conexao;


public class Model extends Conexao{
    private String modelName;

    public Model(String modelName){
        this.modelName = modelName;
    }

    Model(){
        this.modelName = null;
    }

    public boolean createModel(){
        String sql = "CREATE TABLE IF NOT EXISTS " + this.modelName + " (id INT AUTO_INCREMENT PRIMARY KEY, ";
        PreparedStatement ps = null;
        try{
            ps = getConexao().prepareStatement(sql);
            return ps.execute();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            try{
                ps.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public ResultSet selectAll(){
        String sql = "SELECT * FROM " + this.modelName;
        PreparedStatement ps = null;
        ResultSet result = null;
        try{
            ps = getConexao().prepareStatement(sql);
            if(result == null){
            result = ps.executeQuery();
            }

            return result;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }finally{
            try{
                ps.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }  
    }

    public ResultSet selectById(String camp, int id){
        String sql = "SELECT * FROM " + (this.modelName + " WHERE " + camp + " = " + id);
        PreparedStatement ps = null;
        ResultSet result = null;
        try{
            ps = getConexao().prepareStatement(sql);
            if(result == null){
            result = ps.executeQuery();
            }

            return result;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }finally{
            try{
                ps.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }  
    }

    public ResultSet selectById(String id){
        String sql = "SELECT * FROM " + (this.modelName + " WHERE id = " + id);
        PreparedStatement ps = null;
        ResultSet result = null;
        try{
            ps = getConexao().prepareStatement(sql);
            if(result == null){
            result = ps.executeQuery();
            }

            return result;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }finally{
            try{
                ps.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }  
    }
    public static void main(String[] args) {
        System.out.println(new Model("courses").selectById("course_id", 1));
    }
}