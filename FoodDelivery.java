import java.util.*;

interface IDiscountable {
    double ApplyDiscount();
    void GetDiscountDetails();
}

abstract class FoodItem {
    String itemName;
    double price;
    int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    abstract double CalculateTotalPrice();
    
    void GetItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

class VegItem extends FoodItem implements IDiscountable {

    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double CalculateTotalPrice() {
        return price * quantity;
    }

    @Override
    public double ApplyDiscount() {
        double total = CalculateTotalPrice();
        return total - (total * 0.10);
    }

    @Override
    public void GetDiscountDetails() {
        System.out.println("Veg Item Discount: 10%");
    }
}

class NonVegItem extends FoodItem implements IDiscountable {
    
    NonVegItem(String itemName, double price, int quantity) {
        super(itemName,price,quantity);
    }
    
    @Override
    public double CalculateTotalPrice() {
        return price * quantity;
       
    }

    @Override
    public double ApplyDiscount() {
        double total = CalculateTotalPrice();
        return total - (total * 0.05);
    }

    @Override
    public void GetDiscountDetails() {
        System.out.println("Non-Veg Item Discount: 5%");
    }
}

public class FoodDelivery{
    public static void main(String[] args) {

        FoodItem item1 = new VegItem("Pizza", 200, 2);
        FoodItem item2 = new NonVegItem("Chicken", 150, 3);


        item1.GetItemDetails();
        System.out.println("Final Price: " + ((IDiscountable) item1).ApplyDiscount());

        System.out.println();

        item2.GetItemDetails();
        System.out.println("Final Price: " + ((IDiscountable) item2).ApplyDiscount());
    }
}

