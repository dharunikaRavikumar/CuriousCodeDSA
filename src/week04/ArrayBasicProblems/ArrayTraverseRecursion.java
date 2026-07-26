
package week04.ArrayBasicProblems;

import java.util.Scanner;

public class ArrayTraverseRecursion {
	public static void arrayTravers(int[] arr , int n, int i) {
		if(i>=n) {
			return;
		}
		System.out.println(arr[i]);
		i=i+1;
		arrayTravers(arr,n,i);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		arrayTravers(arr,n,0);
	}

}
