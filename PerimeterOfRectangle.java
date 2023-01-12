import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length in cm : ");
        int length = input.nextInt();

        System.out.print("Enter breadth in cm : ");
        int breadth = input.nextInt();

        System.out.printf("perimeter of parallelogram is %d cm",2*(length+breadth));
    }
}
