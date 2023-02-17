import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class BasicFileIO {
    //  Implements a throws Exception for a case that the FileWriter object cannot
    //  write to a file (either because of permissions or file existence, etc.)    
    public static void writeContentToFile(String content) throws Exception {
        //  Predefined output file name to be created at the "root" of the
        //  Program Structure.  Ideally this is created in the same location as
        //  where your Java file is located.
        String outputFileName = "output1.txt";

        //  Connect the program to the idea of a "file" object.
        File outputFile = new File(outputFileName);
        //  Connect a File to the idea of what can be "put" inside the file
        //  for content writing/creation
        FileWriter writer = new FileWriter(outputFile);
        
        //  Implements the actual "writing" or outputting into a File object.
        //  Actually places "content" into the file.
        writer.write(content);
        
        writer.close();  //  Save and Close what was written to the file

    }

    //  Implement a throws Exception for the case that a File is not found when
    //  performing an action on an input file named 'input1.txt'
    public static void readFile() throws FileNotFoundException {
        //  Open up a link between the program and the File on computer
        File inputFile = new File("input1.txt");
        //  Connect an object to "read" the input file
        Scanner reader = new Scanner(inputFile);

        //  Loop for each "line" of content of input file
        String line = "";
        while (reader.hasNext()) {
            line = reader.nextLine();
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        //  readFile has the potential to "throw" an exception.
        //  The main method (caller) must handle this now.
        //  try-catch statement reads as:
        //  "try performing the method readFile.  
        //  If readFile throws an exception, catch it to process"
        try {
            readFile();
        } catch (FileNotFoundException e) {
            //  What should the program do if an Exception is caught during
            //  the runtime of readFile?
            System.out.println("Exception was caught!  File not found. . .");
            System.err.println("Program ending. . .");
        }
        
        String content = "the quick brown fox jumped over the lazy dog.";
        
        //  writeContentToFile has the potential to "throw" an exception.
        //  The main method (caller) must handle this now.
        //  try-catch statement reads as:
        //  "try performing the method readFile.  
        //  If readFile throws an exception, catch it to process"
        try {
            writeContentToFile(content);
            //  at the end of this method call, if a file "output1.txt" does not exist
            //  in the same location as where the java file was created, your IDE needs
            //  to change what it views as the "top-level" of your program structure.

            //  This doesn't essentially "break" your code, but if you lose track of where Files are created,
            //  you might end up filling your computer with files you did not intend to.
        } catch (Exception e) {
            System.out.println("Exception was caught!  File could not be written into. . .");
            System.err.println("Program ending. . .");        }
    }
}
