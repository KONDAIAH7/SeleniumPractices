package Javaprograms;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		
		String orgstr=str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(orgstr.equals(str))
		{
			System.out.println("enter string is palindrome");
		}
		
		else
		{
			System.out.println("enter is string is not palindrome");
		}

	}

}
