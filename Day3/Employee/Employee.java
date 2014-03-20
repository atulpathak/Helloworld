import java.util.*;
public class Employee
{
	private String name;
	private byte age;
	private Address []add;
	
	public Employee(String name,byte age)
	{
		this.name=name;
		this.age=age;
	}
	public void setName(String name)
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

	
	public void setAddress(Address [] add)
	{
		this.add=add;
		Scanner scn=new Scanner(System.in);
		for(int iTmp=0;iTmp<add.length;iTmp++)
		{
			this.add[iTmp]=new Address();
			System.out.println("Enter the city"+iTmp+":");
			String cityName=scn.next();
			System.out.println("Enter the country"+iTmp+":");
			String countryName=scn.next();
			this.add[iTmp].setCity(cityName,countryName);		
		}
	}	

	public Address[] getAddress()
	{
		return this.add;
	}
}
