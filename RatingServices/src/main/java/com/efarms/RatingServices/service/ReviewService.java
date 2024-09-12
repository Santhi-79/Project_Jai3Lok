package com.efarms.RatingServices.service;

import java.util.List;

import com.efarms.RatingServices.entity.Review;

public interface ReviewService {
	
	Review addReview(Review review);
    List<Review> getReviewsByProductId(Long productId);
    List<Review> getReviewsByUserId(Long userId);
    void deleteReview(Long reviewId);

}
