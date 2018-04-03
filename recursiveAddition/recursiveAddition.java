
package recursiveAddition;
import java.util.Scanner;

public class recursiveAddition {
    
    public static int recursiveSum(int increment, int endValue, int sum){
        if (endValue <= 0){
            return sum;
        }
        else{
            sum += endValue + recursiveSum(increment, endValue-increment, sum);
        }
        return sum;
    }
    
    
    public static void main(String args[]){
        
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter the increment/start number (greater than 0):");
            int increment = sc.nextInt();
            System.out.println("Enter the end number (greater than 0):");
            int endValue = sc.nextInt();
            if(endValue % increment != 0){
                System.out.println("The end value and increment must both be odd or both be even.");
            }
            else{
                System.out.println("The sum is: " + recursiveSum(increment, endValue, sum));
            }
        }
    }
}
