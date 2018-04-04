
package binarySearch;
import  java.util.*;


public class binarySearch {

    public static boolean search(int number, ArrayList<Integer> numList){
        int high = numList.size()-1;
        int low = 0; 
        int middle;
        
        while (low <=high){
            middle = (low+high)/2;
            if(number > numList.get(middle)){
                low = middle+1;
            }
            else if(number < numList.get(middle)){
                high = middle -1;
            }
            else{ //equal numbers have been found
                return true;
            }
        }
        return false; //no matching numbers found
        
    }
    
    
    public static void main(String args[]){
        ArrayList<Integer> numList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        
        //just making a sample arrayList
        for(int i=0; i<50; i+=2){
            numList.add(i);
        }
                
        while(true){
            System.out.println("Enter the number you wish to find the positon of.");
            number = sc.nextInt();
            if (search(number, numList)){
                System.out.println("The number exists in the list.");
            }
            else{
                System.out.println("The number does not exist.");
            }
            
            
        }
        
    }
}
