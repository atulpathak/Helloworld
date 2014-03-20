public class City
{
	private String name;
	private Country country;

	public City()
	{
	
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return name;
	}

	public void setCountry(String countryName)
	{
		this.country=new Country();
		country.setName(countryName);
	}

	public Country getCountry()
	{
		return country;
	}
}