import java.util.Scanner;

public class Carte {
	String titlu, autor, editura;
	int pagini;
	
	public Carte (String titlu, String autor, String editura, int pagini) {
		this.titlu = titlu;
		this.autor = autor;
		this.editura = editura;
		this.pagini = pagini;
	}
	
	public Carte(Scanner s) {
		System.out.println("Va sa rugam introduceti titlul");
		titlu = s.nextLine();
		System.out.println("Va sa rugam introduceti autorul");
		autor = s.nextLine();
		System.out.println("Va sa rugam introduceti editura ");
		editura = s.nextLine();
		
		int num;
		try {
			do {
				System.out.println("Va sa rugam introduceti un numar de pagini valid");
				num = Integer.parseInt(s.nextLine());	
			}while(num <= 0);
			pagini = num;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			do {
				System.out.println("Va sa rugam introduceti un numar de pagini valid");
				num = Integer.parseInt(s.nextLine());	
			}while(num <= 0);
			pagini = num;
		}
	}

	public String toString() {
		return titlu.toUpperCase() + ", " + autor + ",  " + editura.toLowerCase();
	}
	
}

