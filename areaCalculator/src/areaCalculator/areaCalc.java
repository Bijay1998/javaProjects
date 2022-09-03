/**
 * 
 */
package areaCalculator;

/**
 * @author bijay
 *
 */
public class areaCalc {
	double l, b, r;
	
	
	public void Circle(double r)
	{
		this.r = r;
		double circ = 3.14 *r*r;
		System.out.println("The area of Circle is :"+ circ);
		
	}
	
	public void Square(double l)
	{
		this.l = l; 
		double sq = l*l;
		System.out.println("The area of Square is : "+ sq);
	}
	
	public void Rectangle(double l, double b)
	{
		this.l = l; 
		this.b = b;
		double rec = l*b;
		System.out.println("The area of Square is : "+ rec);	
	}

}
