//    Programmer: Stephen Mivshek      CSC110 Programming Assignment 1
//    Date: November 1st, 2021
//    Description: this progrm creates a dice game using different classes to "roll" the dice.
//    Input: The user is prompted for their name and whether they want to continue via ENTER and y/n
//    Process: The die is rolled using a randomizer, and specific rules are applied. The total is then added to their score.
//    Output: Once the score limit has been achieved, the user is presented with the score total from all of the players.

import java.util.Scanner;

public class Module6
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      DiceGame game = new DiceGame();
      
      System.out.print("Who is playing against the computer? ");
      String playerName = keyboard.nextLine();
      game.init(playerName);
      
      game.playGame();
   }
}