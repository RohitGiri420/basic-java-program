//Perimeter Of Circle

import java.sql.SQLOutput;
import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of circle in cm : ");
        int radius = input.nextInt();

        System.out.printf("area of triangle is %f cm",2*Math.PI*radius);

    }
}
