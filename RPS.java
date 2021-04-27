import java.util.Scanner;

/**
 *
 * @author BenArmour
 */
public class RPS {
    public static void main(String[] args) {

        //Variables and scanner 
        String playA = "";
        String playB = "";
        String playAgain;
        boolean invalidInput;
        String menu = "R = Rock, P = Paper, S = Scissors, ";
        Scanner in = new Scanner(System.in);

        // welcomes user and display menu
        System.out.println("Hello! welcome to a game of Rock, Paper or Scissors \n" + (menu));


        do {



            do {
                System.out.print("Player A please choose Rock, Paper or Scissors: ");
                playA = in .nextLine();

                if (playA.equalsIgnoreCase("R") || playA.equalsIgnoreCase("P") || playA.equalsIgnoreCase("S")) {
                    invalidInput = false;
                } else {
                    System.out.println("\nYour input was not valid. Player A please try again.");
                    invalidInput = true;
                }

            } while (invalidInput);

            do {
                System.out.print("Player B please choose Rock, Paper or Scissors: ");
                playB = in .nextLine();


                if (playB.equalsIgnoreCase("R") || playB.equalsIgnoreCase("P") || playB.equalsIgnoreCase("S")) {
                    invalidInput = false;
                } else {
                    System.out.println("\nYour input was not valid. Player B please try again.");
                    invalidInput = true;
                }

            } while (invalidInput);

            if (playA.equalsIgnoreCase("R")) {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Its a Tie! R X R");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock player B wins");
                } else //PlayB Is Scissors
                {
                    System.out.println("Rock breaks Scissors player A wins");
                }
            } else if (playA.equalsIgnoreCase("P")) {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock player A wins");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("Its a Tie! P X P");
                } else //PlayB Is Scissors
                {
                    System.out.println("Scissors cuts Paper player B wins");
                }
            } else //PlayA Is Scissors
            {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors player B wins");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper player A wins");
                } else //PlayB Is Scissors
                {
                    System.out.println("Its a Tie! S X S");
                }
                System.out.println("woud you liek to play again");

            }


            System.out.println("Would you like to play again? Enter Y to play or any other key to quit: ");

            playAgain = in .nextLine();
            if (playAgain.equalsIgnoreCase("y")) {}

        } while (playAgain.equalsIgnoreCase("y"));



    }

}