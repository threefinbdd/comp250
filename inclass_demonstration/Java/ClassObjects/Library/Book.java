package ClassObjects.Library;

public class Book extends Item {
    /*  Fields that specifically define a Book */
    String publisher;
    int pageCount;

    public Book() {
        super(); // Inherit Constructor of Item()
        publisher = "";
        pageCount = 0;
    }
    
    public Book(String titleOfWork, String authorOfWork, String genre,
                double price, int stockCount, Boolean isInStock,
                String publisher, int pageCount) {
        super(titleOfWork, authorOfWork, genre,
                price, stockCount, isInStock);
        this.publisher = publisher;
        this.pageCount = pageCount;
    }
}
