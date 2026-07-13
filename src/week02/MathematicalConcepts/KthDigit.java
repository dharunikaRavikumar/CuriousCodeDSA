package week02.MathematicalConcepts;

import java.util.Scanner;

public class KthDigit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int k=scan.nextInt();
		
		int power=(int) Math.pow(a, b);
		for(int i=1;i<k;i++) {
			power=power/10;
		}
		System.out.println(power%10);

	}

}
