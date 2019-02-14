package Ex3;

public class DramaBook extends Book {
	
	String time, place;
	
	public DramaBook(String titlu, String autor, int yearOfPublication, String time, String place) {
		super(titlu, autor, yearOfPublication);
		this.time = time;
		this.place = place;
	}
	

	public String getTime() {
		return time;
	}

	public String getPlace() {
		return place;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Time: "+time);
		System.out.println("Place: "+place);
	}
}
