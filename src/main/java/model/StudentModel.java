package model;

import java.sql.ResultSet;

public class StudentModel extends Model{
    private String ra = null;
    private String name;
    private String adress; 
    private String phoneNumber;
    private String email;
    private int course;
    public StudentModel(){
        super("student");
    }
}
