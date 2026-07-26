package week04.ArrayBasicProblems;

import java.util.Scanner;

public class NoOfZerosRecurrsion {
	public static int countZero(int n) {
		if(n==0) {
			return 0;
		}
		int lastdigit = n%10;
		if(lastdigit==0) {
			return 1+countZero(n/10);
		}
		return countZero(n/10);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int result=countZero(n);
		System.out.println(result);
		
	}

}
