package w0724;

import java.util.ArrayList;

public class ItemDb extends Db<String, Item> {
	
	
	ItemDb() {
		super();
	}
	ItemDb(String ip, int port) {
		super(ip, port);
	}
	@Override
	public void insert(Item v) throws Exception {
		connect();
		if(v.getId().equals("it04")) {
			close();
			throw new Exception("Duplicate Item...");
		}
		System.out.println("Inserted: "+v);
		close();		
	}
	@Override
	public void update(Item v) throws Exception {
		connect();
		System.out.println("Updated: "+v);
		close();		
	}
	@Override
	public void delete(String k) throws Exception {
		connect();
		System.out.println("Deleted: "+k);
		close();
		
	}
	@Override
	public Item select(String k) throws Exception {
		Item item = null;
		// k ���� �̿��ؼ� ����� ������ �˻��Ѵ�.
		item = new Item("it01", "����", 100000);
		return item;
	}
	@Override
	public ArrayList<Item> select() throws Exception {
		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item("it01", "����", 100000));
		list.add(new Item("it02", "��", 100000));
		list.add(new Item("it03", "����", 100000));
		list.add(new Item("it04", "�Ź�", 100000));
		
				
		return list;
	}
		
}
