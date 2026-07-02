package week01.set01;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int sum=a+b+c;
		if(sum==180) {
			System.out.println("triangle can be formed");
		}else {
			System.out.println("triangle can not be formed");
		}

	}

}
