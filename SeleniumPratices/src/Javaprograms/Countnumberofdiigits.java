package Javaprograms;

import java.util.Scanner;

public class Countnumberofdiigits {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		int count=0;
		
		while(number>0)
		{
			number=number/10;
			count++;			
		}
		System.out.println(" Count of digits is"+count);

	}

}
