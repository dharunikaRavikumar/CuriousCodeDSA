package week01.set02;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String firstName=scan.nextLine();
		String lastName=scan.nextLine();
		String fullName=firstName+lastName;
		int n=scan.nextInt();
		for(int i=0;i<=n;i++)
			System.out.println(fullName);

	}

}
