/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whoareyou;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class WhoAreYou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name; //declaration
        Scanner input = new Scanner(System.in);

        String question = "What's you name?";
        System.out.println(question);
        name = input.next(); //initialization

        question = "How old are you?";
        System.out.println(question);
        int age = input.nextInt();

        if (age < 0) {
            System.out.println("Not valid age.");
        } else if (age > 0 && age < 12) {
            System.out.println("You are a kid.");
        } else if (age >= 13 && age < 18) {
            System.out.println("Youare a teenager.");
        } else if (age >= 19 && age < 119) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not serious.");
        }

    }

}
