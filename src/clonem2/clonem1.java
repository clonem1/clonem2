package clonem2;

import java.util.*;
import java.util.Arrays;
import java.awt.print.Printable;
import java.security.PublicKey;
import java.text.BreakIterator;
import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class clonem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//�׽�Ʈ�� 1
//			System.out.println("hello. wolrd");
//			System.out.println("�ȳ��ϼ���?");
//			System.out.printf("%d�� %d�Դϴ�.%n", 8, 5);
//			
//			int i = 0;
//			for(i=1; i<=5; i++) {
//				System.out.println("1");
//			}
			
		// ���� 4-9 ���� 
		
//		for(int i=1;i<=5;i++)
//			System.out.println(i);
//		
//		for(int i=1;i<=5;i++)
//			System.out.print(i);
//		

		// ���� 4-10 ����
		
//		int sum = 0;
//		
//		for(int i=1; i<=5; i++) {
//			sum += i ;
//			System.out.printf("1���� %2d ������ ��: %2d%n", i, sum);
//		}

		// ����
//	int sum = 1;
//		
//		for(int i=1; i<=5; i++) {
//			sum *= i ;
//			System.out.printf("1���� %2d ������ ��: %2d%n", i, sum);
//		}
//		
//	float sum1 = 1;
//		
//		for(float i=1; i<=5; i++) {
//			sum1 /= i ;
//			System.out.printf("1���� %2f ������ ���� �� : %2f%n", i, sum1);
//		}
//		
//		// ���� ���� �ζǼ��� �̱�  double�� int�� �ٲٸ��
//		
//		double lotto = 0;
//		
//		for (double i=1; i<=6; i++) {
//			lotto =(double) (Math.random() * 45) + 1);
//			System.out.println(lotto);
//		}
		
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		
//		System.out.println();

		//���Ͱ� ����
		
//		for (int i=1; i<=5; i++) {
//			System.out.println("**********");
//		}
		
		// ���Ͱ� ���� 
//			for(int i=1; i<=5; i++) {
//				for (int j=1; j<=10; j++) {   // �� �� ���� 10�� ��� �� ������
//					System.out.print("*");
//				}
//			System.out.println();  // �ٽ� ó������ �ö󰡼� ��� ����
//			}
	
		// ���� 4=11
		
//		for (int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}	
		
		//���� 4-12 ����
		
//		int i = 1;
//		while(i < 5) {
//		System.out.println(i);
//		i++;
//		}
		
//		int i = 0;
//			while (i++ != 5) {
//				System.out.println(i + " - i can do it");
//			}

		// ���� 4-13 ����
		
//		int sum = 0;
//		int i = 0;
//		// sum�� i�� ����ؼ� ���ذ���.
//		while (sum <=100) {
//			System.out.printf("%d - %d%n", i, sum);
//			sum += ++i;
//		}
	
//		int num = 0, sum = 0;
//		System.out.print("���ڸ� �Է��Ͽ� �ּ���.(��:12345)>");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		while(num!=0) {
//			// num�� 10���� ���� ���� �������� sum�� ���Ѵ�.
//			sum += num%10;
//			System.out.printf("sum = %3d num = %d%n", sum, num);
//			num /= 10;	// 10���� ������ ���������� �ٽ� ���� �ø��� while�� �ݺ����̹Ƿ� �ٽý����� false ���ö�����
//		}
//		System.out.println("�� �ڸ��� ������ ��" + sum);

		//do while �� 4-15  //������ ���ڸ��߱� ����
		
//		int input = 0, answer = 0;
//		
//		answer = (int)(Math.random() * 100) + 1;
//		Scanner scanner = new Scanner(System.in);
//		
//		do {
//			System.out.print("100�� 0������ ������ �Է��ϼ���.>");
//			input = scanner.nextInt();
//			
//			if (input > answer) {
//				System.out.println("�� ���� ������ �Է��ϼ���.");
//			} else if (input < answer) {
//				System.out.println("�� ū ������ �Է��ϼ���.");
//			}
//		} while (input != answer);
//			System.out.println("�����Դϴ�.");
//		
//			
//	
		
		// break �� ���� 4-16
		
