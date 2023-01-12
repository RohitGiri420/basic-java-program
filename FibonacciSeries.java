import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int [] arr = new int[num];
        arr[0]=0;
        arr[1]=1;
        for (int i=2;i<num;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for (int a:arr){
            System.out.println(a);
        }
    }
}
