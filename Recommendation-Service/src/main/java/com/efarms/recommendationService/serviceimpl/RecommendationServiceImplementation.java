package com.efarms.recommendationService.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efarms.recommendationService.entity.Recommendation;
import com.efarms.recommendationService.repository.RecommendationRepository;
import com.efarms.recommendationService.service.RecommendationService;

@Service
public class RecommendationServiceImplementation implements RecommendationService{
	
	@Autowired
    private RecommendationRepository recommendationRepository;

    @Override
    public Recommendation createRecommendation(Recommendation recommendation) {
        return recommendationRepository.save(recommendation);
    }

    @Override
    public Recommendation updateRecommendation(Long id, Recommendation recommendation) {
        Optional<Recommendation> existingRecommendation = recommendationRepository.findById(id);
        if (existingRecommendation.isPresent()) {
            Recommendation updatedRecommendation = existingRecommendation.get();
            updatedRecommendation.setProductId(recommendation.getProductId());
            updatedRecommendation.setUserId(recommendation.getUserId());
            updatedRecommendation.setRecommendationText(recommendation.getRecommendationText());
            updatedRecommendation.setRating(recommendation.getRating());
            return recommendationRepository.save(updatedRecommendation);
        }
        return null;
    }

    @Override
    public void deleteRecommendation(Long id) {
        recommendationRepository.deleteById(id);
    }

    @Override
    public List<Recommendation> getRecommendationsByProduct(Long productId) {
        return recommendationRepository.findByProductId(productId);
    }

    @Override
    public List<Recommendation> getRecommendationsByUser(Long userId) {
        return recommendationRepository.findByUserId(userId);
    }

    @Override
    public Recommendation getRecommendationById(Long id) {
        return recommendationRepository.findById(id).orElse(null);
    }
}