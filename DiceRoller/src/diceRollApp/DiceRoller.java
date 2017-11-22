/*
Author: wolfeJob
Date:10/25/17
Description: Create a dice roller app using 2 different dice. 
Project 3  
 */
package diceRollApp;
import java.util.Scanner;


public class DiceRoller {


    public static void main(String[] args) {
        PairOfDice game = new PairOfDice();
        
        System.out.println("Welcome to the Paradise Roller");
        System.out.println();
        System.out.print("Roll the dice? (y/n): ");
        
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        
        while (choice.equalsIgnoreCase("y")) {
            
            
            game.roll();
            
            System.out.println();
            System.out.println("Roll " + Integer.toString(game.getRolls()) + ":  " + 
                    Integer.toString(game.getValue1()) + " & " + Integer.toString(game.getValue2()));
            
             
            if (game.getSum() == 7) {
                System.out.println("Craps!");
            }
            
            
            else if (game.getSum() == 2) {
                System.out.println("Snake eyes!");
            }
            
           
            else if (game.getValue1() == 6 && game.getValue2() == 6) { //Using && both conditions have to be true for this to work.
                System.out.println("Box Cars!");
            }
            
            System.out.println();
            System.out.print("Roll again? (y/n): ");
            choice = sc.nextLine();
        }
        
        System.out.println();
        System.out.println("Thanks for playing Paradise Roller!");
            
    }
        
    
}

