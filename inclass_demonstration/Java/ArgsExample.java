/**
 * ArgsExample Demonstration
 * 
 * The following code is a demonstration of 
 * how to utilize the String[] args Argument/Parameter
 * 
 */

class ArgsExample {

    public static void main(String[] args) {
        /* 
        Quick Overview: 
        
        Java Class Objects are called from the Command Line
            java ArgsExample        
        */
        if (args.length != 0) {
            System.out.println("I was called with Arguments!");
            for (String arg : args) { // for-each; commonly used in Python
                System.out.println(arg);
            }
        }else{
            System.out.println("I was called!");
        }
    }
}
