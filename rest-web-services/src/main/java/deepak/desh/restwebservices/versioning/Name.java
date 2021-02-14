package deepak.desh.restwebservices.versioning;

public class Name {
	private String FirstName;
	private String LastName;

	public Name(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}

	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

}
