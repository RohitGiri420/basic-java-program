
public class New {
    public static void main(String[] args){
        int n=4421;
        Solution obj = new Solution();
        int output= obj.subtractProductAndSum(n);
        System.out.println(output);
    }

}
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        int curr = n;
        while (curr > 0) {
            int digit = curr % 10;
            sum = sum + digit;
            product = product * digit;
            curr = curr / 10;

        }
        return product - sum;
    }
}
