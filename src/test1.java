import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.Scanner;

public class test1 {

	// µµ·è´ÔÀÌ ³»ÁÖ½Å ¹®Á¦µé 
	
	public static void main(String[] args) {

		System.out.print("¼ýÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä.>");		
		Scanner scanner = new Scanner(System.in);
//		A = scanner.nextInt();
		
		int [] B = new int[5];
		
		for (int i=0; i<B.length; i++) {   // ÃÑ 5¹ø µº
			
			B[i] = scanner.nextInt();
			
			System.out.println(B[i]);
		}
	}

}