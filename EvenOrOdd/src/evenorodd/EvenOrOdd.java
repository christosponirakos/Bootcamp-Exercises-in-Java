/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenorodd;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class EvenOrOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  a number");
        int number = input.nextInt();
        boolean numberCheck = (number%2)==0;
        
        if(numberCheck){
            System.out.println("The number is even");
        }else {System.out.println("The number is odd");
    }
    
}
