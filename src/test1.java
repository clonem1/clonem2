import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.Scanner;

public class test1 {

	// ������� ���ֽ� ������ 
	
	public static void main(String[] args) {

		System.out.print("���ڸ� �Է��ϼ���.>");		
		Scanner scanner = new Scanner(System.in);
//		A = scanner.nextInt();
		
		int [] B = new int[5];
		
		for (int i=0; i<B.length; i++) {   // �� 5�� ��
			
			B[i] = scanner.nextInt();
			
			System.out.println(B[i]);
		}
	}

}