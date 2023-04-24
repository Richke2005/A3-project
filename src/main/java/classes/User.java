/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author richard
 */
public class User {
    private int user;
    private String name;
    private String password;
    private String email;
    private long phoneNumber;
    
//Getters and Setters ----------------------------------------
    public int getUser(){
        return user;
    }
    
    public void setUser(int user){
        this.user = user;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public long getNumber(){
        return phoneNumber;
    }
    
    public void setNumber(long num){
        this.phoneNumber = num;
    }
    
// ------------------------------------------------------
    
    
}
