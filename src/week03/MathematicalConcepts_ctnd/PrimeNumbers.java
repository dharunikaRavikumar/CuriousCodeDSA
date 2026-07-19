package week03.MathematicalConcepts_ctnd;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int num=2;num<=n;num++) {
			boolean isPrime=true;
			
			for(int i=2;i*i<=num;i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(num);
			}
		}

	}

}
