package Question_1;
import java.util.Scanner;

public class Question_1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter a dividend.");
        int inputDividend  = sc.nextInt();
        System.out.println("Enter a divisor.");
        int inputDivisor  = sc.nextInt();
        if (inputDivisor == 0){
            throw new ArithmeticException ("Divided by zero");      
        }
        else {
            System.out.println(inputDividend + "/" + inputDivisor + "=" + inputDividend/inputDivisor);
        }

    }
    
}
