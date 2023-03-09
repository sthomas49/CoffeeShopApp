package Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import application.Cappuccino;

public class CappuccinoTest {
	
	@Test
	public void testGetName() {
		Cappuccino cappuccino = new Cappuccino();
		assertEquals("Cappuccino", cappuccino.getName());
	}
	@Test
	public void testGetPrice() {
		Cappuccino cappuccino = new Cappuccino();
		assertEquals(7.00, cappuccino.getPrice(), 0.001);
	}

}
