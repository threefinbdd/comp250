/**
 * AlphabetLoop.java
 * 
 * The following code is a demonstration of 
 * utilizing loops to output the alphabet 
 * while also illustrating TypeCasting of
 * Numeric values to Character representation
 * 
 * Remember from the ASCII table,
 * Decimal Values 65 to 90 represent 
 * UpperCase Letters from A-Z
 * Decimal Values 97 to 122 represent
 * LowerCase Letters from a-z
 * 
 */

class AlphabetLoop {

    public static void printUpperCase() {
        int count = 1;
        for (int i = 90; i >= 65; i--) {
            System.out.println("i is " + i + ":\t(char)" + (char) i);
            // Can we format this cleaner:
            // System.out.print("i is " + i + ": (char)" + (char) i + "\t\t");
            // if (count % 4 == 0) {
            //     System.out.println();
            // }
            // count++;
        }
        System.out.println();
        
    }
    public static void printLowerCase() {
        int count = 1;
        for (int i = 97; i <= 122; i++) {
            System.out.println("i is " + i + ": (char)" + (char) i);
            // Can we format this cleaner:
            // System.out.print("i is " + i + ": (char)" + (char) i + "\t\t");
            // if (count % 4 == 0) {
            //     System.out.println();
            // }
            // count++;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        /*  LowerCase Letters from a-z*/
        // printLowerCase();
        /*  UpperCase Letters from Z-A */
        // printUpperCase();
    }
    
    public static void run() {
       System.out.println("I'm from a different class!"); 
    }
}