package model;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class StudentModel extends Model{
    private String ra;
    private String name;
    private String adress; 
    private String phoneNumber;
    private String email;
    private int course;
    private List<StudentModel> students = new ArrayList<>();

    public StudentModel(String ra, String name, String adress, String phoneNumber, String email, int course){
        super("student");
        this.ra = ra;
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.course = course;
    }

    StudentModel(){
        super("student");
        this.ra = null;
        this.name = null;
        this.adress = null;
        this.phoneNumber = null;
        this.email = null;
        this.course = 0;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    
   
    public StudentModel[] selectAlls() {
        // TODO Auto-generated method stub
        ResultSet resultSet = null;
        try{
            resultSet = super.selectAll();
            int i = 0;
            StudentModel students[] = null;
            while(resultSet.next()){
                students[i] = new StudentModel(
                    resultSet.getString("ra"),
                    resultSet.getString("nome"), 
                    resultSet.getString("endereco"),
                    resultSet.getString("celular"), 
                    resultSet.getString("email"),
                    resultSet.getInt("course_key")
                );
            }
            return students;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        StudentModel student = new StudentModel();
        System.out.println(student.selectAlls());
        
    }
}
