package services;

import entities.Order;

public class OrderService {
    private Order order;

    public OrderService(Order order) {
        this.order = order;
    }

    public double total(Order order) {
        return order.getBasic() - (order.getBasic() * order.getDiscount()/100);
    }
}
