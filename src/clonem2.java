//import java.beans.DefaultPersistenceDelegate;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.element.NestingKind;

public class clonem2 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		
		// Chapter 5 �迭 ����.
		
//		int[] clonem1 = new int[5] ;
//			for (int i=0; i< clonem1.length; i++)
//				clonem1[i] = i * 5 + 5;	
//			System.out.print(clonem1[1]);

//		int[] iArr = {1, 2 ,3 ,4, 5};
//			for(int i=0; i < iArr.length; i++) {
//				System.out.println(iArr[i]);
//			}

//		int[] iArr = { 100, 200, 300, 400, 500};
//
//		for (int i=0; i < iArr.length; i++) {
//			System.out.print(iArr[i] + ",");
//		} 
//			System.out.println();
//			System.out.println("�迭�� ���� �Դϴ�.");

//		int[] iArr = {1,2,3,4,5};
//		//�迭�� ��� ������ ����Ѵ�.
//		System.out.print(Arrays.toString(iArr)); // Arrays.toString�� ����Ҷ�� import�� �߰��ؾ���.

//		char[] ch = {'a', 'b', 'c', 'd'};
//			System.out.print(ch[1]);   // []�� ���ְ� ch ���·� ����ϸ� char[] ch �迭�� ��簪�� ��µȴ�. char�� ����.

			// �������� 5-1
			
//			int [] iArr1 = new int [10];
//			int [] iArr2 = new int [10];
////			int [] iArr3 = new int []{100, 95, 90, 85, 80};
//			int [] iArr3 = {100, 95, 90, 85, 80};
//			char [] chArr = {'a', 'b', 'c', 'd'};
//			
//			for (int i=0; i <iArr1.length; i++) {
//				iArr1[i] = i + 1;   // 1	~ 10���� �����迭�Ѵ�. iArr1[0] + 1 = 1 �̷�������
//				}
//			
//			for (int i=0; i<iArr2.length; i++) {
//				iArr2[i] = (int)(Math.random()*10 + 1); // �������� 1~10���� Ȱ���Ѵ�.
//			}
//			
//			for (int i=0; i<iArr1.length; i++) {
//				System.out.print(iArr1[i] + ",");
//			}
//			System.out.println(); // ���� 	System.out.print(iArr1[i] + ","); �� �� �ٱ� ����
//			
//			System.out.println(Arrays.toString(iArr2));		// iArr2 �� ���� ����
//			System.out.println(Arrays.toString(iArr3));		// iArr3 �� ���� ����
//			System.out.println(Arrays.toString(chArr));		// chArr�� ���� ����
//
//			System.out.println(iArr3);		// iArr�� �ּ� ���� ����
//			System.out.println(Arrays.toString(chArr));		// char ���� ������.

			// ���� 5-2 ���հ� ��� ���ϱ� 
		
//		int sum = 0;
//		float average = 0f;
//		
//		int[] score = {100, 88, 100, 100, 90};
//		
//		for (int i=0; i<score.length; i++) {
//			sum += score[i];	// �� ���� �� ���ϱ�!
//		}
//		average = sum / (float)score.length;  // ��� = �հ� / �迭�� ����
//		
//		System.out.println("���� : " + sum);
//		System.out.println("��� : " + average);		
		
		
		// ���� 5-3
//		int[] score = { 79, 88, 91, 33, 100, 55, 95};
//		
//		int max = score[0];
//		int min = score[0];
//		
//		for(int i=1; i<score.length; i++) {
//			if(score[i] > max) {		//�ִ밪 ã��
//				max = score[i];
//			} else if(score[i] < min) {		//�ּҰ� ã�� 
//				min = score[i];
//			}
//		}
//		System.out.println("�ִ밪 :" + max);
//		System.out.println("�ּҰ� :" + min);
		
			//���� 5-4
		
//		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//		System.out.println(Arrays.toString(numArr));
//		
//		for (int i=0; i<100; i++) {			// numArr[n]�� 100�� ����
//			int n = (int)(Math.random()*10);	// 0~9 �� ������ ���� ���Ƿ� ���
//			
//			int tmp = numArr[0];
//			numArr[0] = numArr[n];
//			numArr[n] = tmp;
//		}System.out.println(Arrays.toString(numArr));
		
			//���� 5-5
//		int[] ball = new int[45]; // �迭 45�� ����
//		
//		// �� �迭�� 1~45���� �ֱ�
//		for(int i=0; i<ball.length; i++) 
//			ball[i] = i+1;		// ball[0]�� 1�� ����ȴ�.
//		
//		int tmp = 0;		// �� ���� �ٲٴµ� �ʿ��� �ӽú��� 
//		int j = 0;			// ������ ��� ������ ����
//		
//		for(int i=0; i<6; i++) {
//			j = (int)(Math.random()*45);
//			tmp = ball[i];
//			ball[i] = ball[j];
//			ball[j] = tmp;
//		}
//		
//		// �迭 ball�� �տ������� 6�� ���
//		for(int i=0; i<6; i++)
//		System.out.printf("ball[%d]=%d%n", i, ball[i]);
	
			//String(���ڿ�) �迭�� �ʱ�ȭ
		
