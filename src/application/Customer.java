package application;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Customer {
	private String firstName;
	private String lastName;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//Get customer first name
	public String getFirstName() {
		return firstName;
	}
	
	//Get customer last name
	public String getLastName() {
		return lastName;
	}
	//Store name in string
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	//Test
	@Test
	public void testGetFullName() {
		Customer customer = new Customer("Cinderella", "Slipper");
		assertEquals("Cinderella Slipper", customer.getFullName());
	}
}
