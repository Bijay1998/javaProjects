package inheritanceDemo;

public class parent extends grandParent {
	String address;
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void getAddress()
	{
		System.out.println("The address is "+ this.address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent gp  = new parent();
		gp.setValues(12, "Ram", "Male");
		gp.getValues();
		gp.setAddress("USA");
		gp.getAddress();
		gp.setJob("Banker");
		gp.getJob();

	}

}
