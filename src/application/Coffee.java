package application;

public abstract class Coffee {
    private String name;
    private double price;

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    //Get customer name
    public String getName() {
        return name;
    }
    
    //Get coffee price
    public double getPrice() {
        return price;
    }

    //Set customer name
    public void setName(String name) {
        this.name = name;
    }

    //Set coffee price
    public void setPrice(double price) {
        this.price = price;
    }
}