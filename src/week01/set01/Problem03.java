package week01.set01;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int mark=scan.nextInt();
		if(mark>=90) {
			System.out.println("Grade A");
		}else if(mark>=80) {
			System.out.println("Grade B");
		}else if(mark>=60) {
			System.out.println("Grade c");
		}else if(mark>=35) {
			System.out.println("Grade D");
		}else {
			System.out.println("Fail");
		}

	}

}
