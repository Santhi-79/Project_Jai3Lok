package com.efarms.recommendationService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efarms.recommendationService.entity.Recommendation;
import com.efarms.recommendationService.service.RecommendationService;

@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {
	
	@Autowired
    private RecommendationService recommendationService;

    @PostMapping
    public ResponseEntity<Recommendation> createRecommendation(@RequestBody Recommendation recommendation) {
        Recommendation newRecommendation = recommendationService.createRecommendation(recommendation);
        return ResponseEntity.ok(newRecommendation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recommendation> updateRecommendation(@PathVariable Long id, @RequestBody Recommendation recommendation) {
        Recommendation updatedRecommendation = recommendationService.updateRecommendation(id, recommendation);
        if (updatedRecommendation != null) {
            return ResponseEntity.ok(updatedRecommendation);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecommendation(@PathVariable Long id) {
        recommendationService.deleteRecommendation(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<Recommendation>> getRecommendationsByProduct(@PathVariable Long productId) {
        List<Recommendation> recommendations = recommendationService.getRecommendationsByProduct(productId);
        return ResponseEntity.ok(recommendations);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Recommendation>> getRecommendationsByUser(@PathVariable Long userId) {
        List<Recommendation> recommendations = recommendationService.getRecommendationsByUser(userId);
        return ResponseEntity.ok(recommendations);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recommendation> getRecommendationById(@PathVariable Long id) {
        Recommendation recommendation = recommendationService.getRecommendationById(id);
        if (recommendation != null) {
            return ResponseEntity.ok(recommendation);
        }
        return ResponseEntity.notFound().build();
    }
}