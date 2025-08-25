package services;

import entities.Employee;

public class SalaryService {

    // Inversão de controle
    private TaxService tax;
    private PensionService pension;

    // Injeção de dependência
    public SalaryService(TaxService tax, PensionService pension) {
        this.tax = tax;
        this.pension = pension;
    }

    public double netSalary(Employee employee) {
        return employee.getGrossSalary() - (tax.tax(employee.getGrossSalary()) + pension.discount(employee.getGrossSalary()));
    }
}
