package Test;

import application.Coffee;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import application.Customer;
import application.Espresso;
import application.Order;

public class OrderTest {
	private Order order;
	private Customer customer;
	private Coffee coffee;
	
	@Before
	public void setUp() {
		customer = new Customer("Cinderella", "Slipper");
		coffee = new Espresso();
		order = new Order(coffee, customer, 9.00);
	}
	@Test
	public void testGetOrderID() {
		int expected = order.getOrderID();
		int actual = order.getOrderID();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetCustomer() {
		Customer expected = customer;
		Customer actual = order.getCustomer();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTotalCost() {
		double expected = 9.00;
		double actual = order.getTotalCost();
		assertEquals(expected, actual, 0.01);
	}
	@Test
	public void testSetTotalCost() {
		double expected = 4.50;
		order.setTotalCost(expected);
		double actual = order.getTotalCost();
		assertEquals(expected,actual, 0.01);
	}
	@Test
	public void testSetCustomer() {
		Customer expected = new Customer("Snow", "White");
		order.setCustomer(expected);
		assertEquals(expected, order.getCustomer());
	}
}