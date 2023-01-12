/**
 * PrimeNumbers.java
 * 
 * The following code is a break down to calculate a
 * prime number with the use of a Conditional Statement.
 * 
 * For COMP250, a Prime Number is defined as:
 *   Prime numbers is ONLY divisible by itself and 1.  
 *   For this lab, we assume 0 and 1 are NOT prime, 
 *   so the start of the sequence is “2”.
 * 
 * Continuous Integration will be performed to modify the 
 * calculator to take the input of either:
 *   1)  For Assignment #1:  A Value X that refers to the amount
 *                           of Prime Numbers to output.
 *                           In other words, you are to keep track 
 *                           of a COUNT of found prime numbers.
 *   2)  For Assignment #2:  A Value Y that refers to the limit
 *                           of the Prime Numbers
 *                           In other words, you are to output
 *                           from the starting value, 2, up to Y.
 * 
 * Notes:  You are suggested to use the modulus operator (%) and 
 *         the "break" statement.
 */
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

     /* Hard code anyNumber */
          // int anyNumber = 10;
               //or
     /* UserInput for anyNumber */
          // System.out.print("Enter in any value to test if it is Prime:  ");
          // int anyNumber = keyboard.nextInt();
     
     /** The calculator below will test if anyNumber is a Prime Number */

     /*  Calculator:
          if(anyNum % 2, 3, 4, 5,....anyNum == 0){
               //  what does the remainder mean?
          }else if(*********){
               //  For the lab, 2 is a prime number, is this a special case for anyNum? 
          }else {
               //  what does the else mean?
          }
     */  

/*  DO NOT MOVE ON TO THIS PART 
IF THE ABOVE CALCULATOR DOES NOT WORK 

The work does not necessarily go below this line.

The following is just a continuation of the TODO 
tasks that you need to integrate into the above.
*/
          /**  Adjust hard coded/user entered anyNum to go from 2 to Infinity */
          //  anyNum should not be entered through a user’s input OR hard coded any longer
               //  Should this be a loop to increase an infinite counter?

          //  Tests anyNum if it is a prime within Calculator implementation from Step 1

          /**  When do you stop this calculator?  
           * How can you use “n”-total count to stop?  */
          //  Should a loop end?

          keyboard.close();
    }
}
