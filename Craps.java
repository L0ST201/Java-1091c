import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BenArmour
 */
public class Craps 
{



        public static void main(String[] args) 
        {
           
            
            while (true)
                
            {
                Scanner in = new Scanner(System.in);
                // Welcome user
                System.out.println("Let's play Craps!");
                //prompts user to roll the dice
                System.out.println("Press [Enter] to roll the dice...");
                in.nextLine();
                //variables
                Random rnd = new Random();
                int roll1 = rnd.nextInt(6) + 1;
                int roll2 = rnd.nextInt(6) + 1;
                int rollTotal = roll1 + roll2;
                System.out.println("You rolled a " + roll1 + " and a " + roll2);
                System.out.println("for a total of " + rollTotal);

                if (rollTotal == 7 || rollTotal == 11) 
                {
                    System.out.println("You Won!");
                } else if (rollTotal == 2 || rollTotal == 3 || rollTotal == 12) 
                {
                    System.out.println("You lose!");
                } //if not win or lose, keep rolling to match the point
                else 
                {
                    int point = rollTotal;

                    boolean keepPlaying = true;

                    while (keepPlaying) 
                    {
                        System.out.println("Press [Enter] to roll the dice...");
                        in.nextLine();

                        roll1 = rnd.nextInt(6) + 1;
                        roll2 = rnd.nextInt(6) + 1;
                        rollTotal = roll1 + roll2;
                        System.out.println("You rolled a " + roll1 + " and a " + roll2);
                        System.out.println("for a total of " + rollTotal);

                        // Did they win? (Match the point)
                        if (rollTotal == point) 
                        {
                            System.out.println("you matched your point. you win!");
                            keepPlaying = false;
                        } // Did they lose? (Roll a 7)
                        else if (rollTotal == 7) 
                        {
                            System.out.println("You rolled a 7. You lose!");
                            keepPlaying = false;
                        }
                    }
                    System.out.println("Good game!");
                }
               System.out.println("Do you wish to play again? Y/N ");
               String playAgain = in.nextLine();
               if (playAgain.equalsIgnoreCase ("y"))
               {
                   //left empty to let pass
               }
               else if (playAgain.equalsIgnoreCase ("N"))
                       {
                           break;
                       }
                                                           
            }
                System.out.println("Goodbye, Thanks for playing!");
    }
}