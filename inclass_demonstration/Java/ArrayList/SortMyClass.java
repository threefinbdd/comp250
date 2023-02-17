import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class SortMyClass {

    public static ArrayList<String> loadData2() {
        ArrayList<String> personList = new ArrayList<String>();
        try {
            File inputFile = new File("resources/Persons.txt");
            Scanner reader = new Scanner(inputFile);
            while (reader.hasNext()) {
                personList.add(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("File does not exist. . .");
        }
        return personList;
    }
    
    public static void loadData(ArrayList<String> personList) {
        try{
            File inputFile = new File("resources/Persons.txt");
            Scanner reader = new Scanner(inputFile);
            while (reader.hasNext()) {
                personList.add(reader.nextLine());
            }
        }catch(Exception e){
            System.out.println("File does not exist. . .");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> personList = new ArrayList<String>();
        //  load personList with passByReference by referential memory address
        loadData(personList);
        System.out.println("My First List:  ");
        for (String person : personList) {
            System.out.println(person);
        }
        System.out.println("----------------");

        ArrayList<String> personList2 = new ArrayList<String>();
        //  load personList2 with return statement
        personList2 = loadData2();
        System.out.println("My Second List:  ");
        for (String person : personList2) {
            System.out.println(person);
        }
        System.out.println("----------------");

        //  Collections Object allows for ArrayList sorting
        Collections.sort(personList);
        System.out.println("My alphabetically sorted list:");
        for (String person : personList) {
            System.out.println(person);            
        }
        System.out.println("----------------");
    }

}