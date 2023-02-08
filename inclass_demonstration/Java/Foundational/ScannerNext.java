/*
 * ScannerNext.java
 * 
 * The following code is a demonstration of 
 * errors found while using the Scanner object
 * and the .next_ methods for user input.
 * 
 */
import java.util.Scanner;

public class ScannerNext {
    
    public static void correctNext() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name:  ");
        String name = "";
        name = keyboard.nextLine();

        System.out.print("Enter your age:  ");
        int age = keyboard.nextInt();
        //  When user keys "Enter", the program needs to handle
        //  the keystroke of "Enter" (seen as "\n" by the program)
        keyboard.nextLine();  

        System.out.print("Enter your major:  ");
        String major = keyboard.nextLine();

        System.out.println("Your name is:  " + name + ", " +
                            age + " years old, " + 
                            "studying " + major
        );
        keyboard.close();        
    }

    public static void errorNext() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name:  ");
        String name = "";
        name = keyboard.nextLine();

        System.out.print("Enter your age:  ");
        int age = keyboard.nextInt();

        System.out.print("Enter your major:  ");
        String major = keyboard.nextLine();

        System.out.println("Your name is:  " + name + ", " +
                            age + " years old, " + 
                            "studying " + major
        );
        keyboard.close();
    }
    public static void main(String[] args){
        //errorNext();
        correctNext();
    }    
}
