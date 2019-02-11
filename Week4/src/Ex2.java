public class Ex2 {
public static void main(String[] args) {
	Employee jackie = new Employee(6);
	Employee joe = new Manager(8);
	
	System.out.println("Jackie Gross Salary: " + jackie.getGrossSalary() + 
			" Net Salary " + jackie.getNetSalary());
	
	System.out.println("Joe Gross Salary: " + joe.getGrossSalary() + 
			" Net Salary " + joe.getNetSalary());
	/* SOLUTIE
		Jackie Gross Salary: 46000.0 Net Salary 41400.0
		Joe Gross Salary: 58000.0 Net Salary 49300.0
	*/
	}
}