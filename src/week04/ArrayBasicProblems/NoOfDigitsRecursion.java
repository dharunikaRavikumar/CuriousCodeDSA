package week04.ArrayBasicProblems;

import java.util.Scanner;

public class NoOfDigitsRecursion {
	public static int countdigit(int n) {
		if(n==0) {
			return 0;
		}
		return 1+countdigit(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int result = countdigit(n);
		System.out.print(result);

	}

}
