package app;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import com.biz.UserDb;
import com.frame.Db;
import com.vo.User;

public class App {

	Frame frame;
	Panel p1, p2, p3, sp1, sp2;
	Button b1, b2;
	TextField tf1, tf2, tf3;
	List list;
	Label label;

	TextField utf1, utf2, utf3;
	Button upbt;

	Db<String, User> userDb;
	ArrayList<User> ulist;

	public App() {}

	public App(Db<String, User> userDb) {
		this.userDb = userDb;
		makeUi();
		eventProcess();
	}

	public void makeUi() {
		frame = new Frame("My Frame");
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();

		tf1 = new TextField(10);
		tf2 = new TextField(10);
		tf3 = new TextField(10);

		b1 = new Button("ADD");
		b2 = new Button("SEARCH");

		label = new Label("Status: ");
		p3.setLayout(new BorderLayout());
		p3.add(label);

		sp1 = new Panel();
		sp1.setBackground(Color.white);
		sp2 = new Panel();
		sp2.setBackground(Color.gray);

		utf1 = new TextField();
		utf2 = new TextField();
		utf3 = new TextField();
		upbt = new Button("UPDATE");
		sp2.setLayout(new GridLayout(4, 1));
		sp2.add(utf1);
		sp2.add(utf2);
		sp2.add(utf3);
		sp2.add(upbt);

		p1.add(tf1);
		p1.add(tf2);
		p1.add(tf3);
		p1.add(b1);
		p1.add(b2);

		list = new List();
		list.setBackground(Color.yellow);
		sp1.setLayout(new BorderLayout());
		sp1.add(list);

		p2.setLayout(new GridLayout(1, 2));
		p2.add(sp1);
		p2.add(sp2);

		p1.setBackground(Color.red);
		p2.setBackground(Color.blue);
		p3.setBackground(Color.cyan);
		frame.add(p1, "North");
		frame.add(p2, "Center");
		frame.add(p3, "South");

		frame.setSize(500, 600);
		frame.setLocation(300, 200);
		frame.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				frame.setVisible(false);
				System.exit(0); // 현재 동작 프로그램 종료

			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});
		frame.setVisible(true);
	}

	public void eventProcess() {
		upbt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				updateUser();

			}
		});

		list.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				int index = list.getSelectedIndex();
				User user = ulist.get(index);
				utf1.setText(user.getId());
				utf2.setText(user.getPwd());
				utf3.setText(user.getName());
			}
		});
		;
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				insertUser();
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				selectUser();

			}
		});
	}

	public void setLabel(String str) {
		label.setText("Status: " + str);
	}

	public void updateUser() {
		String id = utf1.getText();
		String pwd = utf2.getText();
		String name = utf3.getText();
		User user = new User(id, pwd, name);
		try {
			userDb.update(user);
			selectUser();
			setLabel("User Updated !");
		} catch (Exception e) {
			setLabel("User Updated Fail !");
		}
	}

	public void insertUser() {
		String id = tf1.getText();
		String pwd = tf2.getText();
		String name = tf3.getText();
		User user = new User(id, pwd, name);
		try {
			userDb.insert(user);
			selectUser();
			setLabel("User Inserted !!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			setLabel("User Insert Fail !!");
		}
	}

	public void selectUser() {
		try {
			ulist = userDb.select();
			list.removeAll();
			for (User u : ulist) {
				list.add(u.getId() + " " + u.getName());
			}
			setLabel("Search Completed !!");
		} catch (Exception e) {
			setLabel("Search Fail !!");
		}

	}

//	public static void main(String[] args) {
//		App app = new App();
//	}

}
