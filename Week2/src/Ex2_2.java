import java.util.Scanner;

public class Ex2_2 {
	
	public static void main(String[] args) {
		System.out.println("Introduceti string-ul");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		for(char c : str.toCharArray() ) {
			 System.out.print(transform(c));
		}		
	}
	
	public static char transform(char c) {
		switch (c) {
		case 'a':
		case 'b':
		case 'c':
		case 'A':
		case 'B':
		case 'C':
			return '2';
		case 'd':
		case 'e':
		case 'f':
		case 'D':
		case 'E':
		case 'F':
			return '3';
		case 'g':
		case 'h':
		case 'i':
		case 'G':
		case 'H':
		case 'I':
			return '4';
		case 'j':
		case 'k':
		case 'l':
		case 'J':
		case 'K':
		case 'L':
			return '5';
		case 'm':
		case 'n':
		case 'o':
		case 'M':
		case 'N':
		case 'O':
			return '6';
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			return '7';
		case 't':
		case 'u':
		case 'v':
		case 'T':
		case 'U':
		case 'V':
			return '8';
		case 'w':
		case 'x':
		case 'y':
		case 'z':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			return '9';	

		default:
			return c;
		}
	}
}
