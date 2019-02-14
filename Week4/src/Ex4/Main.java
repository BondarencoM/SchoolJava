package Ex4;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	   
		String [] toys = new String[9]; 
	    toys[0] = "BuzzLightyear"; 
	    toys[1] = "SheriffWoody";
	    toys[2] = "Mr. PotatoHead"; 
	    toys[3] = "Barbie";
	    toys[4] = "Troll doll"; 
	    toys[5]= "Tonka Truck"; 
	    toys[6] = "Elmo"; 
	    toys[7] = "Big bird";
	    toys[8] = "Cookie Monster";
	    
	    int size = toys.length;
	      
	    ArrayList<String> toys_list = new ArrayList<String>(); 
	    
	    for(String s : toys)
	    	toys_list.add(s);
	    
	     Collections.sort(toys_list);
	     
	  System.out.println("Sorted: " + toys_list); 
	  
	//Make a list of lists or hashmap to classify the toys.
	//Then sort the list of lists or hashmap ascendingly
	//Print each value

	}

}
