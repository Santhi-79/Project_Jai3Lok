package com.efarms.RatingServices.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efarms.RatingServices.entity.Review;
import com.efarms.RatingServices.repository.ReviewRepository;
import com.efarms.RatingServices.service.ReviewService;

@Service
public class ReviewServiceImplementation implements ReviewService{

	@Autowired
    private ReviewRepository reviewRepository;

    @Override
    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getReviewsByProductId(Long productId) {
        return reviewRepository.findByProductId(productId);
    }

    @Override
    public List<Review> getReviewsByUserId(Long userId) {
        return reviewRepository.findByUserId(userId);
    }

    @Override
    public void deleteReview(Long reviewId) {
        Optional<Review> review = reviewRepository.findById(reviewId);
        review.ifPresent(reviewRepository::delete);
    }
}
