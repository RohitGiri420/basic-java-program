//Volume Of Cylinder

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of cylinder in cm : ");
        int radius = input.nextInt();

        System.out.print("Enter the height of cylinder in cm : ");
        int height = input.nextInt();

        System.out.printf("volume of cylinder is %f cm^3",Math.PI*(radius*radius)*height);
    }
}
