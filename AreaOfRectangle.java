//Area Of Rectangle Program
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the breadth of Rectangle in cm : ");
        int breadth = input.nextInt();

        System.out.print("Enter the height of rectangle in cm : ");
        int height = input.nextInt();

        System.out.printf("area of rectangle is %d cm^2 ",breadth*height);
    }
}
