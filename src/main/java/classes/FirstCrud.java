/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classes;

import java.util.Scanner;

/**
 *
 * @author richa
 */
public class FirstCrud {

    public static void main(String[] args){
//       Scanner teclado = new Scanner(System.in);
//       Student p1 = new Student();
//       
//        System.out.println("Digite seu nome");
//        String name = teclado.nextLine();
//        System.out.println("Digite seu endereço");
//        String adress = teclado.nextLine();
//        System.out.println("Digite seu celular");
//        String phoneNumber = teclado.nextLine();
//        System.out.println("Digite seu email");
//        String email = teclado.nextLine();
//        System.out.println("digite seu curso");
//        String course = teclado.nextLine();
        
        //p1.addAll(name, adress, phoneNumber, email, course);
       
        
        
       
        for(Student element : new StudentDAO().readStudent()){
            element.describeStudent();
            System.out.println("---------------------------");
        }
        
        
       
    }
}
