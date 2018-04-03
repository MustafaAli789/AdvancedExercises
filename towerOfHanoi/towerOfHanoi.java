
package towerOfHanoi;
import java.util.Scanner;


public class towerOfHanoi {
    
    public static int moveSolver(int diskNum){
        int numMoves = 0;
        
        if(diskNum< 1){
            return numMoves;
        }
        else{
            numMoves += 2*moveSolver(diskNum-1)+1;
        }
        return numMoves;
    }
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int diskNum;
        
        while (true){
            System.out.println("Enter the number of dissk in the tower of Hanoi game.");
            diskNum = sc.nextInt();
            
            if(diskNum > 0){
                System.out.println("The number of moves needed to win the game is: " + moveSolver(diskNum));
            }
            else{
                System.out.println("Enter a number greater than 0!");
            }
        }
        
    }
    
    
}
