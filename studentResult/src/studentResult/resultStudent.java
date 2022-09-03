package studentResult;

public class resultStudent {
	String name;
	int age, level;
	double percentage, total, obtained;
	
	public resultStudent()
	{
		this.name = name;
		this.age = age;
		 this.level = level;
		 this.percentage = 0;
		 this.total = 0;
		 this.obtained = 0;
	}
	public void setStdDetails(String name, int age, int level)
	{
		this.name = name;
		this.age = age;
		this.level = level;
		
	}
	
	public void getStdDetails()
	{
		System.out.println(this.name + " is " + this.age + " years old and he studies in level " + this.level );
	}
	 
	 public  void subjects()
	 {
		 
	 }
}
