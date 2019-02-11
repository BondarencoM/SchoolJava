package Ex2;

public class Manager extends Employee {

	public Manager(int years) {
		super(years);
	}
	@Override
	public double getBonus () {
		return super.getBonus() + 10000;		
	}

}
