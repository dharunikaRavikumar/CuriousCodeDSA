package week03.MathematicalConcepts_ctnd;

import java.util.Scanner;

public class SwapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
