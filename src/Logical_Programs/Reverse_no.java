package Logical_Programs;

public class Reverse_no {
public static void main(String[] args) {
	int num= 65974;
	int rev = 0;
    while(num>0)
    {
    	int rem = num%10;   //  12345%10 = 5  1234%10= 4  // 123%10 = 3
    	rev = rem + rev*10;  // 5 + (0*10) =5.... 4 + 5*10 = 54....3 + 54*10=543 
    	num= num/10;    /// 1234/10 = 123
    }
	System.out.print(rev);
}
}
