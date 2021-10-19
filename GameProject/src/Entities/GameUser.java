package Entities;

public class GameUser {
	
	//FÝELD
	private int id;
	private String FirstName;
	private String LastName;
	private String nationalityId; 
	private int dateOfBirth;
	
	//YAPICILAR
	public GameUser() {
		
	}
	
	
	public GameUser(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}

	//SET/GET


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	

}
