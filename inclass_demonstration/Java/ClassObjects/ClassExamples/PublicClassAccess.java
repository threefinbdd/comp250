package ClassObjects.ClassExamples; //  Necessary due to my "Current Working Directory on VSCode is "/java/"

public class PublicClassAccess {

    private static void calculator() {
        System.out.println("Generic Calculator Ouput.");
        System.out.println("5 + 5 = " + 5 + 5);
    }

    public static void run() {
        System.out.println("I came from a different Class Object!");
    }

    public static void run2() {
        calculator();
    }
}
