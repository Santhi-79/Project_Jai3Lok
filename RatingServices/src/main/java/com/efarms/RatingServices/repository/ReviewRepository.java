package com.efarms.RatingServices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efarms.RatingServices.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{
	
	List<Review> findByProductId(Long productId);
    List<Review> findByUserId(Long userId);

}
