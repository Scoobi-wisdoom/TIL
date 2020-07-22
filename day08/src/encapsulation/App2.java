package encapsulation;

public class App2 {
	
	public static void main(String args[]) {
		Employee e = new Employee("Lee", "11", 500, "M");
		System.out.println(e.getName()+" "+e.getSalary());
		
		e.setName("Kim");
		System.out.println(e);
	}

}
