package Ex3;

public class Book {
	
	String titlu, autor;
	int yearOfPublication;
	
	public Book(String titlu, String autor, int yearOfPublication) {
		this.titlu = titlu;
		this.autor = autor;
		this.yearOfPublication = yearOfPublication;
	}
	
	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public String getTitlu() {
		return titlu;
	}

	public String getAutor() {
		return autor;
	}
	public void print() {
		System.out.println("Title: "+titlu);
		System.out.println("Author: "+autor);
		System.out.println("Year of pubication: "+yearOfPublication);
		
	}
	
}
