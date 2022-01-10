package Javaprograms;

public class Countoccurenceofcharacter {

	public static void main(String[] args) 
	{
		String str="kondaiah is a handsome person";
		int totalcount=str.length();
		int afterremovecount=str.replaceAll("a", "").length();
		int count=totalcount-afterremovecount;
		System.out.println("Occurrence of chracter in a string" +count);

	}

}
