
public class City {
	private String cityname;
	Country country;
	
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getCountry() {
		return country.getCountryname();
	}
	public void setCountry(String countryname) {
		country=new Country();
		country.setCountryname(countryname);
		
	}
	
	
	

}
