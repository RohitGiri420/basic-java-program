//Total Surface Area Of Cube

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of cube in cm : ");
        int side = input.nextInt();

        System.out.printf("total surface area of cube is %d",6*(side*side));
    }
}
