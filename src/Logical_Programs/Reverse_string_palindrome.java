package Logical_Programs;
import java.util.Scanner;

public class Reverse_string_palindrome {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter any Word");
		String org=Scan.next();
		String rev="";
		System.out.println("Lenth Of Your Word :" +org.length());
		 for(int i=org.length()-1; i>=0; i--) {
			rev=rev+org.charAt(i);
		 }
		 System.out.println(rev);
		 if(org.equals(rev)) {
			 System.out.println("Given name is palindrome");
		 }
		 else {
			 System.out.println("Given name is not palindrome");
		 }
	}

}
