package Ativ5;

public class OrderItem {
    private int quantity;
    private double price;
    private Product product;

    public OrderItem(int quantity, double price, Product product){
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public double subTotal(){
        price = quantity * product.getPrice();
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s, $%.2f, Quantity: %s, Subtotal: $%.2f", product.getName(), product.getPrice(), quantity, subTotal());
    }
}
