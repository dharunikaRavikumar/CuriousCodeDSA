package week02.MathematicalConcepts;

import java.util.Scanner;

public class CornerDigitSum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int fd=0;
		int ld=n%10;
			
		while(n>0) {
		    fd=n%10;
			n=n/10;
		}
		int sum=ld+fd;
		System.out.println(sum);
	}

}
