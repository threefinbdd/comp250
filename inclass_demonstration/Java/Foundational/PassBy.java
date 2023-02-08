package Foundational;
/**
 * PassBy.java
 * 
 * Sample code designed to demonstrate Java's
 * ability to manipulate variables by passing parameters
 * by Value and by Reference.
 * 
 * "Pass By Value" allocates (uses by creation) entirely new
 * memory addresses when using parameters.
 * 
 * "Pass By Reference" uses existing memory addresses
 * when using parameters.
 */
public class PassBy {

    public static void passByMemoryAddress(int[] myValue) {
        System.out.println("Inside Method: " + myValue);
        myValue[0] = 100;
    }

    public static void passByValue(int myValue) {
        myValue = 10;  // re-assigning the parameter a different value
    }

    public static void main(String[] args) {
        int myInitValue1 = 5;
        System.out.println("Before Pass By Value: " + myInitValue1);
        passByValue(myInitValue1);
        System.err.println("After PassByValue: " + myInitValue1);

        int[] myInitValue2 = new int[1];
        myInitValue2[0] = 25;
        System.out.println("Memory Address in Use (before): " + myInitValue2);
        System.out.println("Before Pass By Value: " + myInitValue2[0]);
        passByMemoryAddress(myInitValue2);
        System.err.println("Memory Address in Use (after): " + myInitValue2);
        System.err.println("After PassByValue: " + myInitValue2[0]);

    }
}
