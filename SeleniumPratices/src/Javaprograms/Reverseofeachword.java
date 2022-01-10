package Javaprograms;

public class Reverseofeachword {




	public static void main(String[] args) 
	{
		String s="Welcome to selenium";
		String[] words=s.split(" ");
		String revstr="";
		
		for(String w:words)
		{
			
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			
			revstr=revstr+sb.toString()+" ";
		}
		System.out.println(" reverse of each word"+revstr);
		
		
	

	}

}
