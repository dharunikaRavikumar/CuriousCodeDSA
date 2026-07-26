package week04.ArrayBasicProblems;

import java.util.Scanner;

public class PowerOfNumberRecursion {
	public static int power(int number, int exponent) {
		if(exponent==0) {
			return 1;
		}
		return number * power(number,exponent-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int exponent=scan.nextInt();
		int result=power(number,exponent);
		System.out.print(result);

	}

}
