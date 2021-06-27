package Javaprograms;

import java.util.Scanner;

public class Largestof3numbers {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=scan.nextInt();


		System.out.println("Enter second number");
		int b=scan.nextInt();
		
		System.out.println("Enter third number");
		int c=scan.nextInt();
		
	/*	//1 case terinary
		int largest=a>b?a:b;
		int largest2=c>largest?c:largest;
		
		System.out.println("Largest of 3numbers is"+largest2);
		
	*/
		//2nd way
		if( a>b && a<c)
		{
			System.out.println("Largest number is "+a);
		}
		else if( b>a && b>c)
		{
			System.out.println("Largest number is "+b);
		}
		else
		{
			System.out.println("Largest number is "+c);

		}
	
	}

}
