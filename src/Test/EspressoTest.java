package Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import application.Espresso;

public class EspressoTest {
	
	@Test
	public void testGetName() {
		Espresso espresso = new Espresso();
		assertEquals("Espresso", espresso.getName());
	}
	@Test 
	public void testGetPrice() {
		Espresso espresso = new Espresso();
		assertEquals(8.00, espresso.getPrice(), 0.001);
	}
}