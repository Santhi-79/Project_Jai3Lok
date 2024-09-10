package com.efarms.userService.entity;

import java.time.LocalDateTime;

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
	@Table(name = "review")
	public class Review {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 @Column(name = "reviewText")
	private String reviewText;
	 
	 @Column(name = "rating") 
	private int rating;
	 @Column(name = "reviewDate")
	private LocalDateTime reviewDate;

	  @ManyToOne
	    @JoinColumn(name = "user_id")
	    @JdbcTypeCode(SqlTypes.JSON)
	    private User user;

	public Review() {

	}

	public Review(Long id, String reviewText, int rating, LocalDateTime reviewDate, User user) {
	super();
	this.id = id;
	this.reviewText = reviewText;
	this.rating = rating;
	this.reviewDate = reviewDate;
	this.user = user;
	}

	public Long getId() {
	return id;
	}

	public void setId(Long id) {
	this.id = id;
	}

	public String getReviewText() {
	return reviewText;
	}

	public void setReviewText(String reviewText) {
	this.reviewText = reviewText;
	}

	public int getRating() {
	return rating;
	}

	public void setRating(int rating) {
	this.rating = rating;
	}

	public LocalDateTime getReviewDate() {
	return reviewDate;
	}

	public void setReviewDate(LocalDateTime reviewDate) {
	this.reviewDate = reviewDate;
	}

	public User getUser() {
	return user;
	}

	public void setUser(User user) {
	this.user = user;
	}

	}

