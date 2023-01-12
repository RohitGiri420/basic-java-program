//Volume Of Cone Java Program

import java.util.Scanner;
import java.lang.Math;

public class VolumeOfCone {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of cone in cm : ");
        int radius = input.nextInt();

        System.out.print("Enter height of cone in cm : ");
        int height = input.nextInt();

        System.out.printf("volume of cone %f cm^3",0.3333*(Math.PI)*(radius*radius)*height);


    }
}
