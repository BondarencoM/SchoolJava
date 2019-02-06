import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2_1 {
	public static void main(String[] args) {
		System.out.println("Introduceti parola");
		Scanner s = new Scanner(System.in);
		check(s.nextLine());
		s.close();
	}
	
	public static void check(String pass) {
		if(pass.length()<8){
			System.out.println("Invalid Password");
		}
		else if(! pass.matches("^[A-Za-z0-9]+$") ) {
			System.out.println("Invalid Password");
		}
		else if (getDigitsCount(pass)<2) {
			System.out.println("Invalid Password");
		}
		else {
			System.out.println("Valid Password");
		}
	}
	public static int getDigitsCount(String input) {
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(input);
		int count = 0;
		while (m.find())
		    count++;
		return count;
	}
}
