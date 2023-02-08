package Foundational;
/**
 * ArrayExamples.java
 * 
 * Sample demonstration of 
 * comparing arrays.
 */
public class ArrayExamples {

    public static void arrCompare_Numerics() {
        int[] arrOfNums1 = new int[10];
        for (int i = 0; i < arrOfNums1.length; i++) {
        // for (int i : arrOfNums1) {
            arrOfNums1[i] = i;
        }
        System.out.println("Print My Array: ");
        System.out.println(arrOfNums1);

        System.out.println("Print My Elements:");
        for(int i:arrOfNums1){
            System.out.print("[" + i + "] ");
        }
        System.out.println();  // new line for cleanliness
    }

    public static void arrCompare_Words() {
        String wordOne = "dog";
        String wordTwo = "dog";

        if (wordOne == wordTwo) { 
            System.out.println("Both Strings are the same");
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
            System.out.println("Both Arrays are the same");
        } else {
            System.out.println("Differences found");
        }
    }

    public static void main(String[] args) {
        System.out.println("Character Arrays:");
        arrCompare_Words();
        
        System.out.println("Number Arrays:");
        arrCompare_Numerics();
    }
}
