/*
Author: wolfeJob
Date:10/25/17
Description: Create a dice roller app using 2 different dice. 
Project 3  
 */
package diceRollApp;

public class PairOfDice {
    
    private diceRollApp.Die one;
    private diceRollApp.Die two;
    private int rolls;
    
    public PairOfDice() {
        one = new diceRollApp.Die();
        two = new diceRollApp.Die();
        rolls = 0;
    }
    
    public PairOfDice(int sides) {
        one = new diceRollApp.Die(sides);
        two = new diceRollApp.Die(sides);
        rolls = 0;
    }
    
    public void roll() {
        one.roll();
        two.roll();
        rolls++;
    }
    
    public int getValue1() {
        return one.getValue();
    }
    
    public int getValue2() {
        return two.getValue();
    }
    
    public int getSum() {
        return getValue1() + getValue2();
    }
    
    public int getRolls() {
        return rolls;
    }
}
