package employee2;

public class App2 {

	public static void main(String[] args) {
		Employee e = new Employee("Lee", "11", 500, "M");
//		e.salary = -100; // This is allowed when the class has the protected instead of the private.
		System.out.println(e);
		

	}

}
