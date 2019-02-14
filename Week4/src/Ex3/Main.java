package Ex3;

public class
Main {
public static void main(String[] args) {
	ScienceFictioneAudioBook book1 = new ScienceFictioneAudioBook( "The Android Invasion","J. Morgan",2017,"Technology",12,"8mb");
	book1.print();
	System.out.println("-----------------------");
	DramaPrintedBook book2 = new DramaPrintedBook("The Inheritance","A.Carson",1965,"Medieval","Europe","5.6 x 2.8 x 8.3 inches", "1.6 pounds");
	book2.print();
	
	/* SOLUTIE
	Title: The Android Invasion
	Author: J. Morgan
	Year of publication: 2017
	Subject: Technology
	Number of Tracks: 12
	Size: 8mb
	-----------------------
	Title: The Inheritance
	Author: A. Carson
	Year of publication: 1965
	Time: Medieval
	Place: Europe
	Weight: 1.6 pounds
	Dimensions: 5.6 x 2.8 x 8.3 inches
	*/
	}
}