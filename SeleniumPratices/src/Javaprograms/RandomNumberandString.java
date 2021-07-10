package Javaprograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumberandString {

	public static void main(String[] args) 
	{
		//approcah 1
		//Random ran=new Random();
		//int randnum=ran.nextInt(100);
		//System.out.println("Random number is"+randnum);
		
		//Double randdoub=ran.nextDouble();//print 0.1 to 1
				//System.out.println(randdoub);
		//approcah 3 Math
		//System.out.println(Math.random());
		
		//random string & number using appachi poi lang
		//String ran=RandomStringUtils.randomNumeric(10);
		//System.out.println(ran);
		
		String ranstr=RandomStringUtils.randomAlphabetic(7);
		System.out.println(ranstr);

	}

}
