package com.example.spring_boot_net_salary.services;

import org.springframework.stereotype.Service;

@Service
public class PensionService {
    public double discount(double amount) {
        return amount * 0.10;
    }
}
