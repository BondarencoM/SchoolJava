package Ex2;
public class Employee implements Taxes {
	private double baseSalary = 40000;
	private int years;
	public Employee(int years)
	{ 
		this.years = years;
	}
	public double getBonus() 
	{
		return years*1000;
	}
	@Override
	public double getGrossSalary() {
	
		return baseSalary + getBonus()  ;
	}
	
	@Override
	public double getNetSalary() {
		double gs = getGrossSalary();
		return gs - gs * Taxes.getTaxRate(gs);
		
	}
}