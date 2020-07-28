package app;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import com.biz.UserDb;
import com.frame.Db;
import com.vo.User;

public class Login {
	Frame frame;
	TextField id,pwd;
	Button bt;
	Label label;
	Db<String, User> userDb;
	
	public Login() {
		userDb = new UserDb("127.0.0.1", "db", "db");
		makeUi();
		
	}
	
	public void makeUi() {
		frame = new Frame("Login");
		id = new TextField();
		pwd = new TextField();
		bt = new Button("Login");
		label = new Label();
		
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				login();
				
			}
		});
		
		frame.setLayout(new GridLayout(4,1));
		frame.add(id); frame.add(pwd); frame.add(bt);
		frame.add(label);
		
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
				System.exit(0);
				
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
		frame.setLocation(300, 300);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
	
	public void login() {
		String tid = id.getText().trim();
		String tpwd = pwd.getText().trim();
		
		// �Է� ���� ID�� �̿��Ͽ� ����� ������ ��ȸ�Ѵ�.
		User dbuser = null;
		try {
			// ����ڰ� �����ϸ� �Է¹��� PWD�� ��ȸ�� PWD�� ���Ѵ�.
			dbuser = userDb.select(tid);
			if(tpwd.equals(dbuser.getPwd())) {
				// PWD�� ������ �α��� ����
				frame.setVisible(false);
				App app = new App(userDb);
			} else {
				// PWD�� �ٸ��� �α��� ����
				label.setText("Invalid PWD .. !!");
			}
		} catch (Exception e) {
			// ����ڰ� ������ �α��� ����.
			label.setText("Invalid ID .. !!");
		}
		// �α��� �� ���� ȭ���� ����.
		
	}
	
	public static void main(String args[]) {
		Login login = new Login();
		
	}

}
