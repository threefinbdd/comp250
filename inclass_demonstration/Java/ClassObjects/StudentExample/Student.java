
/*
 * Student Class object
 */
import java.util.ArrayList;

public class Student {
    // public class Student implements Comparable<Student> {
    /* Attributes that define a Student */
    private String name; // only accessible within Student.java
    protected char letterGrade; // only accessible within Project (this folder)
    ArrayList<String> major; // accessible by all
    String yearOfStudy;
    boolean isOnAcademicProbation;
    boolean isDoubleMajor;

    /* Polymorphism with constructors */
    /* Default Constructor */
    Student() {
        this.name = "";
        this.letterGrade = 'F';
        this.major = new ArrayList<String>();
        (this.major).add("Undecided");
        this.yearOfStudy = "";
        this.isOnAcademicProbation = false;
        this.isDoubleMajor = false;
    }

    /* Overload Constructor */
    Student(String name, char letterGrade, ArrayList<String> major, String yearOfStudy, boolean isOnAcademicProbation,
            boolean isDoubleMajor) {
        this.name = name;
        this.letterGrade = letterGrade;
        this.isDoubleMajor = isDoubleMajor;
        this.major = new ArrayList<String>();
        (this.major).add(major.get(0));
        for (String m : major) {
            (this.major).add(m);
        }
        this.yearOfStudy = yearOfStudy;
        this.isOnAcademicProbation = isOnAcademicProbation;
    }

    /* Overload Constructor #2 */
    Student(String name, char letterGrade) {
        this.name = name;
        this.letterGrade = letterGrade;
        this.isDoubleMajor = false;
        this.major = new ArrayList<String>();
        (this.major).add("Undecided");
        this.yearOfStudy = "";
        this.isOnAcademicProbation = false;
    }

    /* Overload Constructor for Majors */
    Student(String name, char letterGrade, String major, String yearOfStudy, boolean isOnAcademicProbation,
            boolean isDoubleMajor) {
        this.name = name;
        this.letterGrade = letterGrade;
        this.isDoubleMajor = isDoubleMajor;
        this.major = new ArrayList<String>();
        (this.major).add(major); // When a String is passed as a major
        this.yearOfStudy = yearOfStudy;
        this.isOnAcademicProbation = isOnAcademicProbation;
    }

    /* Accessors (getters) */
    public String getName() {
        return this.name;
    }

    public char getLetterGrade() {
        return this.letterGrade;
    }

    /* Mutators (setters) */
    public void setName(String name) {
        this.name = name;
    }

    public void setLetterGrade(char letterGrade) {
        this.letterGrade = letterGrade;
    }

    public String toString() {
        return this.name + " has a letter grade of " + this.letterGrade;
        // return getName() + "has a letter grade of " +
        // getLetterGrade();
    }

    public void printStudent() {
        System.out.println(this.name + " has a letter grade of " + this.letterGrade);
    }
}