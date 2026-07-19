package week03.MathematicalConcepts_ctnd;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		while(n>0) {
			int ld=n%10;
			sum=sum*10+ld;
			n=n/10;
			System.out.print(ld);
		}
		//System.out.print(ld);

	}

}
