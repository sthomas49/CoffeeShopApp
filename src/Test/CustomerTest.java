package Test;
import application.Customer;

import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class CustomerTest {
	   @Test
	    public void testGetFirstName() {
	        Customer customer = new Customer("John", "Doe");
	        assertEquals("John", customer.getFirstName());
	    }

	    @Test
	    public void testGetLastName() {
	        Customer customer = new Customer("John", "Doe");
	        assertEquals("Doe", customer.getLastName());
	    }

	    @Test
	    public void testGetFullName() {
	        Customer customer = new Customer("John", "Doe");
	        assertEquals("John Doe", customer.getFullName());
	    }

}
