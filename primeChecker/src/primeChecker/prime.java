package primeChecker;
import java.util.*;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//taking user input
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if(isPrime(num))
		{
			System.out.println("This is prime number");
		}else{
			System.out.println("This is not prime number");
		}
	}

	public static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if(num<=1){
			return false;
		}
		for(int i = 2; i<Math.sqrt(num);i++)
		{
			if(num%i==0){
				return false;
			}
			
		}
		return true;
	}
		

}
