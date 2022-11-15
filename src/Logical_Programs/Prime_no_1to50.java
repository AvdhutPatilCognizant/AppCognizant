package Logical_Programs;

import java.util.Scanner;

public class Prime_no_1to50 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the start point");
		int start=s.nextInt();
		System.out.println("Enter the end point");
		int end=s.nextInt();
		int num=0;
		 for(int i=start; i<=end; i++) {
			 int count=0;
			 for(int j=1; j<=i; j++) {
				 if(i%j==0) {
					 count++;
				 }
			 }
			 if(count==2) {
				 System.out.println( i);
				 num++;
			 }
		 }
		 System.out.println("Total no of prime no from"  + start + "to" + end + "is" + num);

	}

}
