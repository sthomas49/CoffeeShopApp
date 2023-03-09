package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;



	public class CoffeeShopGUI extends Application {
		private Customer customer;
		private Coffee coffee;
		private TextField firstNameTextField;
		private TextField lastNameTextField;
		
		public static void main(String[] args) {
			launch(args);
		}
	

		@Override
		public void start(Stage primaryStage) {
			//Create layout
			GridPane gridPane = new GridPane();
			gridPane.setAlignment(Pos.CENTER);
			gridPane.setHgap(10);
			gridPane.setVgap(10);
			gridPane.setPadding(new Insets(25, 25, 25, 25));
			
			//Welcome Banner
			Label welcomeLabel = new Label("Welcome to the Coffee Shop!");
			gridPane.add(welcomeLabel, 0, 0, 2, 1);
			
			//First Name Label
			Label firstNameLabel = new Label("Frist Name:");
			firstNameTextField = new TextField();
			gridPane.add(firstNameLabel, 1, 1);
			gridPane.add(firstNameTextField, 2, 1);
			
			//Last Name Label
			Label lastNameLabel = new Label("Last Name:");
			lastNameTextField = new TextField();
			gridPane.add(lastNameLabel, 1, 2);
			gridPane.add(lastNameTextField, 2, 2);
			
			//Order Label
			Label orderLabel = new Label("What do you want to order?");
			gridPane.add(orderLabel, 0, 3, 2, 1);
			
			//Order buttons for choices
			Button latteButton = new Button("Latte $6");
			latteButton.setOnAction(event -> {
				coffee = new Latte();
				completeOrder(primaryStage);
			});
			gridPane.add(latteButton, 0, 4);
			
			Button cappuccinoButton = new Button("Cappuccino $7");
			cappuccinoButton.setOnAction(event -> {
				coffee = new Cappuccino();
				completeOrder(primaryStage);
			});
			gridPane.add(cappuccinoButton, 1, 4);
			
			Button espressoButton = new Button("Espresso $8");
			espressoButton.setOnAction(event -> {
				coffee = new Espresso();
				completeOrder(primaryStage);
			});
			gridPane.add(espressoButton, 2, 4);
			
			//Create scene
			Scene scene = new Scene(gridPane, 400, 250);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Coffee Shop");
			primaryStage.show();
		}
		
		private void completeOrder(Stage primaryStage) {
			//Get user name
			String firstName = firstNameTextField.getText();
			String lastName = lastNameTextField.getText();
			customer = new Customer(firstName, lastName);
			
			//Check if user entered name
			if (firstName.isEmpty() || lastName.isEmpty()) {
				
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Error");
				alert.setHeaderText("Invalid Entry");
				alert.setContentText("Please enter a first and last name");
				alert.showAndWait();
				return;
			}
			
			
			//Create order
			double totalCost = coffee.getPrice();
			Order order = new Order(coffee, customer,totalCost);
			
			//Create order details
			GridPane orderDetailsPane = new GridPane();
			orderDetailsPane.setAlignment(Pos.CENTER);
			orderDetailsPane.setHgap(10);
			orderDetailsPane.setVgap(10);
			orderDetailsPane.setPadding(new Insets(25, 25, 25,25));
			
			//Add order details to pane
			Label orderLabel = new Label("Order Details:");
			orderLabel.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
			orderDetailsPane.add(orderLabel, 0, 0, 2, 1);
			
			Label orderIDLabel = new Label("Order ID:");
			orderDetailsPane.add(orderIDLabel, 0, 1);
			
			Label orderIDValueLabel = new Label(String.valueOf(order.getOrderID()));
			orderDetailsPane.add(orderIDValueLabel, 1, 1);
			
			Label customerLabel = new Label("Customer:");
			orderDetailsPane.add(customerLabel, 0, 2);
			
			Label customerValueLabel = new Label(customer.getFullName());
			orderDetailsPane.add(customerValueLabel, 1, 2);
			
			Label coffeeLabel = new Label("Coffee:");
			orderDetailsPane.add(coffeeLabel, 0, 3);
			
			Label coffeeValueLabel = new Label(coffee.getName());
			orderDetailsPane.add(coffeeValueLabel, 1, 3);
			
			Label totalCostLabel = new Label("Total Cost:");
			orderDetailsPane.add(totalCostLabel, 0, 4);
			
			Label totalCostValueLabel = new Label("$" + String.format("%.2f", order.getTotalCost()));
			orderDetailsPane.add(totalCostValueLabel, 1, 4);
			
			Scene orderDetailsScene = new Scene(orderDetailsPane, 400, 300);
			primaryStage.setScene(orderDetailsScene);
			primaryStage.show();
			}
		
			
		
	}
	