package multipleInheritance;

public class pRectangle {
	int l, b;
	public void setValues(int l, int b)
	{
		this.l = l;
		this.b = b;
	}
	public void getResult()
	{
		int result  = 2*l +2*b;
		System.out.println("The perimeter of this rectangle is "+result);
		
	}

}
