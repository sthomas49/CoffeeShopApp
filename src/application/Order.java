package application;


public class Order {
	private int orderID;
	private double totalCost;
	private Customer customer;
	
	public Order(Coffee coffe, Customer customer, double totalCost) {
		this.customer = customer;
		this.totalCost = totalCost;
		this.orderID = setOrderID();
		

	}
	//Assign random order ID number
	private int setOrderID() {
		return (int) (Math.random()* (100- 10) + 1);
	}
	
	//Get order ID
	public int getOrderID() {
		return orderID;
	}
	
	//Get customer name
	public Customer getCustomer() {
		return customer;
	}
	
	//Set customer name
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	//Get the total cost of coffee
	public double getTotalCost() {
		return totalCost;
	}
	
	//Set the total cost of coffee
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
		
	}

}