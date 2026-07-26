package week04.ArrayBasicProblems;

public class ArraySorting {
	public static boolean checksorted(int[] arr,int n,int i) {
		if(i>=n-1) {
			return true;
		}
		if(arr[i]>arr[i+1]) {
			return false;
		}
		return checksorted(arr,n,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		boolean result=checksorted(arr,5,0);
		System.out.print(result);

	}

}
