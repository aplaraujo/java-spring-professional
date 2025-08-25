
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code;
        double value, discountPercent, valueWithDiscount, total;

        code = sc.nextInt();
        value = sc.nextDouble();
        discountPercent = sc.nextDouble();

        valueWithDiscount = value - (value * discountPercent/100);

        if (valueWithDiscount < 100) {
            total = valueWithDiscount + 20.00;
        } else if(valueWithDiscount >= 100 && valueWithDiscount < 200) {
            total = valueWithDiscount + 12.00;
        } else {
            total = valueWithDiscount;
        }

        System.out.println();
        System.out.println("Pedido codigo " + code);
        System.out.println("Valor total: R$ " + String.format("%.2f", total));

        sc.close();
    }
}
