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
		
		// 입력 받은 ID를 이용하여 사용자 정보를 조회한다.
		User dbuser = null;
		try {
			// 사용자가 존재하면 입력받은 PWD와 조회된 PWD를 비교한다.
			dbuser = userDb.select(tid);
			if(tpwd.equals(dbuser.getPwd())) {
				// PWD가 같으면 로그인 성공
				frame.setVisible(false);
				App app = new App(userDb);
			} else {
				// PWD가 다르면 로그인 실패
				label.setText("Invalid PWD .. !!");
			}
		} catch (Exception e) {
			// 사용자가 없으면 로그인 실패.
			label.setText("Invalid ID .. !!");
		}
		// 로그인 후 보일 화면을 띄운다.
		
	}
	
	public static void main(String args[]) {
		Login login = new Login();
		
	}

}
