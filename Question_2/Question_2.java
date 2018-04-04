
package Question_2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        while (true){
           try {
                System.out.println("Enter an integer.");
                int input = sc.nextInt();
                System.out.println("Good job! That is an integer!");
                break;
            }
                catch (InputMismatchException e) { 
                System.out.println("You did not enter an integer!");
                sc.next();
            }  
         } 
    }
}
