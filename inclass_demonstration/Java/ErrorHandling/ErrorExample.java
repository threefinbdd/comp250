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

    public static int logicOne(Scanner keyboard) {
        boolean isValid = false;
        int userInput = -1;
        while (!isValid) {
            try {
                System.out.print("Logic One:  Enter in a number between 1-10: ");
                userInput = keyboard.nextInt();
                if (userInput >= 1 && userInput <= 10) {
                    isValid = true;
                    return userInput;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type. . .");
            } catch (Exception e) {
                //  Broader Catch of Error Types
            } finally {
                //  if all else fails, end up here
            }
        }
        
        return -1;
    }  

    public static int logicTwo(Scanner keyboard) {
        int userInput = -1;
        while (!(userInput >= 1 && userInput <= 10)) {
            try {
                System.out.print("Logic Two:  Enter in a number between 1-10: ");
                userInput = keyboard.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type. . .");
            } catch (Exception e) {
                //  Broader Catch of Error Types
            } finally {
                //  if all else fails, end up here
            }
        }
        return userInput;
        
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userOne = logicOne(keyboard);
        System.out.println("Logic One Entered: " + userOne);
        int userTwo = logicTwo(keyboard);
        System.out.println("Logic Two Entered: " + userTwo);

        keyboard.close();
    }
}