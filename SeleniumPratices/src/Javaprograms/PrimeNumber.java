package Javaprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		

		int count=0;
		for(int i=1;i<num;i++)
		{
			if(num%1==0)
				count++;
		}
		if(count==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println(" It is Not a prime numbwer");
		}
		

	}

}
