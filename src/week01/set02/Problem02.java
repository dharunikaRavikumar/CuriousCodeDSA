package week01.set02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		for(int i=0;i<=1000;i=i+x) {
			System.out.println(i);
		}
	}

}
