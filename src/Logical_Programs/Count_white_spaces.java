package Logical_Programs;

import java.util.Scanner;

public class Count_white_spaces {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=s.nextLine();
		int count=0;
		System.out.println(name.length());
		for(int i=0; i<=name.length()-1; i++) {
			char ch=name.charAt(i);
			if(ch ==' ') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
