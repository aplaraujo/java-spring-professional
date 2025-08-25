package com.example.spring_boot_net_salary.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot_net_salary.entities.Employee;

@Service
public class SalaryService {

    // Inversão de controle
    @Autowired
    private final TaxService tax;

    @Autowired
    private final PensionService pension;

    // Injeção de dependência
    public SalaryService(TaxService tax, PensionService pension) {
        this.tax = tax;
        this.pension = pension;
    }

    public double netSalary(Employee employee) {
        return employee.getGrossSalary() - (tax.tax(employee.getGrossSalary()) + pension.discount(employee.getGrossSalary()));
    }
}
