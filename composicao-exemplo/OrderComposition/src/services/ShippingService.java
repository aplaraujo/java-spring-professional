package services;

import entities.Order;

public class ShippingService {
    private Order order;
    private OrderService orderService;

    public ShippingService(Order order, OrderService orderService) {
        this.order = order;
        this.orderService = orderService;
    }

    public double shipment(Order order) {
        double total, totalWithDiscount;
        total = orderService.total(order);
        if (total < 100) {
            totalWithDiscount = total + 20.00;
        } else if (total >= 100 && total < 200) {
            totalWithDiscount = total + 12.00;
        } else {
            totalWithDiscount = total;
        }
        return totalWithDiscount;
    }
}
