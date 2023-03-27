import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Student> readFile() throws Exception {
        ArrayList<Student> list = new ArrayList<>();
        File input = new File("StudentList.txt");
        Scanner reader = new Scanner(input);
        while (reader.hasNextLine()) {
            // A file line is formatted as:
            // firstName lastName, age, major
            String line = reader.nextLine();
            String[] token = line.split(", ");
            // token[0] is name, token[1] is age, token[2] is major
            Student newStudent = new Student(token[0], Integer.valueOf(token[1]), token[2]);
            list.add(newStudent);
        }

        reader.close();
        return list;
    }

    public static void writeFile(ArrayList<Student> myRoster) throws Exception {
        File output = new File("StudentList.txt");
        FileWriter writer = new FileWriter(output);
        for (Student s : myRoster) {
            writer.write(s.getName() + ", " + s.getAge() + ", " + s.getMajor());
            writer.write("\n");
        }
        writer.close();
    }

    public static Student addStudent(Scanner keyboard) {
        Student newStudent = new Student();
        System.out.print("Please enter Student's Name: ");
        String name = keyboard.nextLine();
        System.out.print("Please enter Student's Age: ");
        int age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Please enter Student's Major: ");
        String major = keyboard.nextLine();

        newStudent.setName(name);
        newStudent.setAge(age);
        newStudent.setMajor(major);
        return newStudent;
    }

    public static Student editStudent(Scanner keyboard, ArrayList<Student> myRoster) {
        Student editMe = new Student();
        // Display list of students
        int count = 0;
        for (Student s : myRoster) {
            count++;
            System.out.println(count + ": " + s.toString());
        }
        int userChoice = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Please enter a numeric ID to select a student to modify: ");
            userChoice = keyboard.nextInt();
            keyboard.nextLine();
            if (userChoice < 0 || userChoice > count) { // if input is out of bounds
                // wrong input
            } else {
                isValid = true;
            }
        }

        editMe = myRoster.get(userChoice - 1); // offset userChoice by 1.
        System.out.println("To be changed: ");
        System.err.println(editMe.toString());
        while (true) {
            isValid = false;
            while (!isValid) {
                System.out.println("Choose an option below: ");
                System.out.println("    1) Modify Name");
                System.out.println("    2) Modify Age");
                System.out.println("    3) Modify Major");
                System.out.println("    4) Quit Modifying");
                userChoice = keyboard.nextInt();
                keyboard.nextLine(); // handles trailing \n chars
                if (userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4) {
                    isValid = true; // toggle boolean for user input off
                }
            }

            if (userChoice == 1) {
                System.out.println("Please enter the Student's new name: ");
                String newName = keyboard.nextLine();
                editMe.setName(newName);
            } else if (userChoice == 2) {
                System.out.println("Please enter the Student's new name: ");
                int newAge = keyboard.nextInt();
                keyboard.nextLine();
                editMe.setAge(newAge);
            } else if (userChoice == 3) {
                System.out.println("Please enter the Student's new major: ");
                String newMajor = keyboard.nextLine();
                editMe.setMajor(newMajor);
            } else if (userChoice == 4) {
                break;
            }
        }

        return editMe;
    }

    public static void deleteStudent(Scanner keyboard, ArrayList<Student> myRoster) {
        Student deleteMe = new Student();
        // Display list of students
        int count = 0;
        for (Student s : myRoster) {
            count++;
            System.out.println(count + ": " + s.toString());
        }
        int userChoice = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Please enter a numeric ID to select a student to modify: ");
            userChoice = keyboard.nextInt();
            keyboard.nextLine();
            if (userChoice < 0 || userChoice > count) { // if input is out of bounds
                // wrong input
            } else {
                isValid = true;
            }
        }

        deleteMe = myRoster.get(userChoice - 1); // offset user input by 1

        System.out.println("Removing:  ");
        System.out.println(deleteMe.toString());

        myRoster.remove(userChoice - 1);

    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Student> myStudents = new ArrayList<>();
        try {
            myStudents = readFile();
        } catch (Exception e) {
            System.out.println("Could not read input file. . .");
            keyboard.close();
            return; // close program - no input file available
                    // equivalently: System.exit(0);
        }

        while (true) { // Infinite Loop for Programs Run
            // Display list of students
            for (Student s : myStudents) {
                System.out.println(s.toString());
            }

            boolean isValid = false;
            int userChoice = 0;
            while (!isValid) {
                System.out.println("Choose an option below: ");
                System.out.println("    1) Add A Student");
                System.out.println("    2) Edit An Existing Student");
                System.out.println("    3) Remove an Existing Student");
                System.out.println("    4) Exit Program");
                userChoice = keyboard.nextInt();
                keyboard.nextLine(); // handles trailing \n chars
                if (userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4) {
                    isValid = true; // toggle boolean for user input off
                }
            }

            // Handle user input
            if (userChoice == 1) {
                Student s = addStudent(keyboard);
                if (s == null) {
                    System.out.println("Invalid details for student, please try again. . .");
                } else {
                    myStudents.add(s);
                    System.out.println(s.toString() + " has been added to the roster.");
                }
            } else if (userChoice == 2) {
                Student s = editStudent(keyboard, myStudents);
                System.out.println("Details have been changed to: ");
                System.out.println(s.toString());
            } else if (userChoice == 3) {
                deleteStudent(keyboard, myStudents);
            } else if (userChoice == 4) {
                break;
            }
        }

        try {
            writeFile(myStudents);
        } catch (Exception e) {
            System.out.println("Trouble writing to file. . .");
        }
        keyboard.close();
    }
}
