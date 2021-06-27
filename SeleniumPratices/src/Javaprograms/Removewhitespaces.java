package Javaprograms;

public class Removewhitespaces {

	public static void main(String[] args) 
	{
	/*	
		//1 method with inbuilt method
		
		String str="My name is KK";
		String nospace=str.replaceAll(" ", "");
		
		System.out.println(nospace);
		
		*/
		
		//2method
		String str= "i am from Nandyal";
		char[] strarray =str.toCharArray();
		//string obeject into 
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<strarray.length;i++)
		{
			if((strarray[i]!=' ')&& (strarray[i]!='\t'))
			{
				sb.append(strarray[i]);
			}	
			
		}

		String nospace=sb.toString();
		
		System.out.println(nospace);
		
		
		

	}

}
