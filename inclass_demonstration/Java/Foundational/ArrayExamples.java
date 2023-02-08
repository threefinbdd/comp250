package Foundational;
/**
 * ArrayExamples.java
 * 
 * Sample demonstration of 
 * comparing arrays.
 */
public class ArrayExamples {
    public static void main(String[] args) {
        String wordOne = "dog";
        String wordTwo = "dog";

        if (wordOne == wordTwo) { 
            System.out.println("Both words are the same");
        } else {
            System.out.println("Differences found");
        }

        char[] arrOfCharOne = new char[3];
        arrOfCharOne[0] = 'd';
        arrOfCharOne[1] = 'o';
        arrOfCharOne[2] = 'g';
                        
        char[] arrOfCharTwo = new char[3];
        arrOfCharTwo[0] = 'd';
        arrOfCharTwo[1] = 'o';
        arrOfCharTwo[2] = 'g';

        System.out.println("ONE: " + arrOfCharOne);
        System.err.println("TWO: " + arrOfCharTwo);
        if (arrOfCharOne == arrOfCharTwo) {
            System.out.println("Both arrs are the same");
        } else {
            System.out.println("Differences found");
        }
        
    }
}
