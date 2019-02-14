package Ex1;

public class Pacient implements Comparable {

	public String nume;
	public int shours, sminutes;
	public int hours, minutes;
	
	public Pacient(String nume, int shours, int sminutes, int hours, int minutes) {	
		this.nume = nume;
		this.shours = shours;
		this.sminutes = sminutes;
		this.hours = hours;
		this.minutes = minutes;
	}	

	public String toString() {
		return nume+ " programat la ora "+shours+", "+sminutes+" minute (Durata estimata "+hours+" ore "+minutes+" minute)";
	}
	
	public int getStartTime() {
		return shours * 60 + sminutes;
	}

	public int getDuration() {
		return hours * 60 + minutes;
	}
	
	public double getValue() {
		return getStartTime()/getDuration();
	}
	
	@Override
	public int compareTo(Object o) {
		Pacient p = (Pacient)o;
		//return (int) Math.ceil(p.getValue() - this.getValue()); // sort by value
		return this.getStartTime() - p.getStartTime();
	}
	

}
