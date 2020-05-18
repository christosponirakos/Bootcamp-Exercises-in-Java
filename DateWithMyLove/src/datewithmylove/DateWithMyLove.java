/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datewithmylove;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class DateWithMyLove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int minAge = 25;
        int maxAge = 45;
        int minIncome = 15000;
        double minCute = 8.3;

        System.out.println("How old are you my son?");

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        boolean ageCheck = age >= minAge && age <= maxAge;

        System.out.println("Which is your income?");
        int income = input.nextInt();
        boolean incomeCheck = income >= minIncome;

        System.out.println("Dad,is he pretty enough?");
        double cute = input.nextDouble();
        boolean cuteCheck = cute > minCute;

        boolean finalCheck = ageCheck && (incomeCheck || cuteCheck);
        System.out.println("Daddy, can I date him? ");

        //Conditonal operators
        if (finalCheck == true) {
            System.out.println("Yes,you can my dear!");
        } else {
            System.out.println("No, you cannot because you are");
            if (ageCheck == false) {
                System.out.println(" out of the age range my boy");
            }
            if (incomeCheck != true) {
                System.out.println(" too poor champ!");
            }
            if (cuteCheck != true) {
                System.out.println(" too ugly for my daughter.");
            }
        }
    }

}
