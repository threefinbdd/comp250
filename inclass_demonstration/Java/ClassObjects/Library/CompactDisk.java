package ClassObjects.Library;

public class CompactDisk extends Item{
    /*  Fields that specifically define a Book */
    int lengthInMinutes;
    /***
     * musicalClassification:
     * 
     * With respect to the Music industry, a released album is classifed
     * based on the length of the release or by the number of tracks.
     * 
     * The musicalClassification represents 
     * if the CompactDisk was defined as a(n):
     *  Single:  A song track
     *  EP: Extended Play, typically 4-5 tracks
     *  LP: Long Play, typically a fully released album
     */
    String musicalClassification;

    public CompactDisk() {
        super(); // Inherit Constructor of Item()
        lengthInMinutes = 0;
        musicalClassification = "";
    }
    
    public CompactDisk(String titleOfWork, String authorOfWork, String genre,
                double price, int stockCount, Boolean isInStock,
                int lengthInMinutes, String musicalClassification) {
        super(titleOfWork, authorOfWork, genre,
                price, stockCount, isInStock);
        this.lengthInMinutes = lengthInMinutes;
        this.musicalClassification = musicalClassification;
    }    
}
