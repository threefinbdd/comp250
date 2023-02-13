package ClassObjects.Library;

public class Item {
    /*  Fields that define a generic Item found at a Library */
    String titleOfWork;
    String authorOfWork;
    String genre;
    double price;
    int stockCount;
    Boolean isInStock;

    //  Default Constructor
    public Item() {
        titleOfWork = "";
        authorOfWork = "";
        genre = "";
        price = 0;
        stockCount = 0;
        isInStock = false;
    }

    //  Overload Constructor
    public Item(String titleOfWork, String authorOfWork, String genre,
                double price, int stockCount, Boolean isInStock) {
        this.titleOfWork = titleOfWork;
        this.authorOfWork = authorOfWork;
        this.genre = genre;
        this.price = price;
        this.stockCount = stockCount;
        this.isInStock = isInStock;
    }

    //  Overload Constructor #2
    public Item(String titleOfWork, String authorOfWork, String genre) {
        this.titleOfWork = titleOfWork;
        this.authorOfWork = authorOfWork;
        this.genre = genre;
        /* Follow a standard for default values */
        this.price = 0.0;
        this.stockCount = 0;
        this.isInStock = false;        
    }
    /* Getter/Accessor */
    String getTitle() {
        return this.titleOfWork;
    }

    String getAuthor() {
        return this.authorOfWork;
    }
    
    String getGenre() {
        return this.genre;
    }

    // float getPrice()
    // int getStock()
    // Boolean getInStock()  /* Naming Convention?  Maybe getAvailability() */

    /* Setter/Mutator */  
    void setTitle(String titleOfWork) {
        this.titleOfWork = titleOfWork;
    }

    void setAuthor(String authorOfWork) {
        this.authorOfWork = authorOfWork;
    }
    
    void setGenre(String genre) {
        this.genre = genre;
    }

    // void getPrice(int price)
    // void getStock(int stock)
    void getInStock(boolean inStock) {
        this.isInStock = inStock;
    }

    //  Check-In:  Stock++
    public void checkIn() {
        this.stockCount++;
    }
    
    //  Check-Out:  Stock--, if Stock == 0, boolean flag
    public void checkOut() {
        this.stockCount--;
    }
}