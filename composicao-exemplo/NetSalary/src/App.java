import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        double grossSalary, netSalary;

        System.out.print("Nome: ");
        name = sc.nextLine();
        System.out.print("Salario bruto: ");
        grossSalary = sc.nextDouble();

        netSalary = grossSalary - (grossSalary * 0.30);

        System.out.println();
        System.out.println("Salario liquido: " + String.format("%.2f", netSalary));
        sc.close();
    }
}
