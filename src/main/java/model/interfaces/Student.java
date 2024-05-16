package model.interfaces;

public class Student {
    private String ra;
    private String name;
    private String adress; 
    private String phoneNumber;
    private String email;
    private int course;

    public Student(String ra, String name, String adress, String phoneNumber, String email, int course){
        this.ra = ra;
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.course = course;
    }

    Student(){
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
}
