/*
Author: wolfeJob
Date:10/25/17
Description: Create a dice roller app using 2 different dice. 
Project 3  
 */
package diceRollApp;


public class Die {
    
    
    private int sides;
    private int value;
    
    
    public Die() {
        sides = 6; 
        value = 1;
    }
    
    public Die(int sides) {
        this.sides = sides;
        value = 1;
    }
    
    public void roll() {
        
        value = (int) (Math.random() * sides) + 1;
    }
    
    public int getValue() {
        return value;
    }
}

