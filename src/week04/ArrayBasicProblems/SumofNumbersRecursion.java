package week04.ArrayBasicProblems;

import java.util.Scanner;

public class SumofNumbersRecursion {

	
		public static int sum(int n) {
			if(n==0) {
				return 0;
			}
			return n+sum(n-1);
		}
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int result=sum(n);
			System.out.print("sum= "+result );
	}
}


