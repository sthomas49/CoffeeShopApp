package application;

import java.util.Scanner;



public class CoffeeShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Print statement welcoming customer to App
        System.out.println("Welcome to the Coffee Shop!");
        
        //Get first and last name input from customer
        System.out.println("\nWhat is your first name?");
        String firstName = input.nextLine();
        System.out.println("\nWhat is your last name?");
        String lastName = input.nextLine();
        
        //Set customer name
        Customer customer = new Customer(firstName, lastName);
        
        //Get order from customer
        System.out.println("What would you like to order?");
        System.out.println("1. Latte ($6)");
        System.out.println("2. Cappuccino ($7)");
        System.out.println("3. Espresso ($8)");
        
        //Store customer choice
        int choice = input.nextInt();
        Coffee coffee = null;

        switch (choice) {
            case 1:
                coffee = new Latte();
                break;
            case 2:
                coffee = new Cappuccino();
                break;
            case 3:
                coffee = new Espresso();
                break;
            default:
            	//Print statement if incorrect number is chosen
                System.out.println("Invalid choice");
                System.exit(0);
        }
        
        //Store order 
        double totalCost = coffee.getPrice();
        Order order = new Order(coffee,customer, totalCost);
        
        //Print order details back to customer
        System.out.println("Order Details:");
        System.out.println("Order ID:" + order.getOrderID());
        System.out.println("Customer: " + order.getCustomer());
        System.out.println("Coffee: " + coffee.getName());
        System.out.println("Total Cost: $" + order.getTotalCost());
        
        //Close input
        input.close();
    }
    
}