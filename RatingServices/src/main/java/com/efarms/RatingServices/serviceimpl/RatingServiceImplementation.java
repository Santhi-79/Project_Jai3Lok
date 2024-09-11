package com.efarms.RatingServices.serviceimpl;

import java.util.List;
import java.util.OptionalDouble;

import org.springframework.stereotype.Service;

import com.efarms.RatingServices.entity.Rating;
import com.efarms.RatingServices.repository.RatingRepository;
import com.efarms.RatingServices.service.RatingService;

@Service
public class RatingServiceImplementation implements RatingService{
	private final RatingRepository ratingRepository;

    public RatingServiceImplementation(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @Override
    public Rating createRating(Rating userRating) {
        return ratingRepository.save(userRating);
    }

    @Override
    public List<Rating> getRatingsByUserId(Long userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingsForUser(Long ratedUserId) {
        return ratingRepository.findByRatedUserId(ratedUserId);
    }

    @Override
    public Double getAverageRatingForUser(Long ratedUserId) {
        List<Rating> ratings = ratingRepository.findByRatedUserId(ratedUserId);
        OptionalDouble average = ratings.stream().mapToInt(Rating::getRating).average();
        return average.isPresent() ? average.getAsDouble() : null;
    }
}
