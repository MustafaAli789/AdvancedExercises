
package listFinder;
import java.util.*;


public class listFinder2 {
    
    public static void main (String args[]){
    
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        list.add("Pizza");
        list.add("Burger");
        list.add("Hot Dog");
        list.add("Meat");
        list.add("Lettuce");
        
        while(true){
            System.out.println("Enter an item you want to find the position of in your list or enter q to quit.");
            
            String item = sc.nextLine();
            
            if(item.equals("q")){
                break;
            }
            else{
                for (int i=0; i<list.size(); i++ ){
                    if (list.get(i).equals(item)){
                        System.out.println("The position of " + item + " in the list is: " + i);
                        break;
                    }
                    else if (list.get(i) != item && i == list.size()-1){
                        System.out.println("The item does not exist.");
                    }
                }
                
                
            }
        }
        
        
    }
    
}

