//Volume Of Pyramid

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of pyramid : ");
        int base = input.nextInt();

        System.out.print("Enter height of pyramid : ");
        int height = input.nextInt();

        System.out.printf("volume of pyramid is %f cm^3 ",0.3333*(base*height));
    }
}
