
/**
 * ErrorExample.java
 * 
 * Demonstration of utilizing multiple layers 
 * to validate user entry for input.
 * 
 * Pre-Requirement:
 *  Conditional, Booleans, Loops,
 *  Try-Catch, Exception
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class ErrorExample {

    public static void logicOne(Scanner keyboard) {
        boolean isValid = false;
        int userInput = -1;
        try {
            while (!isValid) {
                System.out.println("Logic One:  Enter in a number between 1-10: ");
                userInput = keyboard.nextInt();
                if (userInput >= 1 && userInput <= 10) {
                    isValid = true;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input type. . .");
        } catch (Exception e) {
            //  Broader Catch of Error Types
        } finally {
            //  if all else fails, end up here
        }
    }  

    public static void logicTwo(Scanner keyboard) {
        int userInput = -1;
        try {
            while (!(userInput >= 1 && userInput <= 10)) {
                System.out.println("Logic Two:  Enter in a number between 1-10: ");
                userInput = keyboard.nextInt();            
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input type. . .");
        } catch (Exception e) {
            //  Broader Catch of Error Types
        } finally {
            //  if all else fails, end up here
        }
        
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        logicOne(keyboard);
        logicTwo(keyboard);

        keyboard.close();
    }
}