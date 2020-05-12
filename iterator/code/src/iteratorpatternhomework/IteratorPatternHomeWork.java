package iteratorpatternhomework;

public class IteratorPatternHomeWork {

    public static void main(String[] args) {
        OrderCollection orderCollection = new OrderCollection();
        orderCollection.addOrder(new Order("Gozleme", 12, 2, "Credit Card"));
        orderCollection.deleteOrder(8);
        Iterator iter = orderCollection.createIterator();
        while (iter.hasNext())
        {
            Order order = (Order) iter.next();
            System.out.println("OrderId: " + order.getOrderId()
                    + "\nOrderItem: " + order.getOrderItem()
                    + "\nOrderPrice: " + order.getOrderPrice()
                    + "\nOrderQuantity: " + order.getOrderQuantity()
                    + "\nOrderPaymentMethod: " + order.getPaymentMethod());
            if (iter.hasNext()) {
                System.out.println("-----------");
            }
        }
    }
}
