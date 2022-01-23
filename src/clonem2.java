//import java.beans.DefaultPersistenceDelegate;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.element.NestingKind;

public class clonem2 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		
		// Chapter 5 배열 시작.
		
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
//			System.out.println("배열의 나열 입니다.");

//		int[] iArr = {1,2,3,4,5};
//		//배열의 모든 나열을 출력한다.
//		System.out.print(Arrays.toString(iArr)); // Arrays.toString를 사용할라면 import문 추가해야함.

//		char[] ch = {'a', 'b', 'c', 'd'};
//			System.out.print(ch[1]);   // []를 없애고 ch 상태로 출력하면 char[] ch 배열의 모든값이 출력된다. char만 가능.

			// 예제문제 5-1
			
//			int [] iArr1 = new int [10];
//			int [] iArr2 = new int [10];
////			int [] iArr3 = new int []{100, 95, 90, 85, 80};
//			int [] iArr3 = {100, 95, 90, 85, 80};
//			char [] chArr = {'a', 'b', 'c', 'd'};
//			
//			for (int i=0; i <iArr1.length; i++) {
//				iArr1[i] = i + 1;   // 1	~ 10까지 순차배열한다. iArr1[0] + 1 = 1 이런식으로
//				}
//			
//			for (int i=0; i<iArr2.length; i++) {
//				iArr2[i] = (int)(Math.random()*10 + 1); // 랜덤으로 1~10까지 활용한다.
//			}
//			
//			for (int i=0; i<iArr1.length; i++) {
//				System.out.print(iArr1[i] + ",");
//			}
//			System.out.println(); // 위에 	System.out.print(iArr1[i] + ","); 를 줄 뛰기 해줌
//			
//			System.out.println(Arrays.toString(iArr2));		// iArr2 의 값을 나열
//			System.out.println(Arrays.toString(iArr3));		// iArr3 의 값을 나열
//			System.out.println(Arrays.toString(chArr));		// chArr의 값을 나열
//
//			System.out.println(iArr3);		// iArr의 주소 값을 나열
//			System.out.println(Arrays.toString(chArr));		// char 값을 보여줌.

			// 예제 5-2 총합과 평균 구하기 
		
//		int sum = 0;
//		float average = 0f;
//		
//		int[] score = {100, 88, 100, 100, 90};
//		
//		for (int i=0; i<score.length; i++) {
//			sum += score[i];	// 각 총합 다 더하기!
//		}
//		average = sum / (float)score.length;  // 평균 = 합계 / 배열의 숫자
//		
//		System.out.println("총합 : " + sum);
//		System.out.println("평균 : " + average);		
		
		
		// 예제 5-3
//		int[] score = { 79, 88, 91, 33, 100, 55, 95};
//		
//		int max = score[0];
//		int min = score[0];
//		
//		for(int i=1; i<score.length; i++) {
//			if(score[i] > max) {		//최대값 찾기
//				max = score[i];
//			} else if(score[i] < min) {		//최소값 찾기 
//				min = score[i];
//			}
//		}
//		System.out.println("최대값 :" + max);
//		System.out.println("최소값 :" + min);
		
			//예제 5-4
		
//		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//		System.out.println(Arrays.toString(numArr));
//		
//		for (int i=0; i<100; i++) {			// numArr[n]을 100번 섞기
//			int n = (int)(Math.random()*10);	// 0~9 중 랜덤한 숫자 임의로 얻기
//			
//			int tmp = numArr[0];
//			numArr[0] = numArr[n];
//			numArr[n] = tmp;
//		}System.out.println(Arrays.toString(numArr));
		
			//예제 5-5
//		int[] ball = new int[45]; // 배열 45개 생성
//		
//		// 각 배열에 1~45숫자 넣기
//		for(int i=0; i<ball.length; i++) 
//			ball[i] = i+1;		// ball[0]에 1이 저장된다.
//		
//		int tmp = 0;		// 두 값을 바꾸는데 필요한 임시변수 
//		int j = 0;			// 랜덤값 얻어 저장할 변수
//		
//		for(int i=0; i<6; i++) {
//			j = (int)(Math.random()*45);
//			tmp = ball[i];
//			ball[i] = ball[j];
//			ball[j] = tmp;
//		}
//		
//		// 배열 ball의 앞에서부터 6개 출력
//		for(int i=0; i<6; i++)
//		System.out.printf("ball[%d]=%d%n", i, ball[i]);
	
			//String(문자열) 배열의 초기화
		
