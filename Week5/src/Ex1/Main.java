package Ex1;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static Vector<Pacient> input_list;
	public static void main(String[] args) {
		InputStream input = Main.class.getResourceAsStream("data.in");
		Scanner sc = new Scanner(input);
		String aux[];
		input_list = new Vector<Pacient>();
		while (sc.hasNextLine()) {
			aux = sc.nextLine().split("	"); // SEPARAREA DUPA TABULARE
			input_list.add(new Pacient(aux[0], Integer.parseInt(aux[1]), Integer.parseInt(aux[2]), Integer.parseInt(aux[3]),Integer.parseInt(aux[4])));
		}
		
		System.out.println("Lista initiala: ");
		for (Pacient p : input_list) 
			System.out.println(p);
		
		Collections.sort(input_list);
		
		System.out.println("Lista Sortata: ");
		for (Pacient p : input_list) 
			System.out.println(p);
	
		Vector<Vector<Pacient>> res = getCombinations(input_list.size());
		
		int imax = -1, pmax= 0 ;
		for (int i = 0; i < res.size(); i++ ) {
			Vector<Pacient> list = res.elementAt(i);
			int pacs = getPacs(list);
			if(pacs > pmax) {
				pmax = pacs;
				imax = i;
			}
			
		}
		
		if(imax != -1) {
			System.out.println("Vor intra la dentist: ");
			for (Pacient p : res.elementAt(imax))
				System.out.println(p);
			}
		
		System.out.println("Trebuie anulate programarile pentru: ");
		for (Pacient p : input_list) {
			if(!res.elementAt(imax).contains(p)) {
				System.out.println(p);
			}
		}
	}
	
	public static int getPacs(Vector<Pacient> check) {
		check.add(0, (Pacient)input_list.toArray()[0] );
		for (int i =0; i<check.size()-1; i++) {
			if (check.elementAt(i).getStartTime() + check.elementAt(i).getDuration() > check.elementAt(i+1).getStartTime())
				return -1;	
		}
		
		int duration = check.lastElement().getStartTime() + check.lastElement().getDuration() - check.firstElement().getStartTime();
		//System.out.println(duration /60 );
		
		if( duration > 8*60) 
			return -1;
					
		
		return check.size();
	}
	
	public static void subsetsUtil(Vector<Pacient> A, Vector<Vector<Pacient> > res, Vector<Pacient> subset, int index) { 
		if (index != input_list.size())
		for (int i = 0; i < A.size(); i++) { 
	
			
			if (subset == null) subset = new Vector<Pacient>();
			subset.add(A.elementAt(i));
			
			if(check_combination(subset))
			res.add((Vector<Pacient>)subset.clone()); 

		   
		   subsetsUtil(A, res, subset, index + 1); 
		   subset.remove(subset.size() - 1);
		   
		} 
	}
	
	public static boolean check_combination(Vector<Pacient> array) {
	
		Vector<Pacient> newVect = new Vector<Pacient>(new LinkedHashSet<Pacient>(array));
		if (newVect.size() != array.size()) return false;
		
		for (int i = 0; i<array.size() -1; i++)
			if (array.elementAt(i).getStartTime() > array.elementAt(i+1).getStartTime())
				return false;	
		
		
		return true;
	}
	
	public static Vector<Vector<Pacient>> subsets(Vector<Pacient> A){ 
	    Vector<Pacient> subset = null; 
	    Vector<Vector<Pacient>> res = new Vector<Vector<Pacient>>();  
	  
	    // keeps track of current element in vector A; 
	    int index = 0; 

	    subsetsUtil(A, res, subset, index); 
	    return res; 
	} 

	
	public static Vector<Vector<Pacient>> getCombinations(int n) 
	{ 
	    Vector<Vector<Pacient>> res = subsets(input_list);   
	    System.out.println(res);
	    return res;	     
	} 

}
