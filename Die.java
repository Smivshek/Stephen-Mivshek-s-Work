import java.util.Random;

public class Die
{
     
   private int die1;                      // The first die
   private int die2;                      // The second die
        
   public Die() 
   {
      roll();
   }
        
   public void roll() 
   {
      die1 = (int)(Math.random()*12) + 1;
      die2 = (int)(Math.random()*12) + 1;
   }
                 
   public int getDie1() 
   {
      return die1;
   }
        
   public int getDie2() 
   {
      return die2;
   }
   
   public boolean isDouble()
   {
      if (getDie1() == getDie2())
         return true;
      return false;
   }
}