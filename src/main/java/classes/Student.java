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
    private String phoneNumber;
    private String email;
    private String course;
    
     
    
    //Constructor -------------------------------------------------------------------------
     
    /* public Student(int ra, String name, String adress, String phoneNumber, String email, String course) {
        this.ra = ra;
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.course = course;
    }
*/
    
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
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public void setAdress(String adress){
        this.adress = adress;
    }
    
    public String getPhone(){
        return phoneNumber;
    }
    
    public void setPhone(String phone){
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
   
   public void describeStudent() {
         System.out.println(getName());
         System.out.println(getAdress());
         System.out.println(getPhone());
         System.out.println(getEmail());
         System.out.println(getCourse());
    }
   //===========================================
}
