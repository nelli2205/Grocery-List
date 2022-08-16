// This class keeps track of a grocery list of items

public class GroceryList {
    final static int size = 5; // constant length of grocery list
    private GroceryItemOrder[] items; // list of products
    private int numItems; // number of products

    public GroceryList() {
        numItems = 0; // initialize
        items = new GroceryItemOrder[size]; // create array of 5 spaces
    }

    public boolean add(GroceryItemOrder item) { // check if there is available space in array and adds items if so
        if (numItems < size) { // since array was size of 5, we create an if-stat to make sure there is
                               // available space
            items[numItems] = item;
            numItems++;
            return true;
        } else {
            return false; // means that there is no longer available space in array
        }
    }

    public double getTotalCost() { // returns the total cost of items
        double totalCost = 0;
        for (int i = 0; i < this.numItems; i++) {
            totalCost += this.items[i].getCost();
        }
        return totalCost;
    }

    public String toString() { // return a single string w/ all items
        for (int i = 0; i < numItems; i++) {
            System.out.println(this.items[i].toString());
        }
        return " ";

    }
}
