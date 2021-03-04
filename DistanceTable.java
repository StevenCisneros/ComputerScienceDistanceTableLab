/* Steven Cisneros
 * CIS183-25718-LEC
 */

import java.util.Scanner;

public class DistanceTable {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter a speed greater than 10 miles: ");
		
		int speed = in.nextInt();
		
		System.out.println("Hour  Speed  Distance Traveled");
		
		System.out.println("------------------------------");
		
		for (int time=1; time<11; time=time+1)
		{
			int distance = speed * time;
			
			int min = 1;
			
			int max =  5;
			
			int random_number = (int)(Math.random() * (max - min + 1) + min);
			
			System.out.printf("%1s %6s %7s\n",time, speed+random_number, distance);
			

			
		}
		
		
		
		
		

	}

}
