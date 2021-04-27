import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Ben Armour
 *
 */

/**
 *              Pseudocode
 *              main code
 * This program is a two player game of tic-tac-toe
 * first create class
 * Declare static variables
 * declare playAgain boolean 
 * start do while loop
 * declare variables 
 * populate Empty ticTacToe Board
 * welcome user to the game 
 * notify users x's go first
 * user places an x on a number slot 1-9
 * use safeinput method to verify x user enters an integer between 1-9
 * verify slot is not already filled 
 * keep track of users turns
 * Declare the winner (x's o's or draw)
 * end do while loop and prompt user would you like to play again? Y or N
 * 
 *              checkWinner method
 * case 0-2 checks users inputs for a horizontal win 
 * case 3-6 checks users inputs for vertical win 
 * case 6-7 checks users inputs for diagonal win 
 * code recognizes 3 of the same in a row
 */
public class TicTacToe {
    static Scanner in ;
    static String[] board;
    static String turn;


    public static void main(String[] args) {

        boolean playAgain;
        do { 
            in = new Scanner(System.in);
            board = new String[9];
            int gameBoard = 0;
            turn = "X";
            String winner = null;
            populateEmptyBoard();


            System.out.println("Welcome to 2 Player Tic-Tac-Toe.");
            System.out.println("--------------------------------");
            printBoard();
            System.out.println("X's will play first:");

            while (winner == null) {
                int numInput;
                numInput = SafeInput.getRangedInt( in , "Enter a slot number between ", 1, 9);
                   
                if (board[numInput - 1].equals(String.valueOf(numInput))) {
                    board[numInput - 1] = turn;
                    if (turn.equals("X")) {
                        turn = "O";
                    } else {
                        turn = "X";
                    }
                    printBoard();
                    winner = checkWinner();
                } else {
                    System.out.println("Slot already taken; re-enter slot number:");
                    continue;
                }
            }
            if (winner.equalsIgnoreCase("draw")) {
                System.out.println("It's a draw! Thanks for playing.");
            } else {
                System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
            }
        } while (playAgain = SafeInput.getYNConfirm( in , "Would you like to play again?"));

    }

    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
                break;
            } else if (a == 8) return "draw";
        }

        System.out.println(turn + "'s turn; ");
        return null;
    }

    static void printBoard() {
        System.out.println("/---|---|---\\");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("/---|---|---\\");
    }

    static void populateEmptyBoard() {
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }
    }
}