package inheritanceDemo;



public class grandParent extends foreParent{
	int age;
	String name;
	String sex;
	
	public void setValues(int age, String name, String sex)
	{
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	public void getValues()
	{
		System.out.println(this.age +this.name+ this.sex);
	}

}


