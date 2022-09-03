package leapYear;
import java.util.*;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year of your choice: ");
		int year = sc.nextInt();
		boolean isLeap = false;
		if(year%4==0)
		{
			if(year%100 ==0)
			{
				if(year%400 ==0)
					isLeap = true;
				else
					isLeap = false;
			}
			//evenly divisible by 100 so it is leap year
			else
				isLeap = true;
			
		}
		else{
			isLeap = false;
	
	}
	
	if(isLeap)
		System.out.println(year + " is leap year!");
	else
		System.out.println(year+ " is not a leap year!");
	}
}
