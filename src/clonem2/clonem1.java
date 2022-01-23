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
		
//		//테스트용 1
//			System.out.println("hello. wolrd");
//			System.out.println("안녕하세요?");
//			System.out.printf("%d는 %d입니다.%n", 8, 5);
//			
//			int i = 0;
//			for(i=1; i<=5; i++) {
//				System.out.println("1");
//			}
			
		// 예제 4-9 연습 
		
//		for(int i=1;i<=5;i++)
//			System.out.println(i);
//		
//		for(int i=1;i<=5;i++)
//			System.out.print(i);
//		

		// 예제 4-10 연습
		
//		int sum = 0;
//		
//		for(int i=1; i<=5; i++) {
//			sum += i ;
//			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
//		}

		// 연습
//	int sum = 1;
//		
//		for(int i=1; i<=5; i++) {
//			sum *= i ;
//			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
//		}
//		
//	float sum1 = 1;
//		
//		for(float i=1; i<=5; i++) {
//			sum1 /= i ;
//			System.out.printf("1부터 %2f 까지의 나눈 값 : %2f%n", i, sum1);
//		}
//		
//		// 와일 랜덤 로또숫자 뽑기  double을 int로 바꾸면됌
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

		//윗것과 동일
		
//		for (int i=1; i<=5; i++) {
//			System.out.println("**********");
//		}
		
		// 윗것과 동일 
//			for(int i=1; i<=5; i++) {
//				for (int j=1; j<=10; j++) {   // 이 줄 먼저 10개 출력 후 밑으로
//					System.out.print("*");
//				}
//			System.out.println();  // 다시 처음으로 올라가서 출력 시작
//			}
	
		// 예제 4=11
		
//		for (int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}	
		
		//예제 4-12 연습
		
//		int i = 1;
//		while(i < 5) {
//		System.out.println(i);
//		i++;
//		}
		
//		int i = 0;
//			while (i++ != 5) {
//				System.out.println(i + " - i can do it");
//			}

		// 예제 4-13 연습
		
//		int sum = 0;
//		int i = 0;
//		// sum에 i를 계속해서 더해간다.
//		while (sum <=100) {
//			System.out.printf("%d - %d%n", i, sum);
//			sum += ++i;
//		}
	
//		int num = 0, sum = 0;
//		System.out.print("숫자를 입력하여 주세요.(예:12345)>");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		while(num!=0) {
//			// num을 10으로 나눈 값의 나머지를 sum에 더한다.
//			sum += num%10;
//			System.out.printf("sum = %3d num = %d%n", sum, num);
//			num /= 10;	// 10으로 나누고 나머지값을 다시 위로 올리기 while은 반복문이므로 다시시작임 false 나올때까지
//		}
//		System.out.println("각 자리의 나머지 합" + sum);

		//do while 문 4-15  //스무고개 숫자마추기 게임
		
//		int input = 0, answer = 0;
//		
//		answer = (int)(Math.random() * 100) + 1;
//		Scanner scanner = new Scanner(System.in);
//		
//		do {
//			System.out.print("100과 0사이의 정수를 입력하세요.>");
//			input = scanner.nextInt();
//			
//			if (input > answer) {
//				System.out.println("더 작은 정수를 입력하세요.");
//			} else if (input < answer) {
//				System.out.println("더 큰 정수를 입력하세요.");
//			}
//		} while (input != answer);
//			System.out.println("정답입니다.");
//		
//			
//	
		
		// break 문 예제 4-16
		
//		int sum = 0, i = 0;
//		while(true) {
//			if(sum > 100)
//				break;
//			sum += ++i;
//		} 
//		System.out.println("i=" +i );
//		System.out.println("sum = " +sum);
//		System.out.printf("%d 까지 더하면 100을 안넘습니다. %n 1부터 %d까지 더한값은 %d 입니다.", --i, i, (sum-i-1) ); 
//		// 내가 추가한 문장

		// continue문 4-17 예제
		
//		for(int i=0;i<=10; i++) {
//			if (i%3==0)
//				continue;
//			System.out.println(i);
//		}		// continue 는 계속하다. 해당 문자를 실행시키지 않고 다시 실행한다.
//	
		
		// 예제 4-18번
	
//		int menu = 0;
//		int num = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		while(true) {	
//			System.out.println("(1) square");
//			System.out.println("(2) square root");
//			System.out.println("(1) log");
//			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
//			
//			String tmp = scanner.nextLine();
//			menu = Integer.parseInt(tmp);
//			
//			if (menu==0) {
//				System.out.println("메뉴를 종료합니다.");
//				break;
//			} else if (!(1<= menu && menu <= 3)) {
//			System.out.println("잘못된 숫자를 입력하셨습니다.(종료는 0입니다)");
//			continue;
//			}
//			
//			System.out.println("선택하신 메뉴를 " + menu + " 번 입니다.");
//		}	
//	} // 끝
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
//			} System.out.println(); // break이 끝나는 시점
//		}  // Loop1이 끝나는 시점 
		
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
//			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
//			
//			String tmp = scanner.nextLine();
//			menu = Integer.parseInt(tmp);
//			
//			if (menu==0) {
//				System.out.println("메뉴를 종료합니다.");
//				break;
//			} else if (!(1<= menu && menu <= 3)) {
//			System.out.println("잘못된 숫자를 입력하셨습니다.(종료는 0입니다)");
//			continue;
//			}
//			
//			for(;;) {
//				System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99>");
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
//			} 	//for문의 끝
//		}	//while문의 끝
//	}	//main의 끝
//}
//		

		//		int x=1, sum=0;
//			for(x=1; x<=10; x++) {
//				System.out.println(x);
//			sum = x+sum; // x값을 sum에 저장 후 x에 계속 더한다. ex) 1+ (1+2) + (1+2+3) ~~~
//			}
//			System.out.println("1부터 10까지의 합은"+sum+"입니다."); // 연습문제 푼거

//		int sum = 0;
//			
//			for (int i=1; i<=100; i++) {
//				sum += i;
//					if (i%2==0) {
//						sum = -(i*2);			
//				}
//			} System.out.printf("i는 %d입니다.", sum);
		
//		int sum = 1;
//		int i = 1;				
//		
//		while (true) {
//			if (sum %2 ==0)
//				continue;
//			sum += i;
//		} System.out.print(sum);
	
		
		//연습문제 4-3
//		int sum = 0;
//		int num = 0;
//		
//		while (true) {
//			++num;
//				if (num%2==0)
//					sum -= num;   // sum = sum - num(num은 짝수만 됌)
//				else 
//					sum += num;
//				if (sum >= 100)
//					break;
//		}	System.out.println(num);
//		
	}	 
}
