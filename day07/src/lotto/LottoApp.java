package lotto;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class LottoApp {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LottoGame lg = new LottoGame();
        while (true) {
            System.out.println("----------LOTTO GAME----------");
            System.out.println("�� �������� �ϽǰŸ� 'A'�� �Է����ּ���.");
            System.out.println("�� �ڵ����� �ϽǰŸ� 'B'�� �Է����ּ���.");
            System.out.println("�� �����Ͻ÷��� 'Q'�� �Է����ּ���.");
            System.out.print("�� ");
            
            String input = sc.nextLine();
            
            int[] user = new int[6];
            
            if (input.equals("Q"))
                break;
            else if (input.equals("A")) {
                // ���� ��ȣ �߱�
                while(true) {
                    System.out.println("������ȣ�� �߱� �����ø� (Y)��");
                    System.out.println("���� �޴��� ���ư��÷��� (N)�� �����ּ���");
                    input = sc.nextLine();
 
                    if (!lg.returnMenu(input)) {
                        break;
                    } 
                    System.out.println("��[1, 45] ������ ���ڸ� �ߺ� ���� �Է��Ͻÿ�.");
                    for(int i=0;i<6;i++) {
                        System.out.printf("%d�� ° ���ڸ� �Է��Ͻÿ�. %n", i + 1);
                        input = sc.nextLine();
                        user[i] = lg.manual(input, user, i);
                        
                        if(user[i]==-1) {
                            System.out.println("������ �´� ���ڰ� �ƴմϴ�.");
                            i--;
                        } else if(user[i]==-2) {
                            System.out.println("���ǿ� �°� �Է����ּ���.");
                            i--;
                        } else if(user[i]==-3) {
                            System.out.println("�ߺ��� �����Դϴ�.");
                            i--;
                        }
                    }
                    System.out.println(Arrays.toString(user));
                    System.out.println("�� �ش� ���ڷ� �Ͻðڽ��ϱ�?(Y/N)");
                    input = sc.nextLine();
                    if(!lg.checkChoice(input)) {
                        continue;
                    }
                    int matchNum = lg.matchNum(user);
                    long reward = lg.reward(matchNum);
                    System.out.println("��÷ ��ȣ " + Arrays.toString(lg.luckyNum));
                    System.out.println("��÷ ���� : " + matchNum + "��");
                    System.out.println("��÷�� : " + reward);
                }
 
            } else if (input.equals("B")) {
                // �ڵ� ��ȣ �߱�
 
                while(true) {
                    System.out.println("�ڵ���ȣ�� �߱� �����ø� (Y)��");
                    System.out.println("���� �޴��� ���ư��÷��� (N)�� �����ּ���");
                    input = sc.nextLine();
 
                    if (!lg.returnMenu(input)) {
                        break;
                    } 
                    
                    user = lg.random();
 
                    System.out.println(Arrays.toString(user));
                    System.out.println("�� �ش� ���ڷ� �Ͻðڽ��ϱ�?(Y/N)");
                    input = sc.nextLine();
                    if(!lg.checkChoice(input)) {
                        continue;
                    }
                    int matchNum = lg.matchNum(user);
                    long reward = lg.reward(matchNum);
                    System.out.println("��÷ ��ȣ " + Arrays.toString(lg.luckyNum));
                    System.out.println("��÷ ���� : " + matchNum + "��");
                    System.out.println("��÷�� : " + reward);
                    
                }
 
            } else {
                System.out.println("�� ERROR! �߸��� �Է��Դϴ�. ��");
        
                continue;
            }
            System.out.println(lg.play + "�� �߽��ϴ�.");
            System.out.println(lg.win + "�� ��÷�Ǿ����ϴ�.");
            System.out.println("���� ��÷�ݾ�: " + String.format("%,d", lg.total) + "��");
            // .format �޼ҵ�� ū���ڸ� 1000������ ���� ���� �ϱ����� ����߽��ϴ�.
            System.out.println();
 
            // �� ��� �ݾ�
        }
        System.out.println("���� ����");
        sc.close();
    }
 
}