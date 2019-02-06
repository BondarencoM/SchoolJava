
public class TimeHelper {
	private int totsecs;
	
	public TimeHelper(int totsecs) {
		this.totsecs = totsecs;
	}
	
	public String toString() {
		//return hour + " ore " + min + " minute " + sec + " secunde";
		String s = "";
		if (inHours() == 1) { s = "1 ora ";}
		else { s = inHours() + " ore "; }
		
		if (inMins() == 1) { s += "1 minuta "; }
		else { s+= inMins() + " minute "; }
		
		if (inSeconds() == 1) { s += "1 secunda"; }
		else { s+= inSeconds() + " secunde "; }
		
		return s;
	}
	
	public int inHours() {
		return totsecs / 3600;
	}
	public int inMins() {
		return (totsecs % 3600 ) / 60;
	}
	public int inSeconds () {
		return totsecs % 60; 
	}
}
