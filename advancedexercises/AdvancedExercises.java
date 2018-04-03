package advancedexercises;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdvancedExercises {
    
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


         while (true){
           try {
                System.out.println("Enter an integer.");
                int input = sc.nextInt();
                System.out.println("Good job!");
                break;
            }
                catch (InputMismatchException e) { 
                System.out.println("You did not enter an integer!");
                sc.next();
            }  
         } 
    }
    
}
