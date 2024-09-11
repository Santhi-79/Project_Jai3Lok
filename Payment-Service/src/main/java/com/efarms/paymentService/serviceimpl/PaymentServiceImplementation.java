package com.efarms.paymentService.serviceimpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efarms.paymentService.entity.Payment;
import com.efarms.paymentService.repository.PaymentRepository;
import com.efarms.paymentService.service.PaymentService;


@Service
public class PaymentServiceImplementation implements PaymentService{
	
	@Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment processPayment(Payment payment) {
        payment.setPaymentDate(LocalDateTime.now());
        payment.setPaymentStatus("SUCCESS");
        return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> getPaymentsByOrder(Long orderId) {
        return paymentRepository.findByOrderId(orderId);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }

}
