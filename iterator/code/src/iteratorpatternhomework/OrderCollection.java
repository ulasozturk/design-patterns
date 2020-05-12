package iteratorpatternhomework;

import java.util.ArrayList;

public class OrderCollection implements Collection {

    ArrayList<Order> orders = new ArrayList<>();

    public OrderCollection() {
        orders.add(new Order("Pizza", 20, 2, "Credit Card"));
        orders.add(new Order("Hamburger", 12, 3, "Cash"));
        orders.add(new Order("Kebab", 18, 1, "Credit Card"));
        orders.add(new Order("Lahmacun", 5, 2, "Cash"));
        orders.add(new Order("Tantuni", 14, 1, "Cash"));
        orders.add(new Order("İcli Kofte", 6, 3, "Credit Card"));
        orders.add(new Order("Kunefe", 10, 1, "Credit Card"));
        orders.add(new Order("Baklava", 15, 1, "Credit Card"));
        orders.add(new Order("Doner", 16, 1, "Cash"));
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void deleteOrder(int id) {
        orders.removeIf(order -> (order.getOrderId() == id));
    }

    @Override
    public Iterator createIterator() {
        return new OrderIterator(orders);
    }

}