//		String[] names = {"Kim", "Park", "Yi"};
//		
//		for(int i=0; i<names.length; i++) 
//			System.out.println("names["+i+"] :"+names[i]);		// ��������� for �� 3���ݺ� 
//		
//			String tmp = names[2];
//			System.out.println("tmp:"+ tmp);
//			names[0] = "Yu";
//		
//			for(int i=0; i<names.length; i++)
//				System.out.println(names[i]);
		
			// ���� ���� �� 
//		String[] sArr = {"����", "����", "��"};
//			System.out.println(Arrays.toString(sArr));
//			
//			for(int i=0; i<3; i++) {
//				int tmp = (int)(Math.random() * 3);  // tmp�� ������ 0~2������ ���ڸ� ������ �ٲپ� ����
//				System.out.println(sArr[tmp]);		// tmp�� ������ ��µǰ� ������ sArr�� �迭�� ���
//			}

		//���� 5-7
//public class clonem2 {
//
//	public static void main(String[] args) {
//		
//		System.out.println("�Ű������� ����:"+args.length);
//		for(int i=0; i<args.length; i++) {
//			System.out.println("args["+i+"]=\""+ args[i] +"\"");
//		}		// �����Ҷ�� Run configurations Ŭ���� arguments ������ �����ϸ� �ȴ�.
//		
		
		//���� : �迭 2���� 
		
//		int [][] score = new int[3][4];
//		
//			score[2][2] = 3; 
//			System.out.println(score[2][2]);
//		

			// ������ 5-8
		
//		int[][] score = { 
//				{ 100, 100, 100},
//				{ 20, 20, 20},
//				{30, 30 , 30},
//				{40, 40, 40}
//			};
//		int sum = 0;
//		
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
//				
//				sum += score[i][j];
//			}
//		}
//		
//		System.out.println("sum=" + sum);

				// ���� 5-10 �迭 ���� ��� ���ϱ�
		
//		int[][] score = {
//					{100, 100, 100},
//					{20, 20, 20},
//					{30, 30, 30},
//					{40, 40, 40},
//					{50, 50, 50}
//				};
//		
//		int korTotal = 0, engTotal = 0, mathTotal = 0;
//		
//			System.out.println("��ȣ  ����  ����  ����  ����  ��� ");
//			System.out.println("==============================");
//			
//		for(int i=0; i<score.length; i++) {
//			int sum = 0;		// ���κ� ����
//			float avg = 0.0f;	// ���κ� ���
//			
//			korTotal += score[i][0];
//			engTotal += score[i][1];
//			mathTotal += score[i][2];
//			System.out.printf("%3d", i+1);
//			
//			for(int j=0; j< score[i].length; j++) {
//				sum += score[i][j];
//				System.out.printf("%5d", score[i][j]);
//			}
//			
//			avg = sum/(float)score[i].length;
//			System.out.printf("%5d %5.1f%n", sum, avg);
//		}
//		
//			System.out.println("==============================");
//			System.out.printf("����:%3d %4d %4d%n", korTotal, engTotal, mathTotal);

		// ���� 5-10 �迭 �ʱ�ȭ ���� ��ĳ�� �־ �����
		
//		String[][] word = {
//				{ "chair", "����"},	// 0,1   0,2
//				{ "computer", "��ǻ��"},	//1,1	1,2
//				{ "integer", "����"},		//2,1	2,2
//			};			// �迭�� �� ���� �ִ´�
//				
//		Scanner scanner = new Scanner(System.in);
//		
//		for(int i=0; i<word.length; i++) {
//			System.out.printf("Q%d. %s�� ����?", i+1, word[i][0]);
//			//
//		
//			String tmp = scanner.nextLine();
//			
//			if(tmp.equals(word[i][1])) {
//				System.out.printf("�����Դϴ�.%n%n");
//			}
//			else {
//				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.%n%n", word[i][1]);
//			}
//		}	//main�� ��				
		
//		int [] arr = {0,1,2,3,4};
//		int [][] arr2D = {
//				{11, 12},
//				{21, 22}
//			};
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.deepToString(arr2D));
//				//	2������ �迭�� ����Ҷ�� deepToString�� ����Ѵ�.
//				//	1������ �迭�� toString���� ��µȴ�.
//		String[][] str2D  = new String[][] {{"aaa", "bbb"},{"AAA", "BBB"}};
//		String[][] str2D2 = new String[][] {{"aaa", "bbb"},{"AAA", "BBB"}};
//		
//		System.out.println(Arrays.equals(str2D, str2D2));
//		System.out.println(Arrays.deepEquals(str2D, str2D2));
		// 2������ �迭�� ����Ҷ�� deepEquals�� ����Ѵ�.
		// 1������ �迭�� equals���� ��µȴ�.
			int[] arr = { 0, 1, 2, 3, 4 };
			int[] arr2 = Arrays.copyOf(arr, arr.length);
			int[] arr3 = Arrays.copyOf(arr, 3);
			int[] arr4 = Arrays.copyOf(arr, 7);
			int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
			int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

			System.out.println(Arrays.toString(arr6));

		}
	}
