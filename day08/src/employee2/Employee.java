package employee2;

public class Employee {
	private String name;
	private String id;
	private double salary;
	private String dept;
	
	// protected is open to children and files in the same directory.
//	protected String name;
//	protected String id;
//	protected double salary;
//	protected String dept;
	
	public Employee() {}
	public Employee(String name, String id, double salary, String dept) {
		this.name = name;
		this.id = id;
		if(salary < 0) {
			salary = 0;
		} 
		this.salary = salary;
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
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
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", dept=" + dept + "]";
	}

}
