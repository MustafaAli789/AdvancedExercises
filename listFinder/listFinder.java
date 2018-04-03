
package listFinder;
import  java.util.ArrayList;
import java.util.Scanner;

public class listFinder {
    
    public ArrayList<String> list;
    
    public listFinder(ArrayList<String> list){
        this.list = list;
    }
   
    public int position(String item){
        
        for (int i=0; i<list.size(); i++ ){
            if (list.get(i).equals(item)){
                return i;
            }
        }
        return -1;
    }
            
    public static void main (String args[]){
        
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int position;
                
        //The code below would be technically entered in by individual using program
        list.add("Pizza");
        list.add("Burger");
        list.add("Hot Dog");
        list.add("Meat");
        list.add("Lettuce");
        
        listFinder findItem = new listFinder(list);
        
        
        while (true){
            System.out.println("Enter an item you want to find the position of in your list or enter q to quit.");
            
            String item = sc.nextLine();
            
            if(item.equals("q")){
                break;
            }
            else{
                position = findItem.position(item);
                if (position >= 0){
                    System.out.println("The position of " + item + " in the list is: " + position);
                }
                else{
                    System.out.println("The item does not exist in the list.");
                }
            }
        }
        
    }
    
}
