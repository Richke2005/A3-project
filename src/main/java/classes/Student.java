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
    private String ra;
    private String name;
    private String adress; 
    private String phoneNumber;
    private String email;
    private int course;
    
     
    
    //Constructor -------------------------------------------------------------------------
     
        public void addAll( String name, String adress, String phoneNumber, String email, int course) {
    
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.course = course;
    }

    
    //Getters and Setters -------------------------------------------
    public String getRa(){
        return ra;
    }
    
    public void setRa(String ra){
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
    
   public int getCourse(){
       return course;
   }
   
   public void setCourse(int course){
       this.course = course;
   }
   
   
   //Describe Student
   public void describeStudent() {
         System.out.println(getRa());
         System.out.println(getName());
         System.out.println(getAdress());
         System.out.println(getPhone());
         System.out.println(getEmail());
         System.out.println(getCourse());
    }
   //===========================================
}
