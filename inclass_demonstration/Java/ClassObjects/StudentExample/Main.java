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
        System.out.println("BAD");
        System.out.println(studentTwo);
        System.out.println("GOOD");
        System.out.println(studentTwo.toString());

        studentTwo.printStudent();

        /* Place students together */
        // What data structure could work here?

    } // End of main
} // End of Class