package week04.ArrayBasicProblems;

import java.util.Scanner;

public class PrintDivisorRecursion {
	public static void divisor(int n, int i) {
		if(i>n) {
			return;
		}
		if(n%i==0) {
			System.out.print(i);
		}
		divisor(n,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		divisor(n,1);

	}

}
