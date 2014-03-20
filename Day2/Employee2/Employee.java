
public class Employee{
private String name;
private byte age;
private Adress add;

	public Employee(String name,byte age,String name,String city,String country)
	{
		this.add=new Address();
		add.setAddress(cityName,countryName);
		
		this.name=name;
		this.age=age;

	}


	public void displayEmployeeDetails()
	{
		System.out.println(name);
	}


	public  void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(byte age)
	{
		this.age=age;
	}
	public byte getAge()
	{
		return age;
	}
	public void setAddress(String cityName,String countryName)
	{
		this.add=new address()
		add.setCity(cityName,countryName);
		

	}
	public void getAddress()
	{
		return add;
	}
}