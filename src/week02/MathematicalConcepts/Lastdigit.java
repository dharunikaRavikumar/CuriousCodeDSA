package week02.MathematicalConcepts;

import java.util.Scanner;

public class Lastdigit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ld=n%10;
		System.out.print(ld);
	}

}
