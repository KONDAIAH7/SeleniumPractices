package Javaprograms;

import java.util.HashSet;

public class Dupplicateelementinarray {

	public static void main(String[] args) 
	{

		String arry[]= {"Java","C","Python","C","java"};
	/*	boolean flag=false;
		for(int i=0;i<arry.length;i++)
		{
			for(int j=i+1;j<arry.length;j++)
			{
				if(arry[i]==arry[j])
					{System.out.println("Duplicate element found" +arry[i]);
						flag=true;
					}
			}
		}
		if(flag==false)
			System.out.println("Duplicate element is not present in array");
	*/
		boolean flag=false;
		HashSet<String> hash=new HashSet();
		
		for(String s:arry)
		{
			if(hash.add(s)==false)
				
				{ System.out.println("Duplicate element in array"+s);
					flag=true;
				}
				
		}
		if(flag==false)
			System.out.println("Duplicate element is not present in array");
		
		
	}
	

}
