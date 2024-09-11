package com.efarms.recommendationService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efarms.recommendationService.entity.Recommendation;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long>{
	
	List<Recommendation> findByProductId(Long productId);
    List<Recommendation> findByUserId(Long userId);

}
