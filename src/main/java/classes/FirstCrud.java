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
        
       StudentDAO p1 = new StudentDAO("Quend", "rua jardim arco-iris", "(11)94431-6281", "richardke18@gmail.com.br", "Ciencia da computação");
       
        for(StudentDAO element : p1.readStudent()){
            element.describeStudent();
            System.out.println("---------------------------");
        }
       
        
       
    }
}
