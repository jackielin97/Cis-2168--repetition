package assign5_template;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ChangeDispenser {

	// Create    //public wrapper
    //NOTE - your wrapper method does NOT have to be a void method.
    public static List<Integer> makeChange(int amount, List<Integer> coinList) {
        //add your code
        //Hints:
        //Use a list to store the denomination values of coins in decreasing order.
	//Use a second list to store the names of coins in the same order as their denomination value list.
      
        //call the private recursive counterpart and pass the corresponding
        //   arguments.
    	// Take the first coin from coinList
    	// Divide to get the number of changes of this coin
    
    	if(coinList.isEmpty()) {
    		List<Integer> result = new ArrayList<Integer>();
    		return result;
    	}
    	
    	int currentCoin = coinList.get(0);
    	int numOfChanges =0;
    	int newAmount=0;
    	numOfChanges= amount / currentCoin;
    	newAmount= amount % currentCoin;
    	// Modulus to get the next amount
    	
    	List<Integer> result = makeChange(newAmount, coinList.subList(1, coinList.size()));
    	result.add(0, numOfChanges);
    	return result;
   
    }

    //private recursive counterpart
    //NOTE - your recursive method does NOT have to be a void method.
    // example:
    // private static void makeChange(parameter list) {
    //   HintS -
    //       Your recursive method uses the coin value list and the coin name list. 
    //       In each call to the recursive method, the count of the first coin in the list 
    //          (coin in largest denomination value) is calculated and printed out. 
    //       Then the first coin is removed from the lists. 
    //       The remaining amount of money is calculated. 
    //       The coin lists and the remaining amount are passed to the next recursive call. 
    //       The recursion ends when no money is left.
    //}
    
    public static void main(String[] args) {

    	ArrayList<Integer> change = new ArrayList<>();
    	ArrayList<Integer> coinList = new ArrayList(List.of(100, 50, 25, 10, 5, 1));
    	int amount = 123;
    	List<Integer> changes = makeChange(amount, coinList);
    	
        //add your code to do the following:
        
   	
        //prompt the user to enter the amount in dollars and cents
        //get the amount
        //convert the amount to all cents
        //call the public wrapper method
    	List<Integer> result = makeChange(123,coinList);
    	System.out.println(result.toString());
        //NOTE -
        // test your code using $2.91, $0.91, $0.78, $0
    }

    
}
