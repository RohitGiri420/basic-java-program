//Volume Of Sphere

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of sphere : ");
        int radius = input.nextInt();

        System.out.printf("Radius of sphere is %f",(1.333)*Math.PI*(radius*radius*radius));
    }
}