//		String[] names = {"Kim", "Park", "Yi"};
//		
//		for(int i=0; i<names.length; i++) 
//			System.out.println("names["+i+"] :"+names[i]);		// 여기까지만 for 문 3번반복 
//		
//			String tmp = names[2];
//			System.out.println("tmp:"+ tmp);
//			names[0] = "Yu";
//		
//			for(int i=0; i<names.length; i++)
//				System.out.println(names[i]);
		
			// 가위 바위 보 
//		String[] sArr = {"가위", "바위", "보"};
//			System.out.println(Arrays.toString(sArr));
//			
//			for(int i=0; i<3; i++) {
//				int tmp = (int)(Math.random() * 3);  // tmp에 랜덤값 0~2까지의 숫자를 정수로 바꾸어 대입
//				System.out.println(sArr[tmp]);		// tmp에 정수가 출력되고 랜덤된 sArr의 배열이 출력
//			}

		//예제 5-7
//public class clonem2 {
//
//	public static void main(String[] args) {
//		
//		System.out.println("매개변수의 개수:"+args.length);
//		for(int i=0; i<args.length; i++) {
//			System.out.println("args["+i+"]=\""+ args[i] +"\"");
//		}		// 실행할라면 Run configurations 클릭후 arguments 눌르고 설정하면 된다.
//		
		
		//예제 : 배열 2차원 
		
//		int [][] score = new int[3][4];
//		
//			score[2][2] = 3; 
//			System.out.println(score[2][2]);
//		

			// 예제문 5-8
		
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

				// 예제 5-10 배열 총점 평균 구하기
		
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
//			System.out.println("번호  국어  영어  수학  총점  평균 ");
//			System.out.println("==============================");
//			
//		for(int i=0; i<score.length; i++) {
//			int sum = 0;		// 개인별 총점
//			float avg = 0.0f;	// 개인별 평균
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
//			System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, mathTotal);

		// 예제 5-10 배열 초기화 의자 스캐너 넣어서 만들기
		
//		String[][] word = {
//				{ "chair", "의자"},	// 0,1   0,2
//				{ "computer", "컴퓨터"},	//1,1	1,2
//				{ "integer", "정수"},		//2,1	2,2
//			};			// 배열에 각 값을 넣는다
//				
//		Scanner scanner = new Scanner(System.in);
//		
//		for(int i=0; i<word.length; i++) {
//			System.out.printf("Q%d. %s의 뜻은?", i+1, word[i][0]);
//			//
//		
//			String tmp = scanner.nextLine();
//			
//			if(tmp.equals(word[i][1])) {
//				System.out.printf("정답입니다.%n%n");
//			}
//			else {
//				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", word[i][1]);
//			}
//		}	//main의 끝				
		
//		int [] arr = {0,1,2,3,4};
//		int [][] arr2D = {
//				{11, 12},
//				{21, 22}
//			};
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.deepToString(arr2D));
//				//	2차원의 배열을 출력할라면 deepToString을 써야한다.
//				//	1차원의 배열은 toString으로 출력된다.
//		String[][] str2D  = new String[][] {{"aaa", "bbb"},{"AAA", "BBB"}};
//		String[][] str2D2 = new String[][] {{"aaa", "bbb"},{"AAA", "BBB"}};
//		
//		System.out.println(Arrays.equals(str2D, str2D2));
//		System.out.println(Arrays.deepEquals(str2D, str2D2));
		// 2차원의 배열을 출력할라면 deepEquals을 써야한다.
		// 1차원의 배열은 equals으로 출력된다.
			int[] arr = { 0, 1, 2, 3, 4 };
			int[] arr2 = Arrays.copyOf(arr, arr.length);
			int[] arr3 = Arrays.copyOf(arr, 3);
			int[] arr4 = Arrays.copyOf(arr, 7);
			int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
			int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

			System.out.println(Arrays.toString(arr6));

		}
	}
