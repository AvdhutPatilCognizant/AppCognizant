package Logical_Programs;

import java.util.Scanner;

public class Armstrong_no {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any no");
		int num=s.nextInt();
		int actNum=num;
		int r=0;
		int armNum=0;
		while(num>0) {
			r=num%10;
			armNum=r*r*r+armNum;
			num=num/10;
		}
		if(actNum==armNum) {
			System.out.println("Armstrong no");
		}
		else {
			System.out.println("Not armstrong no");
		}
		System.out.println("Edit done");
	}

}
