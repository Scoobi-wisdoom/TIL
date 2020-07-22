package employee;

public class Manager {
	String name;
	String id;
	double salary;
	String dept;
	double incentive;
		
	public Manager() {}
	public Manager(String name, String id, double salary, String dept, double incentive) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.dept = dept;
		this.incentive = incentive;	
	}
	
	public double annSalary() {
		double ann = 0.0;
		ann = this.salary * 12;
		return ann;
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", id=" + id + ", salary=" + salary + ", dept=" + dept + ", incentive="
				+ incentive + "]";
	}
	
	

}
