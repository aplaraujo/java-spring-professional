package services;

import entities.Employee;

public class SalaryService {
    TaxService tax = new TaxService();
    PensionService pension = new PensionService();

    public double netSalary(Employee employee) {
        return employee.getGrossSalary() - (tax.tax(employee.getGrossSalary()) + pension.discount(employee.getGrossSalary()));
    }
}
