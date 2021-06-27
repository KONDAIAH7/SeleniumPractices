package Javaprograms;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Entera a number");
		int number=scan.nextInt();
		int rev=0;
		int orgnum= number;
		
		while(number!=0)
		{
			rev=rev*10+number%10;
			number=number/10;
		}
		
		if(orgnum==rev)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}

	}

}
