package Ex2;
public interface Taxes { 
	
	public double getGrossSalary(); 
	public double getNetSalary();

	public static double getTaxRate(double gross_salary) {
		if (gross_salary < 10000 ) { 
			return 0.05;
		} else if (gross_salary >= 10000 && gross_salary < 20000) {
			return 0.07;
		} else if (gross_salary >= 20000 && gross_salary < 50000) {
			return 0.10; } 
		else { 
			return 0.15;
			}
		}
}