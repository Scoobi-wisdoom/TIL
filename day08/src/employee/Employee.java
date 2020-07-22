package employee;

public class Employee {
	String name;
	String id;
	double salary;
	String dept;
	
	public Employee() {}
	public Employee(String name, String id, double salary, String dept) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.dept = dept;
	}
	
	
	public double annSalary() {
		double ann = 0.0;
		ann = this.salary * 12;
		return ann;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", dept=" + dept + "]";
	}

}
