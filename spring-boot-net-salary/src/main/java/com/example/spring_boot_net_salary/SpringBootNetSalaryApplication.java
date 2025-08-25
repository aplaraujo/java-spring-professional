package com.example.spring_boot_net_salary;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.spring_boot_net_salary.entities.Employee;
import com.example.spring_boot_net_salary.services.SalaryService;

@SpringBootApplication
@ComponentScan({"com.exemplo"})
public class SpringBootNetSalaryApplication implements CommandLineRunner {

	// Dependência
	@Autowired
	private SalaryService salaryService;

	// Construtor
	// public SpringBootNetSalaryApplication(SalaryService salaryService) {
	// 	this.salaryService = salaryService;
	// }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNetSalaryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Employee emp = new Employee("Maria", 4000.00);
		System.out.println();
		System.out.printf("Salario liquido = %.2f", salaryService.netSalary(emp));
	}

}
