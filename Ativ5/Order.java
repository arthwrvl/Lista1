package Ativ5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Date moment;
    private OrderStatus status;
    private ArrayList<OrderItem> items;
    private Client client;

    public Order(Date moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
        items = new ArrayList<OrderItem>();
    }

    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }
    public double total(){
        double priceTotal = 0;
        for (int i = 0; i < items.size(); i++){
            priceTotal += items.get(i).subTotal();
        }
        return priceTotal;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String itemsStr = "";
        for (int i = 0; i < items.size(); i++){
            itemsStr += items.get(i);
        }
        return String.format("Order moment: %s\nOrder status: %s\nClient: %s\nOrder items:\n%s\nTotal price: $%.2f\n", sdf.format(moment), status, client, itemsStr, total());
    }
}
