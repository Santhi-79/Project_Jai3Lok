package com.efarms.RatingServices.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ratings")
public class Rating {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId; // ID of the user giving the rating
    private Long ratedUserId; // ID of the user being rated
    private int rating; // Rating value (e.g., between 1 and 5)
    private String comment;
    private LocalDateTime ratingDate;

    public Rating() {}

    public Rating(Long userId, Long ratedUserId, int rating, String comment) {
        this.userId = userId;
        this.ratedUserId = ratedUserId;
        this.rating = rating;
        this.comment = comment;
        this.ratingDate = LocalDateTime.now();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRatedUserId() {
		return ratedUserId;
	}

	public void setRatedUserId(Long ratedUserId) {
		this.ratedUserId = ratedUserId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDateTime getRatingDate() {
		return ratingDate;
	}

	public void setRatingDate(LocalDateTime ratingDate) {
		this.ratingDate = ratingDate;
	}
    

}
