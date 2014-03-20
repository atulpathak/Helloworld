
public class Address {
	private City city;

	public String getCity()
	 {
		return city.getCityname().concat(city.getCountry());
	}

	public void setCity(String cityName,String country) {
		city=new City();
		city.setCityname(cityName);
		city.setCountry(country);
		
	}

	
	

	
	

}
