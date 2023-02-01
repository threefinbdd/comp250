import java.util.Scanner;
import java.lang.Math;

class AreaOfASphere {
    public static void main(String[] args){
    	Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        //  1)  Prompt user for Radius input
        int radius = 0;
        radius = keyboard.nextInt();
        //  2)  Insert Radius into Area formula
        //  Area = 4*pi*r*r
        double area = 0.0;
        area = 4*Math.PI*radius*radius;
        //  3)  Output to user to two decimal places
        System.out.print("The Area of a Sphere given a radius of " + radius + "is ");
        System.out.print(area);
        // System.out.printf("%.2f", area);

        keyboard.close();
    }    
}
