import java.util.Scanner;
import java.util.Random;

public class DiceGame
{
   private String name;
   private int humanScore;
   private Die dice;
   
   public void init(String n)
   {
      name = n;                        // The players name
      humanScore = 0;                  //
      dice = new Die();                // The pair of dice
   }
   
   public void playGame()
   {
      Scanner keyboard = new Scanner(System.in);
      
      // Input
      final int MAX_ROLLS = 7;         // Number of times to roll
      int result1 = 0;                 // The points for computer player 1
      int result2 = 0;                 // The points for computer player 2
      int result3 = 0;                 // The points for the human player
      int getDie1 = 0;                 // The roll for the first die
      int getDie2 = 0;                 // The roll for the second die
      char anotherTurn = 'y';          // The condition that you want to continue
      
      // Process
      do
      {
      System.out.println("Computer 1's turn:");
      
      for(int i = 1; i < MAX_ROLLS; i++)
      {
         do 
         {
            dice.roll();
            
         System.out.println("    " + "Roll #" + i + " Rolled: " + dice.getDie1() + " and " + dice.getDie2());
         
         if (dice.isDouble())
         {
            if (dice.getDie1()%2 == 0 && dice.getDie2()%2 == 0)   
            {
               if (i == 2 || i == 4 || i == 6)
               {
                  System.out.println("    " + "Even double on even-numbered roll! Turn and Turn points lost!");
                  result1 = result1;
               }
               else
               {
                  System.out.println("    " + "Even double on odd-numbered roll! More rolls allowed double the dice, add to turn points.");
                  result1 = result1 + ((dice.getDie1() + dice.getDie2())*2);
               }
               if (dice.getDie1()%2 != 0 && dice.getDie2()%2 != 0)
               {
                  if (i == 1 || i == 3 || i == 5 || i == 7)
                  {
                     System.out.println("    " + "Odd double on odd-numbered roll! Add product of dice to turn points!");
                     result1 = result1 + dice.getDie1() + dice.getDie2();
                  }
                  else
                  {
                     System.out.println("    " + "Odd double on even-numbered roll! Lose turn, lose turn points, lose all game points!");
                     result1 = result1*0;
                  }
               }
            }
         }
         else
         {              
            if (i%2==0)
               if (dice.getDie1()%2==0 && dice.getDie2()%2==0)
               {
               result1 = result1 + dice.getDie1() + dice.getDie2();
               }
               else if (dice.getDie1()%2==0 && dice.getDie2()%2==0)
               {
               result1 = result1 + dice.getDie1();
               }
               else
               {
               result1 = result1 + dice.getDie2();
               }
            else
            {
               if (dice.getDie1()%2!=0 && dice.getDie2()%2!=0)
               {
               result1 = result1 + dice.getDie1() + dice.getDie2();
               }
               else if (dice.getDie1()%2==0 && dice.getDie2()%2!=0)
               {
               result1 = result1 + dice.getDie2();
               }
               else
               {
               result1 = result1 + dice.getDie1();
               }
            } 
         }
          i++;
          System.out.println("       " + "points so far for this turn: " + result1);
         
         } while (i <= MAX_ROLLS);
         
         System.out.println();
         System.out.println("CURRENT GAME SCORE: ");
         System.out.println("    " + "Computer 1: " + result1 + " " + "Computer 2: " + result2 + " " + name + ": " + result3);
         System.out.println();
         }
         
         System.out.print("Press ENTER to continue ...");   
         keyboard.nextLine();
         
         System.out.println("Computer 2's turn:");
      
      for(int i = 1; i < MAX_ROLLS; i++)
      {
         do 
         {
            dice.roll();
            
         System.out.println("    " + "Roll #" + i + " Rolled: " + dice.getDie1() + " and " + dice.getDie2());
         
         if (dice.isDouble())
         {
            if (dice.getDie1()%2 == 0 && dice.getDie2()%2 == 0)   
            {
               if (i == 2 || i == 4 || i == 6)
               {
                  System.out.println("    " + "Even double on even-numbered roll! Turn and Turn points lost!");
                  result2 = result2;
               }
               else
               {
                  System.out.println("    " + "Even double on odd-numbered roll! More rolls allowed double the dice, add to turn points.");
                  result2 = result2 + ((dice.getDie1() + dice.getDie2())*2);
               }
               if (dice.getDie1()%2 != 0 && dice.getDie2()%2 != 0)
               {
                  if (i == 1 || i == 3 || i == 5 || i == 7)
                  {
                     System.out.println("    " + "Odd double on odd-numbered roll! Add product of dice to turn points!");
                     result2 = result2 + dice.getDie1() + dice.getDie2();
                  }
                  else
                  {
                     System.out.println("    " + "Odd double on even-numbered roll! Lose turn, lose turn points, lose all game points!");
                     result2 = result2*0;
                  }
               }
            }
         }
         else
         {              
            if (i%2==0)
               if (dice.getDie1()%2==0 && dice.getDie2()%2==0)
               {
               result2 = result2 + dice.getDie1() + dice.getDie2();
               }
               else if (dice.getDie1()%2==0 && dice.getDie2()%2==0)
               {
               result2 = result2 + dice.getDie1();
               }
               else
               {
               result2 = result2 + dice.getDie2();
               }
            else
            {
               if (dice.getDie1()%2!=0 && dice.getDie2()%2!=0)
               {
               result2 = result2 + dice.getDie1() + dice.getDie2();
               }
               else if (dice.getDie1()%2==0 && dice.getDie2()%2!=0)
               {
               result2 = result2 + dice.getDie2();
               }
               else
               {
               result2 = result2 + dice.getDie1();
               }
            } 
         }
          i++;
          System.out.println("       " + "points so far for this turn: " + result2);
         
         } while (i <= MAX_ROLLS);
         
         System.out.println();
         System.out.println("CURRENT GAME SCORE: ");
         System.out.println("    " + "Computer 1: " + result1 + " " + "Computer 2: " + result2 + " " + name + ": " + result3);
         System.out.println();
         }
         
         System.out.print("Press ENTER to continue ...");   
         keyboard.nextLine();
         
         System.out.println("" + name + "'s turn:");
      
      for(int i = 1; i < MAX_ROLLS; i++)
      {
         do
         {
         do 
         {
            dice.roll();
            
         System.out.println("    " + "Roll #" + i + " Rolled: " + dice.getDie1() + " and " + dice.getDie2());
         
         if (dice.isDouble())
         {
            if (dice.getDie1()%2 == 0 && dice.getDie2()%2 == 0)   
            {
               if (i == 2 || i == 4 || i == 6)
               {
                  System.out.println("    " + "Even double on even-numbered roll! Turn and Turn points lost!");
                  result3 = result3;
               }
               else
               {
                  System.out.println("    " + "Even double on odd-numbered roll! More rolls allowed double the dice, add to turn points.");
                  result3 = result3 + ((dice.getDie1() + dice.getDie2())*2);
               }
               if (dice.getDie1()%2 != 0 && dice.getDie2()%2 != 0)
               {
                  if (i == 1 || i == 3 || i == 5 || i == 7)
                  {
                     System.out.println("    " + "Odd double on odd-numbered roll! Add product of dice to turn points!");
                     result3 = result3 + dice.getDie1() + dice.getDie2();
                  }
                  else
                  {
                     System.out.println("    " + "Odd double on even-numbered roll! Lose turn, lose turn points, lose all game points!");
                     result3 = result3*0;
                  }
               }
            }
         }
         else
         {              
            if (i%2==0)
               if (dice.getDie1()%2==0 && dice.getDie2()%2==0)
               {
               result3 = result3 + dice.getDie1() + dice.getDie2();
               }
               else if (dice.getDie1()%2==0 && dice.getDie2()%2==0)
               {
               result3 = result3 + dice.getDie1();
               }
               else
               {
               result3 = result3 + dice.getDie2();
               }
            else
            {
               if (dice.getDie1()%2!=0 && dice.getDie2()%2!=0)
               {
               result3 = result3 + dice.getDie1() + dice.getDie2();
               }
               else if (dice.getDie1()%2==0 && dice.getDie2()%2!=0)
               {
               result3 = result3 + dice.getDie2();
               }
               else
               {
               result3 = result3 + dice.getDie1();
               }
            } 
         }
         i++;
         System.out.println("       " + "points so far for this turn: " + result3);
         
         System.out.print("Roll again? (y/n) ");
         anotherTurn = keyboard.next().charAt(0);
         } while (((anotherTurn == 'y') || (anotherTurn == 'Y')) && (i < MAX_ROLLS));
         if (anotherTurn == 'n' || anotherTurn == 'N')
         {
         i = MAX_ROLLS;
         }
         
         } while (i < MAX_ROLLS);
         
         System.out.println();
         System.out.println("CURRENT GAME SCORE: ");
         System.out.println("    " + "Computer 1: " + result1 + " " + "Computer 2: " + result2 + " " + name + ": " + result3);
         System.out.println();
         }
         
         System.out.print("Press ENTER to continue ...");   
         keyboard.nextLine();
          
      } while (result1 < 240 && result2 < 240 && result3 < 240);
      
      // Output
      System.out.println();
      System.out.println("Game Over!");
      System.out.println("Here are the scoring results:");
      
      if (result1 > result2 && result1 > result3) 
      {
         System.out.println("     " + "Computer 1 (" + result1 + ")");
      }
      else if (result2 > result1 && result2 > result3) 
      {
         System.out.println("     " + "Computer 2 (" + result2 + ")");
      }
      else if (result3 > result1 && result3 > result2) 
      {
         System.out.println("     " + name + " (" + result3 + ")");
      }
            
      if (result1 != result2 && result1 != result3) 
      {
         System.out.println("     " + "Computer 1 (" + result1 + ")");
      }
      else if (result2 != result1 && result2 != result3) 
      {
         System.out.println("     " + "Computer 2 (" + result2 + ")");
      }
      else if (result3 != result1 && result3 != result2)
      {
         System.out.println("     " + name + " (" + result3 + ")");
      }
      
      if (result1 < result2 && result1 < result3)
      {
         System.out.println("     " + "Computer 1 (" + result1 + ")");
      }
      else if (result2 < result1 && result2 < result3)
      {
         System.out.println("     " + "Computer 2 (" + result2 + ")");
      }
      else if (result3 < result1 && result3 < result2)
      {
         System.out.println("     " + name + " (" + result3 + ")");
      } 
   }
}