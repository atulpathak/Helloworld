
public class Employee 
  {
	private String name;
	 private byte age;
	private Address address;
	public employee()
	{

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public byte getAge() 
	{
		return age;
	}
	public void setAge(byte age)
	 {
		this.age = age;
	}
	public String getAddress() 
	{
		return address.getCity();
	}
	public void setAddress(String city,String country) 
	{
		address=new Address();
		address.setCity(city,country);
	}
	
	
    }

