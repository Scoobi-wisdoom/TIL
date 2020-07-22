package encapsulation;

public class Employee {
	// encapsulation
	private String name;
	private String id;
	private double salary;
	private String dept;
	
	public Employee() {}
	public Employee(String name, String id, double salary, String dept) {
		this.name = name;
		this.id = id;
		this.salary = checkSalary(salary);
		this.dept = dept;
	}
	
	
	public double annSalary() {
		double ann = 0.0;
		ann = this.salary * 12;
		return ann;
	}
	
	public double taxSalary() {
		double tax = 0.0;
		tax = this.salary * 12 * (1 - 0.033);
		return tax;
	}
	
	// By attaching "private" this method is only able to be used in the existing class.
	private double checkSalary(double salary) {
		double result = 0.0;
		if(salary < 0) {
			result = 0.0;
		} else {
			result = salary;
		}
		
		return result;
	}
		
	public void setSalary(double salary) {
		this.salary = checkSalary(salary);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public String getDept() {
		return dept;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", dept=" + dept + "]";
	}

}
