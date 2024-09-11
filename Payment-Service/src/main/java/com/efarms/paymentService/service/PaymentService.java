package com.efarms.paymentService.service;

import java.util.List;

import com.efarms.paymentService.entity.Payment;

public interface PaymentService {
	
	Payment processPayment(Payment payment);
    List<Payment> getPaymentsByOrder(Long orderId);
    Payment getPaymentById(Long id);

}
