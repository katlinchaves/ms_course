package com.example.hr_payroll.services;

import org.springframework.stereotype.Service;

import com.example.hr_payroll.entities.Payment;

// registra a classe como componente do Spring Boot
@Service
public class PaymentService {

    // metodo para retornar o pagamento
    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 200.0, days);
    }

}
