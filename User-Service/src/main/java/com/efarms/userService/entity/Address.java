package com.efarms.userService.entity;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
		@Entity
		@Table(name = "address")
		public class Address {

		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long id;

		    @Column(name = "street")
		    private String street;

		    @Column(name = "city")
		    private String city;

		    @Column(name = "state")
		    private String state;

		    @Column(name = "zip_code")
		    private String zipCode;

		    @ManyToOne
		    @JoinColumn(name = "user_id")
		    @JdbcTypeCode(SqlTypes.JSON)
		    private User user;


		    // Constructors, Getters, and Setters
		    public Address() {}

		    public Long getId() {
		        return id;
		    }

		    public void setId(Long id) {
		        this.id = id;
		    }

		    public String getStreet() {
		        return street;
		    }

		    public void setStreet(String street) {
		        this.street = street;
		    }

		    public String getCity() {
		        return city;
		    }

		    public void setCity(String city) {
		        this.city = city;
		    }

		    public String getState() {
		        return state;
		    }

		    public void setState(String state) {
		        this.state = state;
		    }

		    public String getZipCode() {
		        return zipCode;
		    }

		    public void setZipCode(String zipCode) {
		        this.zipCode = zipCode;
		    }

		    public User getUser() {
		        return user;
		    }

		    public void setUser(User user) {
		        this.user = user;
		    }
		}
	



