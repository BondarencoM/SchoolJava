
public class Verificari {
	public static boolean isIdentic(Carte a, Carte b) {
		return a.autor.equalsIgnoreCase(b.autor) && a.editura.equalsIgnoreCase(b.editura) && 
				a.titlu.equalsIgnoreCase(b.titlu) && a.pagini == b.pagini;
	}
	public static Carte getBiggest (Carte a, Carte b) {
		if(a == null) { return b; }
		if(b == null) { return a; }
		
		if(a.pagini > b.pagini) {
			return a;
		}
		if ( a.pagini < b.pagini) {
			return b;
		}
		return null;
	}
}
