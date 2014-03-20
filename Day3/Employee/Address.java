public class Address
{
	private City city;


	public void setCity(String cityName,String countryName)
	{
		
		this.city=new City();
		city.setName(cityName);
		city.setCountry(countryName);
		
	}

	public City getCity()
	{
		return city;
	}
	
}