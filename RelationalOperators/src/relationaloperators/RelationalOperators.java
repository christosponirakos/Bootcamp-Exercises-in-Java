/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationaloperators;

 import java.util.Scanner;
/**
 *
 * @author Chris
 */
public class RelationalOperators {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//        boolean result = 10 < 20;
//        System.out.println("The result is: " + result);
//
//        result = 12 < 20;
//        System.out.println("The result is: " + result);
//
//        result = 12 > 20;
//        System.out.println("The result is: " + result);
//
//        result = 12 <= 20;
//        System.out.println("The result is: " + result);
//
//        result = 12 >= 20;
//        System.out.println("The result is: " + result);
//
//        result = 12 == 20;
//        System.out.println("The result is: " + result);
//
//        result = 12 != 20;
//        System.out.println("The result is: " + result);
       
        
        System.out.println("Enter the two numbers that you want to compare.");
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();
        
        System.out.println("The numbers are " + number1 +" and " + number2);
        
        float result = Math.min(number1, number2);
        
        System.out.println("The minimum is: " + result );
    }

}
