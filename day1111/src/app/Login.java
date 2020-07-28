package app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Login {
	
	Frame frame;
	TextField txtid,txtpwd;
	Label label;
	Button btnlogin;
	Button btnsignup;
	Db<String, User> userDb;
	
	public Login() {
//		 USERS db���� �ʿ�
//		UserDb userDb = new UserDb("192.168.0.31", "db", "db");
		userDb = new UserDb("192.168.0.31", "db", "db");
		makeUi();
	}
	
	public void makeUi() {
		frame = new Frame("Login");
		txtid = new TextField();
		txtpwd = new TextField();
		btnlogin = new Button("�α���");
		btnsignup = new Button("ȸ�� ����");
		label = new Label();
		
		
		frame.setLayout(new GridLayout(5,1));
		frame.add(txtid); frame.add(txtpwd); frame.add(btnlogin);
		frame.add(btnsignup); frame.add(label);

		// window closing 
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
		
		btnlogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				login();
				
			}
		});
		
		btnsignup.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				signup();
				
			}
		});
	
		
	}
	
	// �α��� (�ڵ� ���� ��)
	public void login() {
		String tid = txtid.getText().trim();
		String tpwd = txtpwd.getText().trim();
		
		// �Է� ���� ID�� �̿��Ͽ� ����� ������ ��ȸ�Ѵ�.
		User dbuser = null;
		try {
			// ����ڰ� �����ϸ� �Է¹��� PWD�� ��ȸ�� PWD�� ���Ѵ�.
			dbuser = userDb.select(tid);
			if(tpwd.equals(dbuser.getPwd())) {
				// PWD�� ������ �α��� ����
				System.out.println("Success");
				// �α��� frame �ݱ�
				frame.setVisible(false);
				
				// App�� �α��� ���� �Ѱ��ֱ�
//				App app = new App(userDb);
			} else {
				// PWD�� �ٸ��� �α��� ����
				label.setText("Invalid PWD .. !!");
			}
		} catch (Exception e) {
			// ����ڰ� ������ �α��� ����.
			label.setText("Invalid ID .. !!");
		}
	}
	// ȸ������
	// ȸ������ UI�� �����ϴ� Member class�� �Ѱ��ش�.
	public void signup() {
		Member member = new Member();
	}
	
	public static void main(String args[]) {
		Login login = new Login();
	}

}
