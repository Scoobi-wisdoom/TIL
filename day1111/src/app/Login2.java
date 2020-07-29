package app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Login2 {
	
	Frame frame;
	TextField txtid,txtpwd;
	Label label;
	Button btnlogin;
	Button btnsignup;
	Db<String, User> userDb;
	
	public Login2() {
//		USERS db연동 필요
//		UserDb userDb = new UserDb("192.168.0.31", "db", "db");
		userDb = new UserDb("192.168.0.31", "db", "db");
		makeUi();
	}
	
	public void makeUi() {
		frame = new Frame("Login");
		txtid = new TextField();
		txtpwd = new TextField();
		btnlogin = new Button("로그인");
		btnsignup = new Button("회원 가입");
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
	
	// 로그인 (코드 복붙 함)
	public void login() {
		String tid = txtid.getText().trim();
		String tpwd = txtpwd.getText().trim();
		
		// 입력 받은 ID를 이용하여 사용자 정보를 조회한다.
		User dbuser = null;
		try {
			// 사용자가 존재하면 입력받은 PWD와 조회된 PWD를 비교한다.
			dbuser = userDb.select(tid);
			if(tpwd.equals(dbuser.getPwd())) {
				// PWD가 같으면 로그인 성공
				System.out.println("Success");
				// 로그인 frame 닫기
				frame.setVisible(false);
				
				// App 또는 App2에 로그인 정보 넘겨주기
				// App은 user ui, App2는 admin ui
				// admin id는 id01, pwd는 pwd01이라고 가정
				if(tid.equals("id01") && tpwd.equals("pwd01")) {
					
					App2 app = new App2(userDb);
				} else {
//				App app = new App(userDb);
				}
			} else {
				// PWD가 다르면 로그인 실패
				label.setText("Invalid PWD .. !!");
			}
		} catch (Exception e) {
			// 사용자가 없으면 로그인 실패.
			label.setText("Invalid ID .. !!");
		}
	}
	// 회원가입
	// 회원가입 UI를 구현하는 Member class에 넘겨준다.
	public void signup() {
		Member member = new Member();
	}
	
	public static void main(String args[]) {
		Login2 login = new Login2();
	}

}
