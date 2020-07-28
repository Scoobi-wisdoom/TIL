package app;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
 
public class Member {
 
    Frame frame;
    TextField id,pwd,name;
    Button bt1,bt2,bt3,bt4;
    Label label;
    Panel p1,p2,p3,p4,p5
          ,sp1,sp2,sp3;
    
    Db<String,User> userDb;
 
    
    public Member() {
        userDb = new UserDb("192.168.0.31","db","db");
        makeUi();
    }
    
    
    public void makeUi() {
        frame = new Frame("Member");
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();
        p5 = new Panel();
        sp1 = new Panel();
        sp2 = new Panel();
        sp3 = new Panel();
        id = new TextField(10);
        pwd = new TextField(10);
        name = new TextField(10);
        bt1 = new Button("ID");
        bt2 = new Button("PW");
        bt3 = new Button("이름");
        bt4 = new Button("회원가입");
        label = new Label("  정보입력 후 가입 버튼을 눌러주세요");
        
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
        // p1  좌측 id pwd name 버튼
        p1.setLayout(new GridLayout(2, 1));
        sp1.setLayout(new GridLayout(3, 1));
        p1.setBackground(Color.yellow);
        p1.add(sp1);
        sp1.add(bt1);sp1.add(bt2);sp1.add(bt3);
        
        // p2=배경 노란화면 - 안에 sp2(텍스트라인), sp3(Label) 들어있음
        p2.setLayout(new GridLayout(2,1));
        p2.add(sp2);p2.add(sp3);
        sp2.setLayout(new GridLayout(3,1));
        sp2.add(id);sp2.add(pwd);sp2.add(name);
        
        sp3.setLayout(new BorderLayout());
        sp3.add(label);
        
        // 하단 회원가입 버튼
        p3.add(bt4);
        
        p2.setBackground(Color.yellow);
        p3.setBackground(Color.white);
        
        
        frame.add(p1, "West");
        frame.add(p2);
        frame.add(p3,"South");
        
        frame.setSize(300, 200);
        frame.setLocation(300,200);
        frame.setVisible(true);
    
        
        
        bt4.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            member();
                
            }
        });
    
    
    }
    public void setLabel(String str) {
        label.setText("STATUS: " + str);
    }
    
    public void member() {
        String tid = id.getText().trim();
        String tpwd = pwd.getText().trim();
        String name = pwd.getText().trim();
        User user = new User(tid, tpwd, name);
        try { 
        userDb.insert(user);
        setLabel ("회원가입 되었습니다.");
        frame.setVisible(false);
        }catch (Exception e) {
        setLabel ("이미 가입된 ID가 있습니다.");
        }
        
    }
    
    public static void main(String[] args) {
        Member member = new Member();
    }
    
}
