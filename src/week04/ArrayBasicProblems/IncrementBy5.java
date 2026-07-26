package week04.ArrayBasicProblems;

import java.util.Scanner;

public class IncrementBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr[i]=arr[i]+5;
			System.out.println(arr[i]);
		}
//		for(int i=0;i<n;i++) {
//		System.out.println(arr[i]);
//		}

	}

}
