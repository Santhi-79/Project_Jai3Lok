package com.efarms.userService.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



	@Entity
	@Table(name = "payment_information")
	public class PaymentInformation {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "payment_method", nullable = false)
	    private String paymentMethod;

	    @Column(name = "amount", nullable = false)
	    private BigDecimal amount;

	    @Column(name = "currency", nullable = false)
	    private String currency;

	    @Column(name = "transaction_date", nullable = false)
	    private LocalDateTime transactionDate;

	    @Column(name = "status", nullable = false)
	    private String status;

	    @Column(name = "transaction_id", unique = true, nullable = false)
	    private String transactionId;

	    // Optional fields for additional information
	    @Column(name = "payment_gateway", nullable = true)
	    private String paymentGateway;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "user_id", nullable = false)
	    @JdbcTypeCode(SqlTypes.JSON)
	    private User user;  // Assuming you have a User entity

	    // Constructors
	    public PaymentInformation() {
	    }

	    public PaymentInformation(String paymentMethod, BigDecimal amount, String currency, LocalDateTime transactionDate, String status, String transactionId, User user) {
	        this.paymentMethod = paymentMethod;
	        this.amount = amount;
	        this.currency = currency;
	        this.transactionDate = transactionDate;
	        this.status = status;
	        this.transactionId = transactionId;
	        this.user = user;
	    }

	    // Getters and Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getPaymentMethod() {
	        return paymentMethod;
	    }

	    public void setPaymentMethod(String paymentMethod) {
	        this.paymentMethod = paymentMethod;
	    }

	    public BigDecimal getAmount() {
	        return amount;
	    }

	    public void setAmount(BigDecimal amount) {
	        this.amount = amount;
	    }

	    public String getCurrency() {
	        return currency;
	    }

	    public void setCurrency(String currency) {
	        this.currency = currency;
	    }

	    public LocalDateTime getTransactionDate() {
	        return transactionDate;
	    }

	    public void setTransactionDate(LocalDateTime transactionDate) {
	        this.transactionDate = transactionDate;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    public String getTransactionId() {
	        return transactionId;
	    }

	    public void setTransactionId(String transactionId) {
	        this.transactionId = transactionId;
	    }

	    public String getPaymentGateway() {
	        return paymentGateway;
	    }

	    public void setPaymentGateway(String paymentGateway) {
	        this.paymentGateway = paymentGateway;
	    }

	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }
	}
