package college;

public class Address {
	
	private int streetNumber;
	private String streetName;
	private String city;
	private String state;
	private int postalCode;
	
	public Address() {
	}
	
	public Address(int streetNumber, String streetName, String city,
			String state, int postalCode) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	public String toString() {
		return streetNumber + " " + streetName + ", " + city + ", " + state + " " + postalCode;
	}
}
