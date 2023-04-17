/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author richard
 */
public class Student {
    private int ra;
    private String name;
    private String adress;
    private long phoneNumber;
    private String email;
    private String course;
    
    //Getters and Setters -------------------------------------------
    public int getRa(){
        return ra;
    }
    
    public void setRa(int ra){
        this.ra = ra;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public void setAdress(String adress){
        this.adress = adress;
    }
    
    public long getPhone(){
        return phoneNumber;
    }
    
    public void setPhone(long phone){
        this.phoneNumber = phone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
   public String getCourse(){
       return course;
   }
   
   public void setCourse(String course){
       this.course = course;
   }
   
   //===========================================
}
