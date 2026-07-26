package week04.ArrayBasicProblems;

import java.util.Scanner;

public class SumofDigitRecursion {
	public static int sumdigit(int n) {
		if(n==0){
			return 0;
		}
		return n%10 + sumdigit(n/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int result=sumdigit(n);
		System.out.print(result);

	}

}
