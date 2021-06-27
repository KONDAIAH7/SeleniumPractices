package Javaprograms;

import java.util.Scanner;

public class Armstrongnumer {

	public static void main(String[] args) 
	{
		int sum=0,a,temp;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		
		int number=scan.nextInt();
		
		temp=number;
		while(number>0)
		{
			a=number%10;
			sum=sum+(a*a*a);
			number=number/10;
			
		}
		if(temp==sum)
			System.out.println("number is armstrong");
		else
			System.out.println("number is not armstrong");
		

	}

}
