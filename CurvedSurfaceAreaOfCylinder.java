//Curved Surface Area Of Cylinder

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of cylinder in cm : ");
        int radius = input.nextInt();

        System.out.print("Enter height of cylinder in cm : ");
        int height = input.nextInt();

        System.out.printf("curved surface area of cylinder is %f cm^2",2*Math.PI*radius*height);
    }
}
