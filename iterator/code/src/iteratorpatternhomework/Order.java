package iteratorpatternhomework;

public class Order {

    private static int nextOrderId = 1;
    private int orderId;
    private String orderItem;
    private int orderPrice;
    private int orderQuantity;
    private String paymentMethod;

    public Order(String orderItem, int orderPrice, int orderQuantity, String paymentMethod) {
        this.orderId = nextOrderId++;
        this.orderItem = orderItem;
        this.orderPrice = orderPrice;
        this.orderQuantity = orderQuantity;
        this.paymentMethod = paymentMethod;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

}
