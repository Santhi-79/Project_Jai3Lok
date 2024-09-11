package com.efarms.RatingServices.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efarms.RatingServices.entity.Rating;
import com.efarms.RatingServices.service.RatingService;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {
	
	private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @PostMapping("/rate")
    public ResponseEntity<?> createRating(@RequestBody Rating userRating) {
        Rating createdRating = ratingService.createRating(userRating);
        return ResponseEntity.ok(createdRating);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUser(@PathVariable Long userId) {
        List<Rating> ratings = ratingService.getRatingsByUserId(userId);
        return ResponseEntity.ok(ratings);
    }

    @GetMapping("/rated/{ratedUserId}")
    public ResponseEntity<List<Rating>> getRatingsForUser(@PathVariable Long ratedUserId) {
        List<Rating> ratings = ratingService.getRatingsForUser(ratedUserId);
        return ResponseEntity.ok(ratings);
    }

    @GetMapping("/rated/{ratedUserId}/average")
    public ResponseEntity<Double> getAverageRating(@PathVariable Long ratedUserId) {
        Double averageRating = ratingService.getAverageRatingForUser(ratedUserId);
        return ResponseEntity.ok(averageRating);
    }
}
