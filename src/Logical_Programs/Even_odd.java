package Logical_Programs;

import java.util.Scanner;

public class Even_odd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=s.nextInt();
		
		if(num%2==0) {
			System.out.println("no is even");
		}
		else {
			System.out.println("no is odd");
		}
		}

}
