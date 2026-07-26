package week04.ArrayBasicProblems;

public class ArraySumRecursion {
	public static int summarray(int [] arr,int n,int i) {
		if(i>=n) {
			return 0;
		}
		return arr[i] + summarray(arr,n,i+1);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int result=summarray(arr,5,0);
		System.out.print(result);
	}

}
