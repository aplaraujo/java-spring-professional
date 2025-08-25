
import entities.Order;
import java.util.Locale;
import java.util.Scanner;
import services.OrderService;
import services.ShippingService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code;
        double value, discountPercent, total;

        code = sc.nextInt();
        value = sc.nextDouble();
        discountPercent = sc.nextDouble();

        Order order = new Order(code, value, discountPercent);
        OrderService orderService = new OrderService(order);
        ShippingService shippingService = new ShippingService(order, orderService);

        total = shippingService.shipment(order);

        System.out.println();
        System.out.println("Pedido codigo " + code);
        System.out.println("Valor total: R$ " + String.format("%.2f", total));

        sc.close();
    }
}
