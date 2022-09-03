package factorial;
import java.util.*;

public class userFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num  = sc.nextInt();
		
		for( i =1; i<=num; i++)
		{
			fact = fact*i;
			
		}
		System.out.println("Factorial of "+ num + " is "+ fact);

	}

}
