//Perimeter Of Equilateral Triangle

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side of equilateral triangle in cm : ");
        int side = input.nextInt();

        System.out.printf("perimeter of equilateral triangle is %d cm",3*side);

    }
}
