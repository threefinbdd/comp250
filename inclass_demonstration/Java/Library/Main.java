/**
 * Library Demonstration
 * 
 * The following code is a demonstration of 
 * utilizing Classes to represent a Library/Bookstore.
 * 
 * Item represents the SuperClass (Parent) that will define
 * a generic product found in the Library/Bookstore.
 * 
 * Item extends to Book and CompactDisk for a further defined
 * product found in the Library/Bookstore.
 * 
 * This example also provides an overview of Design Patterns 
 * with respect to Coupling and Cohesion
 */
package Library;

public class Main {

    public static void createVinylExample() {
        
    }

    public static void createBookExample() {
        
    }

    public static void createOverloadItemExample() {
        /* Use Case of an Overload Constructor */
        //      public Item(String titleOfWork, String authorOfWork, String genre,
        //                  double price, int stockCount, Boolean isInStock)
        
        // Convention of Arguments must match
        Item newEntry = new Item(
            "Fahrenheit 451", "Bradbury", "Fiction",
                7.99, 1, true);
            
        /* Default Constructors can act as placeholders until you are certain of
         * the values to store in your attributes/fields.
         * 
         * Overload Constructors can also act as placeholders as long as
         * the developer follows a standard of "what is default".  You would 
         * instantiate the Item Object with these "default" values rather than 
         * filling in every field.
         * 
         * What if I consistently only know the Author, Title, and Genre?
         */
    }
    
    public static void createDefaultItemExample() {
        /*  Simple Use Case of a Default Constructor */
        Item newEntry = new Item();
        //  Attributes of a newEntry are set 
        //  to the Developer's interpretation of "default"
        
        newEntry.authorOfWork = "Bradbury";  /* BAD */
        newEntry.titleOfWork = "Fahrenheit 451";

        newEntry.setAuthor("Bradbury"); /* Object-Oriented Paradigm */
        newEntry.setTitle("Fahrenheit 451");

        /*
         * Although the above dot-operator (.) essentially performs the task
         * of the Accessor/Mutators, it is best practice to utilize actual
         * Accessor/Mutator methods to modify a data's information.
         */        
    }
    public static void main(String[] args) {
        // createDefaultItemExample();
        // createOverloadItemExample();
        // createBookExample();
    }
    
}
