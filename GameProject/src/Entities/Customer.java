package Entities;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private int birthOfYear;
	private String nationlityId;
	public Customer() {
		
	}
	public Customer(int id, String firstName, String lastName, int birthOfYear, String nationlityId) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfYear = birthOfYear;
		this.nationlityId = nationlityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthOfYear() {
		return birthOfYear;
	}
	public void setBirthOfYear(int birthOfYear) {
		this.birthOfYear = birthOfYear;
	}
	public String getNationlityId() {
		return nationlityId;
	}
	public void setNationlityId(String nationlityId) {
		this.nationlityId = nationlityId;
	}
	
	
	
}
