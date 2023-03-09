package Test;

import org.junit.Before;
import org.junit.Test;

import application.Coffee;
import application.Espresso;

import static org.junit.Assert.assertEquals;

public class CoffeeTest {
	private Coffee coffee;
	
	@Before
	public void setUp() {
		coffee = new Espresso();
	}
	@Test
	public void testGetName() {
		String expected = "Espresso";
		String actual = coffee.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice() {
		double expected = 8.00;
		double actual = coffee.getPrice();
		assertEquals(expected, actual, 0.01);
	}
	@Test
	public void testSetName() {
		String expected = "Latte";
		coffee.setName(expected);
		String actual = coffee.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice() {
		double expected = 3.00;
		coffee.setPrice(expected);
		double actual = coffee.getPrice();
		assertEquals(expected, actual, 0.01);
	}

}
