//Area Of Rhombus
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class AreaOfRhombus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of rhombus in cm : ");
        int side = input.nextInt();

        System.out.print("Enter the height of rhombus in cm : ");
        int height = input.nextInt();

        System.out.printf("Area of rhombus is %d cm^2",height*side);
    }


}
