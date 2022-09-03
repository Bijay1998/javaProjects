/**
 * 
 */
package demo;

/**
 * @author bijay
 *
 */
public class add {
	//attributes: variables with some type
	int first;
	
	//constructors: name same as the name of the class, will not have any return type
	public add()
	{
		//called automatically when the objects of this class is created
	}
	public add(int s)
	{
		this.first =s;
	}
	
	//methods
	
	public void setFirst(int f)
	{
		this.first = f;
	}
	
	public int getFirst()
	{
		return this.first;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add demoAdd = new add();//creation of object cause it is variable of class which contains member attributes and meber function ii it
		demoAdd.setFirst(5);
		int a = demoAdd.getFirst();
		System.out.println(a);
		
		
		System.out.println("This is additin");

	}

}
