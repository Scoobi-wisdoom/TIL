package gene;

import java.util.HashMap;
import java.util.Set;

public class App2 {
	
	public static void main(String args[]) {
//		Cart<Integer, Object> cart = new Cart<>(); // By writing Object, it is possible to add either of Candy and Macaron.
		Cart<Integer, Product> cart = new Cart<>();
		Macaron m = new Macaron("Macaron", 1000);
		Candy c = new Candy("Candy", 2000, 10);
		cart.addCart(1, m);
		cart.addCart(2, c);
		

		// cart�� �ִ� ��� ������ ������ �ͼ�
		HashMap<Integer, Product> map = cart.getCart();
		// ����Ͻÿ�.
		Set<Integer> keys = map.keySet();
		for(int i:keys) {
			System.out.println(map.get(i));
		}
		
		// Total price �� ����Ͻÿ�.
		int total = 0;
		for(int i:keys) {
			total += map.get(i).getPrice();
		}
		System.out.println("Total: "+total);
	}

}
