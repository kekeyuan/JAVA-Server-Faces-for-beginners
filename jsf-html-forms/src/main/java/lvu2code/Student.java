package lvu2code;

import javax.annotation.ManagedBean;

@ManagedBean
public class Student {

	private String firstName;
	private String lastName;
	
	// create no-arg constructor
	public Student() {
		
	}

	// define getter/setter methods	
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
}
	