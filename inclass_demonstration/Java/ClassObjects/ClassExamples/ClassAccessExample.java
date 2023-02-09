/**
 * ClassAccessExample Demonstration
 * 
 * The following code is a demonstration of 
 * scope visibility of Classes when using
 * access modifiers.
 */
package ClassExamples; //  Necessary due to my "Current Working Directory on VSCode is "java"

public class ClassAccessExample {
    public static void main(String[] args) {
        PublicClassAccess pca = new PublicClassAccess();
        pca.run(); //  Static Binding on Memory Squiggles
        // ClassPublicAccess.run();

        // pca.calculator();
        // pca.run2();
    }    
}
