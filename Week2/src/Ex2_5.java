import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2_5 {
	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduceti genomul:");
		str = s.nextLine();
		
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(str);
		while (m.find()) {
		   if( m.group().length() % 3 ==0)
			   System.out.println(m.group());
		}		
	}
}
