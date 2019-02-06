import java.util.Scanner;

public class Ex2_3 {
	public static void main(String[] args) {
		String[][] tab = new String[][]{
			  { "China","Beijing"},
			  { "Ukraine","Kiev"},
			  { "Romania","Bucharest"},
			  { "Moldova","Chisinau"},
			  { "Czeh Republic","Praga"},
			  { "Russia","Moscow"},
			  { "Austria","Wien"},
			  { "Australia","Canberra"},
			  { "USA","Washington"},
			  { "Canada","Otawa"},
			  { "Japan","Tokyo"},
			  { "Brazilia","Brasilia"},
			  { "Madagascar","Antananarivo"},
			  { "Egypt","Cairo"},
			  { "Germany","Berlin"}
			};
			Scanner s = new Scanner(System.in);
			String answ;
			int score = 0;
			for (String[] row : tab ) {
				System.out.print("What is the capital of "+row[0]+" ? ");
				answ = s.nextLine();
				System.out.println("The correct answer shoul be "+row[1]);
				if(answ.toLowerCase().equals(row[1].toLowerCase()))
					score++;
			}
			
			System.out.println("Your score is: "+score);
	}
}
