/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classes;


/**
 *
 * @author richa
 */
public class FirstCrud {

    public static void main(String[] args){
       Student p1 = new Student();
       
       p1.setName("Quend");
       p1.setAdress("rua jardim arco-iris");
       p1.setPhone("(11)94431-6281");
       p1.setEmail("richardke18@gmail.com.br");
       p1.setCourse( "Ciencia da computação");
       
       p1.describeStudent();
       new StudentDAO().updateStudent(p1);
       
    }
}
