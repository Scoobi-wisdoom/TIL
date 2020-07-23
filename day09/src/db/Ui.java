package db;

public class Ui {
	
	public static void main(String args[]) {
		DbImpl dbi = new DbImpl("192.168.111.1", 1000); // Database object's ip address = "192.168.111.1"
		
		User u = new User("id01", "pwd01", "Lee");
		dbi.insert(u);
		dbi.delete("id01");
		User uu = new User("id01", "pwd02", "Kim");
		dbi.update(uu);
		System.out.println("-------------------------");
		User dbu = dbi.select("id01");
		System.out.println(dbu);
		System.out.println("-------------------------");
		User us[] = dbi.select();
		
		// An enhanced for loop
		for(User uus:us) {
			System.out.println(uus);
		}
	}

}
