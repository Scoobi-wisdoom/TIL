package gene;

import java.util.HashMap;
import java.util.Set;

public class Cart<K, V> {
	HashMap<K, V> map;
	public Cart() {
		map = new HashMap<>();
	}
	
	public void addCart(K k, V v) {
		map.put(k, v);
	}
	
	public HashMap<K, V> getCart() {
		return map;
	}
	
	@Override
	public String toString() {
		return "Cart [map=" + map + "]";
	}
	
	
}
