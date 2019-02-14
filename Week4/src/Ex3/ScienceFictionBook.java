package Ex3;

public class ScienceFictionBook extends Book {
	String subject;

	public ScienceFictionBook(String titlu, String autor, int yearOfPublication, String subject) {
		super(titlu, autor, yearOfPublication);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Subject: "+subject);
	}
		
}
