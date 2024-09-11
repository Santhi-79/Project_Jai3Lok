package com.efarms.recommendationService.service;

import java.util.List;

import com.efarms.recommendationService.entity.Recommendation;

public interface RecommendationService {
	
	Recommendation createRecommendation(Recommendation recommendation);
    Recommendation updateRecommendation(Long id, Recommendation recommendation);
    void deleteRecommendation(Long id);
    List<Recommendation> getRecommendationsByProduct(Long productId);
    List<Recommendation> getRecommendationsByUser(Long userId);
    Recommendation getRecommendationById(Long id);

}
