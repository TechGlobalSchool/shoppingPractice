import java.util.Scanner;

public class Item {


    public static final String askName = "What is the name of the item you are looking for?";
    public static final String askAmount = "How many of this item would you like?";
    public static final String askPrice = "What is the price of this item?";

    public Item(String name, int sku, int amount, double price) {
        this.name = name;
        this.sku = sku;
        this.amount = amount;
        this.price = price;
    }

    public String name;
    public int sku; // generate a 7 digit random number and assign it
    public int amount;
    public double price;


    public static Item createItem() {

        String name = ScannerHelper.getString(askName);
        int sku = MathHelper.getARandomNumber(1_000_000, 9_999_999); // sku => 1_000_000 to 9_999_999
        int amount = ScannerHelper.getInt(askAmount);
        double price = ScannerHelper.getDouble(askPrice) * amount; // total item price (price * amount)

        return new Item(name, sku, amount, price);
    }


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", sku=" + sku +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(createItem());
    }
}
