package com.efarms.RatingServices.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efarms.RatingServices.entity.Rating;


public interface RatingRepository extends JpaRepository<Rating, Long>{
	
	List<Rating> findByRatedUserId(Long ratedUserId);
    List<Rating> findByUserId(Long userId);

}
