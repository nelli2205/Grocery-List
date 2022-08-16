// This class stores information about a single grocery item being ordered.
// Nelli Antonyan
// BIT 142 SPRING 2022
// 06.03.2022
public class GroceryItemOrder {
    private String name; // assigned variables to correct data type
    private int quantity;
    private double pricePerUnit;

    public GroceryItemOrder(String name, int quantity, double pricePerUnit) { // constructor
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public void setQuantity(int quantity) { // changes the quantity
        this.quantity = quantity;
    }

    public double getCost() { // returns the total cost
        double totalCost;
        totalCost = quantity * pricePerUnit; // used formula to find the cost for each item
        return totalCost;
    }

    public String toString() { // returns a String representation of what the iteam and the quantity of this
                               // item were
        return (quantity + " of " + name);
    }

}
