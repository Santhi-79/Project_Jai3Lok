package com.efarms.RatingServices.service;

import java.util.List;

import com.efarms.RatingServices.entity.Rating;

public interface RatingService {
	Rating createRating(Rating userRating);
    List<Rating> getRatingsByUserId(Long userId);
    List<Rating> getRatingsForUser(Long ratedUserId);
    Double getAverageRatingForUser(Long ratedUserId);

}
