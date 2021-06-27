package Javaprograms;

import java.util.Scanner;

public class Reversestringotherways 
{
	public static void reversestring(char[]ch,int length)
	{
		
		if(length>0)
		{
			System.out.println(ch[length-1]);
			length--;
		
		reversestring(ch, length);
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string name");
		String str=scan.nextLine();
		
		char[] ch=str.toCharArray();//converts string to charaarray
		int length=ch.length;
		
		reversestring(ch, length);
		

	}

}
