package Javaprograms;

import java.util.Scanner;

public class Reversestring 
{

	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string name");
		String str=scan.nextLine();
		
	/* 
	 	int len=str.length();
	 
		
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
	*/
		
 /*	 //string buffer
		
		StringBuffer sb= new StringBuffer(str);
		System.out.println(sb.reverse());
		
	*/	
		
		StringBuilder sb1 =new StringBuilder(str);
		System.out.println(sb1.reverse());
		
		
		

	}

}
