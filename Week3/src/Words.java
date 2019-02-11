import java.util.ArrayList;
import java.util.Scanner;

public class Words {
  public static void main(String[] args) {

      ArrayList<String> words = new ArrayList<String>();

      Scanner input = new Scanner(System.in);

      String word = "";
      //Ask the user for 10 words
      System.out.println("Please enter ten words");
      for( int i = 0; i<10; i++ ) {
    	  System.out.print(i+" ");
    	  word = input.next();
    	  words.add(word);
      }

      //Print the list and it size
      //Hint: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#size--
      for(String s : words) {
    	  System.out.println(s);
      }
      System.out.println("List size: "+words.size());
      
      //Ask the user for 1 letter
      System.out.println("Enter a leeter");
      char c = input.next().charAt(0);
    
      
      

      //Remove from list all the words that start with that letter
      //Hint: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#remove-java.lang.Object-
      for(String s : words) {
    	  if (s.charAt(0) == c)
    		  words.remove(s);
      }

      	
      //Print the List again and it size
      for(String s : words) {
    	  System.out.println(s);
      }
      System.out.println("List size: "+words.size());
      
  }
}
