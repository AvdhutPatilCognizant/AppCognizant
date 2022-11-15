package Logical_Programs;

import java.util.Scanner;

public class Replace_all {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String name=s.next();
		String correct=name.replaceAll("[^a-z A-Z]", "");
		System.out.println(correct);
	}

}
