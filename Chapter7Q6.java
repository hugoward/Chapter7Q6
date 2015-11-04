import java.util.Scanner;


public class Chapter7Q6 {

	public static void main(String[] args) {
		
		System.out.println("Mexico Population in 2014 was 123.8 million");
		
		
		
		System.out.println("enter a year after 2014: ");
		Scanner scanner2 = new Scanner(System.in);
		int input = scanner2.nextInt();
		
		double x = populationgrowth(input);
		
		System.out.println("Mexico Population in " + input + " was " + x);
	}
	public static double populationgrowth(int a)
	{
		double po = 1238000000;
		double c=0;
		double population=0;
		int number;
		double b;
		
		for (int i = 1; i<=po; i++)
		{
				
			number = a-2014;
			b = (po*0.5);
			c = b + c;
			population = Math.pow(c, number);
			
			}	
		
		
		return population;
		
	}



}