//		int sum = 0, i = 0;
//		while(true) {
//			if(sum > 100)
//				break;
//			sum += ++i;
//		} 
//		System.out.println("i=" +i );
//		System.out.println("sum = " +sum);
//		System.out.printf("%d ���� ���ϸ� 100�� �ȳѽ��ϴ�. %n 1���� %d���� ���Ѱ��� %d �Դϴ�.", --i, i, (sum-i-1) ); 
//		// ���� �߰��� ����

		// continue�� 4-17 ����
		
//		for(int i=0;i<=10; i++) {
//			if (i%3==0)
//				continue;
//			System.out.println(i);
//		}		// continue �� ����ϴ�. �ش� ���ڸ� �����Ű�� �ʰ� �ٽ� �����Ѵ�.
//	
		
		// ���� 4-18��
	
//		int menu = 0;
//		int num = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		while(true) {	
//			System.out.println("(1) square");
//			System.out.println("(2) square root");
//			System.out.println("(1) log");
//			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)>");
//			
//			String tmp = scanner.nextLine();
//			menu = Integer.parseInt(tmp);
//			
//			if (menu==0) {
//				System.out.println("�޴��� �����մϴ�.");
//				break;
//			} else if (!(1<= menu && menu <= 3)) {
//			System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.(����� 0�Դϴ�)");
//			continue;
//			}
//			
//			System.out.println("�����Ͻ� �޴��� " + menu + " �� �Դϴ�.");
//		}	
//	} // ��
//}

		// 4-19
//		Loop1 : for(int i=2; i<=9; i++) {
//			for (int j=1; j<= 9; j++) {
//				if(j==5)
//					break Loop1;
////				break;
////				continue Loop1;
////				continue;
//				
//				System.out.println(i + "*" + j + "=" + i*j);
//			} System.out.println(); // break�� ������ ����
//		}  // Loop1�� ������ ���� 
		
		// 4 - 20
		
//		int menu = 0;
//		int num = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		outer:
//		while(true) {	
//			System.out.println("(1) square");
//			System.out.println("(2) square root");
//			System.out.println("(1) log");
//			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)>");
//			
//			String tmp = scanner.nextLine();
//			menu = Integer.parseInt(tmp);
//			
//			if (menu==0) {
//				System.out.println("�޴��� �����մϴ�.");
//				break;
//			} else if (!(1<= menu && menu <= 3)) {
//			System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.(����� 0�Դϴ�)");
//			continue;
//			}
//			
//			for(;;) {
//				System.out.print("����� ���� �Է��ϼ���.(��� ����:0, ��ü ����:99>");
//				tmp = scanner.nextLine();
//				num = Integer.parseInt(tmp);
//				
//				if (num == 0)
//				break;
//				
//				if (num == 99)
//					break outer;
//				
//				switch (menu) {
//				case 1:
//					System.out.println("result=" + num*num);
//					break;
//				case 2:
//					System.out.println("result=" + Math.sqrt(num));
//					break;
//				case 3:
//					System.out.println("result=" + Math.log(num));
//					break;
//				}
//			} 	//for���� ��
//		}	//while���� ��
//	}	//main�� ��
//}
//		

		//		int x=1, sum=0;
//			for(x=1; x<=10; x++) {
//				System.out.println(x);
//			sum = x+sum; // x���� sum�� ���� �� x�� ��� ���Ѵ�. ex) 1+ (1+2) + (1+2+3) ~~~
//			}
//			System.out.println("1���� 10������ ����"+sum+"�Դϴ�."); // �������� Ǭ��

//		int sum = 0;
//			
//			for (int i=1; i<=100; i++) {
//				sum += i;
//					if (i%2==0) {
//						sum = -(i*2);			
//				}
//			} System.out.printf("i�� %d�Դϴ�.", sum);
		
//		int sum = 1;
//		int i = 1;				
//		
//		while (true) {
//			if (sum %2 ==0)
//				continue;
//			sum += i;
//		} System.out.print(sum);
	
		
		//�������� 4-3
//		int sum = 0;
//		int num = 0;
//		
//		while (true) {
//			++num;
//				if (num%2==0)
//					sum -= num;   // sum = sum - num(num�� ¦���� ��)
//				else 
//					sum += num;
//				if (sum >= 100)
//					break;
//		}	System.out.println(num);
//		
	}	 
}
