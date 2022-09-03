
public class Student {
	int stId;
	String stName;
	String stAddress;
	
	public Student(int stId, String stName, String stAddress)
	{
		this.stId = stId;
		this.stName = stName;
		this.stAddress = stAddress;
	}
	
	public void setId(int stId)
	{
		this.stId = stId;
	}
	
	public int getId()
	{
		return this.stId;
	}
	
	public void setName(String stName)
	{
		this.stName = stName;
	}
	
	public String getName()
	{
		return this.stName;
	}
	
	public void setAddress(String stAddress)
	{
		this.stAddress = stAddress;
	}
	
	public String getAddress()
	{
		return this.stAddress;
		
	}
	
	public String toString()
	{
		return "Student[ stId ="+ stId +", stName = "+stName+", stAddress ="+ stAddress+" ]";
	}
}
