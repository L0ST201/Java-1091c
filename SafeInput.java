import java.util.Scanner;

/**
 *
 * @author Ben Armour
 */
public class SafeInput {
    /**
     * Get an Int value within a specified numeric range
     * @param pipe - Scanner instance to read the data system.in in most cases
     * @param prompt - input prompt message should not include range info
     * @param low - low end of inclusive range
     * @param high - high end of inclusive range
     * @return - int value within the inclusive range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt = 0;
        boolean done = false;
        String trash = "";
        do {
            // Code and control logic to loop until validated
            System.out.print("\n" + prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine(); // clear input buffer
                if (retInt >= low && retInt <= high) {
                    done = true;
                } else {
                    System.out.println("You must enter a value in range [" + low + " - " + high + "]: " + retInt);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an intager; you entered: [" + low + " - " + high + "]: " + trash);
            }

        } while (!done);

        return retInt;
    }

    /**
     * get a String which contains at least one character
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;

    }

    /**
     * Get a int without any special qualifications 
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a int response
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer; you entered : " + trash);
            }
        } while (!done);

        return retInt;
    }

    /**
     * Get double without any special qualifications
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a double response
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a double; you entered: " + trash);
            }
        } while (!done);

        return retDouble;

    }

    /**
     * Get an double value within a specified numeric range
     * @param pipe - Scanner instance to read the data system.in in most cases
     * @param prompt - input prompt message should not include range info
     * @param low - low end of inclusive range
     * @param high - high end of inclusive range
     * @return - double value within the inclusive range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retDouble = 0;
        boolean done = false;
        String trash = "";
        do {
            // Code and control logic to loop until validated
            System.out.print("\n" + prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                pipe.nextLine(); // clear input buffer
                if (retDouble >= low && retDouble <= high) {
                    done = true;
                } else {
                    System.out.println("You must enter a value in range [" + low + " - " + high + "]: " + retDouble);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an int [" + low + " - " + high + "]: " + trash);
            }

        } while (!done);

        return retDouble;
    }



    /**
     * Get a [Y/N] confirmation from the user
     * @param pipe - Scanner opened to read the data system.in in most cases
     * @param prompt - input prompt message for user does not need [Y/N]
     * @return - true for yes false for no
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {

        String input = "";
        System.out.println(prompt + " Y or N");
        while (true) { //Loops forever until a return or break statement 
            input = pipe.nextLine();
            if (input.equalsIgnoreCase("Y")) {
                return true;
            } else if (input.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Y or N");
            }
        }
    }

    /**
     * Get a string that matches a RegEx (regular expression) pattern.
     * @param pipe - Scanner instance to read the data system.in in most cases
     * @param prompt - prompt for user input
     * @param regEx - java-style RegEx ti constrain the input
     * @return  a string that matches the RegEx pattern supplied
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {

        String response = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if (response.matches(regEx)) {
                done = true;
            } else {
                System.out.println("\n" + response + " must match the pattern " + regEx);
                System.out.println("try again!");
            }

        } while (!done);

        return regEx;
        
    }
        
}
