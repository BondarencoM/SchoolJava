import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Carte a = new Carte ("Amintiri din copilarie", "Ion Creanga", "crA",215);
		Carte b = new Carte ("Amintiri din copilarie", "Ion Creanga", "crA",215);
		
		System.out.println("<Test Read>");
		Carte c = new Carte(new Scanner(System.in));
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("</Test Read>");
		System.out.println("<Test getBiggest>");
		System.out.println("Cea ma groasa carte: ");
		System.out.println(Verificari.getBiggest(a, Verificari.getBiggest(b, c))  );
		System.out.println("</Test isBiggest>");
		
		System.out.println("<Test isIdentic>");
		if (Verificari.isIdentic(a,	 b)) {
			System.out.println("Cartea a si b sunt identice");	
		} else {
			System.out.println("Cartea a si b NU sunt identice");
		}
		
		if (Verificari.isIdentic(a,	 c)) {
			System.out.println("Cartea a si c sunt identice");	
		} else {
			System.out.println("Cartea a si c NU sunt identice");
		}
		System.out.println("</Test isIdentic>");
	}
}
