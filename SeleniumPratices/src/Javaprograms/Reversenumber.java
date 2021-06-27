package Javaprograms;

import java.util.Scanner;


public class Reversenumber {

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Entera a number");
		int number=scan.nextInt();
		
		int rev=0;
		
		//1 using algorithem
		
		while(number!=0)
		{
			rev=rev*10 + number%10;// 0+4 | 40+3|432| 4321
			number=number/10;//4  123|12 |1
		}
	
	
	/*	//2 using string buffer
		
		StringBuffer sb= new StringBuffer(String.valueOf(number));
		StringBuffer rev= sb.reverse();
	*/
	/*	//3 string builder
		
		StringBuilder sb1=new StringBuilder(String.valueOf(number));
		//sb1.append(number);
		StringBuilder rev= sb1.reverse();
	*/	
		System.out.println(rev);

	}

}
