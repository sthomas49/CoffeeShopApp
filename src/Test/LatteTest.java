package Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import application.Latte;

public class LatteTest {
	
	@Test
	public void testGetName() {
		Latte latte = new Latte();
		assertEquals("Latte", latte.getName());
	}
	@Test 
	public void testGetPrice() {
		Latte latte = new Latte();
		assertEquals(6.00, latte.getPrice(), 0.001);
	}

}
