/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package details;
import java.util.Scanner;
/**
 *
 * @author Chris
 */
public class Details {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your name? : ");
        String name = input.next();
        
        System.out.print("Which is the year that you born? : ");
        int yearBorn = input.nextInt();
        
        System.out.print("Which is the current year? : ");
        int currentYear = input.nextInt();
        
        int age = currentYear - yearBorn
        System.out.println("Your name is " + name +" and your age is " + age + "!");
   
    }
    
}
