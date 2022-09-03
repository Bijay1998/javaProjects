/**
 * 
 */
package calculator;

/**
 * @author bijay
 *
 */
public class calc {
	int num1, num2, result;
	
	public calc(int first, int second)
	{
		this.num1 = first;
		this.num2 = second;
		
	}
	
	public void add()
	{
		this.result = this.num1+this.num2;
		System.out.println("Addition:" + this.result);
		
	}
	
	public void sub()
	{
		this.result = this.num1 - this.num2;
		System.out.println("Subtraction: "+ this.result);
	}
	
	public void div()
	{
		this.result = this.num1 / this.num2;
		System.out.println("Division: "+ this.result);
	}
	public void mult()
	{
		this.result = this.num1*this.num2;
		System.out.println("Multiplication: "+ this.result);
	}
}

