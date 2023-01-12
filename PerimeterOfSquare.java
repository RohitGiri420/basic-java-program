//Perimeter Of Square

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side of square in cm  : ");
        int side = input.nextInt();

        System.out.printf("perimeter of square is %d cm",4*side);

    }
}
