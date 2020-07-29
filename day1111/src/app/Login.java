package app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
 
public class Login {
 
    Frame frame;
    TextField txtid, txtpwd;
    Label label;
    Button btnlogin;
    Button btnsignup;
    Db<String, User> userDb;
 
    public Login() {
//         USERS db���� �ʿ�
        userDb = new UserDb("192.168.0.31", "db", "db");
        makeUi();
    }
 
    public void makeUi() {
        frame = new Frame("Login");
        txtid = new TextField(10);
        txtpwd = new TextField(10);
        btnlogin = new Button("�α���");
        btnsignup = new Button("ȸ�� ����");
        label = new Label();
 
        setFont(txtid);
        setFont(txtpwd);
        setFont(btnlogin);
        setFont(btnsignup);
        setFont(label);
 
        frame.setLayout(new GridLayout(5, 1));
        frame.add(txtid);
        frame.add(txtpwd);
        frame.add(btnlogin);
        frame.add(btnsignup);
        frame.add(label);
 
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
            if (dbuser.getPwd().equals(tpwd)) {
                // PWD�� ������ �α��� ����
 
                // �α��� frame �ݱ�
                frame.setVisible(false);
                label.setText("Success .. !!");
                // App�� �α��� ���� �Ѱ��ֱ�
                new OrderApp(dbuser);
            } else {
                // PWD�� �ٸ��� �α��� ����
                label.setText("Invalid PWD .. !!");
            }
        } catch (Exception e) {
            // ����ڰ� ������ �α��� ����.
            label.setText("Invalid ID .. !!");
            e.printStackTrace();
        }
    }
 
    // ȸ������
    // ȸ������ UI�� �����ϴ� Member class�� �Ѱ��ش�.
    public void signup() {
        new Member(userDb);
    }
 
    // ��Ʈ, ����ũ�⺯��
    public void setFont(Component c) {
        c.setFont(new Font("�߰��", Font.PLAIN, 15));
    }
 
    public static void main(String args[]) {
        new Login();
    }
 
}