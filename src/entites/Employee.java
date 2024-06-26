package entites;

public class Employee {
	
	public int id;
	public String name;
	public double grossSalary, tax;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, double grossSalary) {
		super();
		this.id = id;
		this.name = name;
		this.grossSalary = grossSalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return id + ": " + name + ", $" + String.format("%.2f", netSalary());
	}

}
