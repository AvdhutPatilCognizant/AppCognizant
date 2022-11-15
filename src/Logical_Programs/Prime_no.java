package Logical_Programs;

import java.util.Scanner;

public class Prime_no {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=s.nextInt();
		int count=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime no");
		}
		else {
			System.out.println("not Prime no");
		}
	}

}
