package app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
 
import javax.swing.JOptionPane;
 
public class OrderApp {
 
    Db<Integer, Food> foodDb;
    User user;
 
    Frame frame;
    Panel p1, p2, p3;
    Panel sp1,sp2;
    Label info1, info2, info3, sum;
    List list1, list2;
    Button order;
    int total;
    ArrayList<Food> flist;
    ArrayList<Food> slist;
 
    public OrderApp() {
        foodDb = new FoodDb("192.168.0.31", "db", "db");
        this.user = null;
        makeUi();
        eventProcess();
    }
 
    public OrderApp(User user) {
        foodDb = new FoodDb("192.168.0.31", "db", "db");
        this.user = user;
        makeUi();
        eventProcess();
    }
 
    public void makeUi() {
 
        frame = new Frame("Order Frame");
        flist = new ArrayList<Food>();
        slist = new ArrayList<Food>();
 
        if(user==null) {
            info1 = new Label("User name");
        }
        else {
            info1 = new Label("User: "+user.getName());
        }
        
        info2 = new Label("주문 할 음식을 선택해 주세요.");
        setFont(info1);
        setFont(info2);
        p1 = new Panel();
        p1.setLayout(new GridLayout(2, 1));
        p1.add(info1);
        p1.add(info2);
 
        info3 = new Label("선택한 음식");
        setFont(info3);
 
        list1 = new List();
        list1.setBackground(new Color(0xBEF8FF));
        list2 = new List();
        list2.setBackground(new Color(0xFBFFBE));
        setFont(list1);
        setFont(list2);
 
        selectFood();
 
        p2 = new Panel();
        p2.setLayout(new BorderLayout(10,10));
 
        sp1 = new Panel(new BorderLayout());
        sp1.add(list1,"Center");
        sp2 = new Panel(new BorderLayout());
        sp2.add(info3, "North");
        sp2.add(list2, "South");
        p2.add(sp1,"Center");
        p2.add(sp2,"South");
        
        sum = new Label();
        order = new Button("주문하기");
        setLabel();
        setFont(sum);
        setFont(order);
        p3 = new Panel();
        p3.setLayout(new GridLayout(2, 1));
        p3.add(sum);
        p3.add(order);
 
        frame.setLayout(new BorderLayout(10, 10));
        frame.add(p1, "North");
        frame.add(p2, "Center");
        frame.add(p3, "South");
 
        frame.setSize(500, 700);
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
        frame.setVisible(true);
 
    }
 
    public void eventProcess() {
        list1.addItemListener(new ItemListener() {
 
            @Override
            public void itemStateChanged(ItemEvent e) {
                Food f = flist.get(list1.getSelectedIndex());
                list2.add(f.getName() + "     " + f.getPrice());
                slist.add(f);
                total += f.getPrice();
                setLabel();
            }
        });
        list2.addItemListener(new ItemListener() {
 
            @Override
            public void itemStateChanged(ItemEvent e) {
                int index = list2.getSelectedIndex();
                list2.removeAll();
                Food f = slist.get(index);
                total -= f.getPrice();
                slist.remove(index);
                setLabel();
                selectFoodRefresh();
            }
        });
        order.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                addOrderCount();
                int result = JOptionPane.showConfirmDialog(null, "주문완료. 더 주문하시겠습니까?",
                                                        "확인",JOptionPane.YES_NO_OPTION);
                if(result==JOptionPane.CLOSED_OPTION) {
                    System.exit(0);
                }else if(result==JOptionPane.YES_OPTION) {
                    slist = new ArrayList<Food>();
                    list2.removeAll();
                    selectFoodRefresh();
                    selectFood();
                    total=0;
                    setLabel();
                }else {
                    System.exit(0);
                }
            }
        });
    }
 
    //폰트, 글자크기변경
    public void setFont(Component c) {
        c.setFont(new Font("견고딕", Font.PLAIN, 20));
    }
 
    public void setLabel() {
        sum.setText("합계: \t" + total + " 원");
    }
 
    public void setLabel(String s) {
        sum.setText("합계: \t" + s);
    }
 
    public void selectFood() {
        flist = null;
        list1.removeAll();
        try {
            flist = foodDb.select();
            for (Food f : flist) {
                list1.add(f.getName() + "     " + f.getPrice() + "     " + f.getSales());
            }
        } catch (Exception e) {
            setLabel("Food Search Failed");
        }
    }
 
    public void selectFoodRefresh() {
        for (Food f : slist) {
            list2.add(f.getName() + "     " + f.getPrice());
        }
    }
 
    public void addOrderCount(){
        try {
            for(Food f:slist) {
                f.setSales(f.getSales()+1);
                foodDb.update(f);
            }
        }catch(Exception e) {
            
        }
    }
    //layout setting을 위해 만든 함수
    public void gLayoutInsert(GridBagLayout g, Component c, int x, int y, int w, int h){
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill= GridBagConstraints.BOTH;
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        g.setConstraints(c,gbc);
        p2.add(c);    
    }
    public static void main(String[] args) {
        OrderApp order = new OrderApp();

    }
 
}