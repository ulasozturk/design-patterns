package iteratorpatternhomework;

import java.util.ArrayList;

public class OrderIterator implements Iterator {

    ArrayList<Order> orders;
    int index = 0;

    public OrderIterator(ArrayList<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean hasNext() {
        if (index < orders.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return orders.get(index++);
        }
        return null;
    }

}
