import entities.Employee;
import java.util.Locale;
import java.util.Scanner;
import services.SalaryService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SalaryService salary = new SalaryService();

        String name;
        double grossSalary, netSalary;

        System.out.print("Nome: ");
        name = sc.nextLine();
        System.out.print("Salario bruto: ");
        grossSalary = sc.nextDouble();
        Employee emp = new Employee(name, grossSalary);

        netSalary = salary.netSalary(emp);

        System.out.printf("Salario liquido = %.2f", netSalary);
        
        sc.close();
    }
}
