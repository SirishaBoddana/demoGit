package entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class Location {

	@Column(length = 100)
	private String institutename;
	
	@Column(length = 100)
	private String address;

	@Column(length = 100)
	private String City;

	public String getInstitutename() {
		return institutename;
	}

	public void setInstitutename(String institutename) {
		this.institutename = institutename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}
	
	
}
