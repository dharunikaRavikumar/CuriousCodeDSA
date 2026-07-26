package week04.ArrayBasicProblems;

import java.util.Scanner;

public class SearchTargetRecursion {
	public static int searchTarget(int[] arr, int n,int i,int target) {
		if(i>=n) {
			return -1;
		}
		if(arr[i]==target) {
			return i;
		}
		return searchTarget(arr,n,i+1,target);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int target=scan.nextInt();
		int result=searchTarget(arr,n,0,target);
		System.out.println(result);

	}

}
