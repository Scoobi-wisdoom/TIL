package employee2;

public class App3 {
	
	public static void main(String args[]) {
		Employee es[] = new Employee[3];
		
		es[0] = new Employee("Seo", "00", 500, "M");
		
		// heterogeneous collections
		// refer to the inheritance of any class from Object in java.
		es[1] = new Manager("Lee", "11", 500, "M", 100);
		es[2] = new Sales("Kee", "22", 500, "M", "Seoul", 100);
		
		// subclasses' methods remain valid.
		for(int i=0; i<es.length; i++) {
			System.out.println(es[i].annSalary());
		}
		
	}

}
