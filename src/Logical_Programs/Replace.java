package Logical_Programs;

import java.util.Scanner;

public class Replace {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the string which contains Special character");
	String name=s.next();
	String correctName=name.replace('@', 'a');
	System.out.println(correctName);
}
}
