//Area Of Triangle

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height of triangle in cm: ");
        int height = input.nextInt();

        System.out.print("Enter base of triangle in cm: ");
        int base = input.nextInt();

        System.out.printf("area of triangle is %f cm^3",0.5*base*height);

    }
}
