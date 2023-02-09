/**
 * FileIO
 * 
 * Demonstration of File Input with User Input
 * for FileName selection
 * 
 * Includes different methods to handle Error Handling
 * with the Exception Object
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileIO {

    /**  Example 1:  Try-Catch */
    /**
     * tryCatchThrow method utilizes a try-catch statement
     * to explicitly handle when a user keys in a 
     * file name that cannot be found.
     * @param fileName
     */
    public static void tryCatchThrow(String fileName) {
        try {
            File inputFile = new File(fileName);
            printContent(inputFile, fileName);
        } catch (FileNotFoundException e) {  //  Specific Error To Look Out For
            System.out.println("Incorrect File Name. . .");
        } catch (Exception e) {  //  Broad Look Out for Any Error
            System.out.println("Default Error found. . .");
        } finally {
            //  Default Handler - Do This
        }

    } //  End of method
    
    /**  Example 2:  Try-Catch with a Custom Handler */
    public static void tryCatchThrow_Alternate(String fileName) {
            File inputFile = new File(fileName);
            try {
                printContent(inputFile, fileName);
            } catch (Exception e) {
                new FileNotFoundException();
            } finally {
                //  Default Handler - Do This
            }
 
    } //  End of method
    
    
    /**  Bad Example:  If-Else to handle File Not Found */
    public static void conditionalState(String fileName) {
        File inputFile = new File(fileName);
        if (inputFile.length() == 0) {
            System.out.println("File not found. . .");
            return;
        }
        // printContent(inputFile, fileName);

    } //  End of method
    
    /**
     * 
     * @param input
     * @return
     */
    public static void printContent(File f, String fileName) throws Exception {
        Scanner readFile = new Scanner(f);
        int count = 1;
        System.out.println("File Name: " + fileName);
        System.out.println("File Content contains:  ");
        while (readFile.hasNext()) {  //  Detect that there is content to read
            System.out.println("Line " + count + ": " +
                    readFile.nextLine());  //  Perform the actual read
        }
        readFile.close();
    } //  End of method
    
    /**
     * getInput method returns the user's input from 
     * the keyboard and returns the String representation.
     * 
     * The String concatenates a Text File extension if the user
     * chooses to not include it in their input.
     * @param input
     * @return
     */
    public static String getInput(Scanner input) {
        String fileName = "";
        System.out.print("Enter the name of the input file:  ");
        fileName = input.nextLine();
        //  Did the user include the File Extension?
        if (!fileName.contains(".txt")) {
            fileName = fileName + ".txt";
        }
        return fileName;
    } //  End of method 
       
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput = getInput(keyboard);
        // tryCatchThrow(userInput);
        // conditionalState(userInput);
        // tryCatchThrow_Alternate(userInput);

        keyboard.close();
    }  //  End of method
}