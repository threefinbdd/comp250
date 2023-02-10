
/**
 * SimonSays.java
 * 
 * Demonstration of implementing Simon Says
 * with the implementation of ArrayLists 
 * 
 * Pre-Requirement:
 * Foundational Basics
 * 
 * Features of the Program:
 * Math, Random Generation, Validation/Verification
 * Memory Address, ArrayLists, String Comparison
 */

import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class SimonSays {

    public static boolean validateChoice(ArrayList<Character> computer, ArrayList<Character> player) {
        //  Method One:  String to String comparison
        String comp = computer.toString();
        String play = player.toString();
        if (!comp.equals(play)) {
        // if (comp != play) {
            System.out.println("Simon Said:  " + computer.toString());
            System.out.println("The Player responds: " + player.toString());
            return true; // if Strings do not match, Game Over!
        }

        //  Method Two:  Element-by-Element comparison
        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i) != player.get(i)) {
                System.out.println("Simon Said:  " + computer.toString());
                System.out.println("The Player responds: " + player.toString());
                return true; // if Strings do not match, Game Over!
            }
        }

        return false;
    }

    public static ArrayList<Character> playerChoice(Scanner input, int turn) {
        ArrayList<Character> playerGuess = new ArrayList<Character>();
        char userInput = ' ';
        for (int i = 0; i < turn; i++) { // User inputs char-by-char
            //  Validation of User Input to "R", "G", and "B"
            //  as a 3-step Process
            boolean isValid = false;
            System.out.print("Player Says: ");
            while (!isValid) {
                //  Step 1.  Input from User
                userInput = (input.nextLine().toUpperCase()).charAt(0);
                //  Step 2.  Validate to Developer's Constraints
                if (userInput == 'R' || userInput == 'G' || userInput == 'B') {
                    isValid = true;
                }
            }
            //  Step 3.  Utilize User Input
            playerGuess.add(userInput);
        }
        return playerGuess;
    }
    
    /**
     * Implements Math.random that returns a value between 0 and 1.
     * Integer values of 0, 1, and 2 can be used to refer to 
     * three characters:  R, G, B
     * @return
     */
    public static char getComputerChoice() {
        char computerChoice = ' ';
        //  Computer may choose Red, Green, or Blue

        //  Generates a random value between 0.00 to 1.00
        double randomNum = Math.random();
        // Calculates a fraction of 3 compared to the random generation
        // Rounding Down with Math.floor() limits the choice to 0, 1, or 2
        int choice = (int) Math.floor(3 * randomNum);

        //  Conditional Selection
        //  What other conditional statement could we have used?
        switch (choice) {
            case 0:
                computerChoice = 'R';
                break;  //  break statements per case prevents 
                        //  below cases' to override assignment
            case 1:
                computerChoice = 'G';
                break;
            case 2:
                computerChoice = 'B';
                break;
            default:
                //  Never triggered
                break;
        }
        return computerChoice;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //  Initialize ArrayList to represent sequence of each player
        ArrayList<Character> computerSequence = new ArrayList<Character>();
        ArrayList<Character> playerSequence = new ArrayList<Character>();
        
        char computerTurn = ' ';
        
        //  Infinite Loop represents the Game's ability to repeatedly run
        boolean gameOver = false;
        while (!gameOver) {
            //  Computer Generates a Simon Says Sequence
            //  The implemented code is equivalent to:
            //  computerSequence.add(getComputerChoice());  // does not require char computerTurn;
            computerTurn = getComputerChoice();
            computerSequence.add(computerTurn);
            //  System.out.println("Simon Says: " + computerSequence);
            System.out.println("Simon Says: " +
                    computerSequence.toString()); // toString method to convert ArrayList to String

            //  Player input to attempt Computer Input
            playerSequence = playerChoice(input, computerSequence.size());
            
            //  Validate Player Input with Computer Input
            gameOver = validateChoice(computerSequence, playerSequence);
        }
        
        input.close();
    }
}