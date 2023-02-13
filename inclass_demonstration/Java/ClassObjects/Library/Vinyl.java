package ClassObjects.Library;

public class Vinyl extends CompactDisk{
    /*  Fields that define a Vinyl Record */
    int vinylSize; //  Vinyl Records can be either: 7-, 10-, or 12-inches
    int playableRPM; //  Based on the vinylSize, the user should play the record at 33, 45, or 78 RPM speed.

    public Vinyl() {
        super();
        this.vinylSize = 0;
        this.playableRPM = 0;
    }
        
    public Vinyl(String titleOfWork, String authorOfWork, String genre,
                double price, int stockCount, Boolean isInStock,     //  Definition of an Item
                int lengthInMinutes, String musicalClassification,  //  Definition of a CD
            int vinylSize, int playableRPM) {                       //  Definition of a Vinyl 
        super(titleOfWork, authorOfWork, genre,
            price, stockCount, isInStock,
            lengthInMinutes, musicalClassification);
        this.vinylSize = vinylSize;
        this.playableRPM = playableRPM;
    }
}
