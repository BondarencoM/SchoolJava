package Ex3;

public class DramaPrintedBook extends DramaBook implements printedBook {

	String dimensions;
	String weight;
	
	public DramaPrintedBook(String titlu, String autor, int yearOfPublication, String time, String place, String dimensions, String weight) {
		super(titlu, autor, yearOfPublication, time, place);
		this.dimensions = dimensions;
		this.weight = weight;
	}

	@Override
	public String getDimensions() {
		return dimensions;
	}

	@Override
	public String getWeight() {
		return weight;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Weight: " + weight);
		System.out.println("Dimensions: " + dimensions);
		
	}

}
