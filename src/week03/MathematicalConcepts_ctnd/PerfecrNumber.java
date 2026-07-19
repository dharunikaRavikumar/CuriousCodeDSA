package week03.MathematicalConcepts_ctnd;

import java.util.Scanner;

public class PerfecrNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=1;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				sum=sum+i;
				if(i!=n/i) {
					sum=sum+(n/i);
			}
			}
		}
		if(sum==n) {
			System.out.print("It is a perfect number");
		}else {
			System.out.print("It is not a perfect number");
		}

	}

}
