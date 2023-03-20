import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Enum class that defines the specified year a student
 * may be in (typically based on credit hours)
 */
enum YearOfStudy {
    FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
}

class Main {
    public static void main(String[] args) {
        /* Create an unknown Student */
        Student studentOne = new Student();
        // Fill in information about student after discovery
        // studentOne.name = "John Doe";
        studentOne.setName("John Doe");
        // studentOne.letterGrade = 'B';
        studentOne.setLetterGrade('B');

        /* Create a known Student */
        Student studentTwo = new Student("John Smith", 'A');
        // System.out.println(studentTwo.toString());

        // studentTwo.printStudent();

        /* Place students together */
        // What data structure could work here?
        ArrayList<Student> room = new ArrayList<Student>();
        room.add(studentOne);
        room.add(studentTwo);

        // Let's add more Students!
        String[] names = { "Jane Doe", "Jane Smith", "Pam Beesly",
                "Dwight Shrute", "Michael Scott", "Kevin Malone" };
        char[] grades = { 'C', 'C', 'A', 'A', 'B', 'D' };
        for (int i = 0; i < names.length; i++) {
            Student newStudent = new Student(names[i], grades[i]);
            room.add(newStudent);
        }

        /* Class Object with Comparable inheritance */

        // Mimicking the above with Student_Comparable to illustrate implementing a
        // Comparable for sortBy methods
        String[] otherNames = { "John Doe", "John Smith", "Jane Doe", "Jane Smith", "Pam Beesly",
                "Dwight Shrute", "Michael Scott", "Kevin Malone" };
        char[] otherGrades = { 'B', 'A', 'C', 'C', 'A', 'A', 'B', 'D' };
        ArrayList<Student_Comparable> otherRoom = new ArrayList<Student_Comparable>();
        for (int i = 0; i < otherNames.length; i++) {
            Student_Comparable newStudent = new Student_Comparable(otherNames[i], otherGrades[i]);
            otherRoom.add(newStudent);
        }

        // Using implements Comparable & compareTo within Student_Comparator Object
        System.out.println("Before with Comparable compareTo:");
        for (Student_Comparable s : otherRoom) {
            System.out.println(s.toString());
        }
        System.out.println(""); // New line for output formatting

        Collections.sort(otherRoom);

        System.out.println("After with Comparable compareTo:");
        for (Student_Comparable s : otherRoom) {
            System.out.println(s.toString());
        }
        System.out.println("    *NOTE:  compareTo utilizes LetterGrade as sortBy field");
        System.out.println(""); // New line for output formatting

        /* Example with Blocks/Closures and Lambda Expression */

        /* Sorting with Blocks/Closures byName */
        // https://stackoverflow.com/questions/45769908/how-to-sort-the-name-along-with-age-in-java

        // Copy Constructor of one list to another list to illustrate multiple examples
        ArrayList<Student> sortedRoom = new ArrayList<Student>(room);

        System.out.println("Before Block/Closure Sort");
        for (Student s : room) {
            System.out.println(s.toString());
        }
        System.out.println(""); // New line for output formatting

        Collections.sort(sortedRoom, new Comparator<Student>() {
            @Override
            public int compare(Student current, Student other) {
                // Utilize compareTo from String's Library for String matching
                return current.getName().compareTo(other.getName());
            } // end of block/closure one-off method for compare
        }); // end of Collection.sort( ) syntax

        System.out.println("After Block/Closure Sort by Name");
        for (Student s : sortedRoom) {
            System.out.println(s.toString());
        }
        System.out.println(""); // New line for output formatting

        /* Sorting with Blocks/Closures byLetterGrade */
        // Copy Constructor of one list to another list to illustrate multiple examples
        sortedRoom = new ArrayList<Student>(room);

        Collections.sort(sortedRoom, new Comparator<Student>() {
            @Override
            public int compare(Student current, Student other) {
                if (current.getLetterGrade() > other.getLetterGrade()) {
                    return 1;
                } else if (current.getLetterGrade() < other.getLetterGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            } // end of block/closure one-off method for compare
        }); // end of Collection.sort( ) syntax

        System.out.println("After Block/Closure Sort by LetterGrade");
        for (Student s : sortedRoom) {
            System.out.println(s.toString());
        }
        System.out.println("    *NOTE: Similar results as the Comparable implementation");
        System.out.println(""); // New line for output formatting

        /* Using a Lambda Expression to have Nameless Sort Function */
        Collections.sort(room, (studentA, studentO) -> {
            // -> refers to a lambda expression
            // Student Closs Objects as arguments to be passed through
            // the lambda expression/anonymous function are to the left of ->
            return (studentA.getName().compareTo((studentO.getName())));
        }); // Sort with Lambda Expression

        System.out.println("After Lambda Sort by Name:");
        for (Student s : room) {
            System.out.println(s.getName());
        }
        System.out.println("    *NOTE:  Similar results as the Block/Closure sort");
        System.out.println(""); // New line for output formatting

    } // End of main
}
// End of Class