//Area Of Equilateral Triangle
import java.util.Scanner;
import java.lang.Math;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the side of triangle in cm : ");
        int side = input.nextInt();

        System.out.printf("Area of equilateral triangle is %f cm^2",(Math.sqrt(3)/4)*(side*side));

    }
}
