package com.efarms.searchService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.efarms.searchService.entity.Search;

public interface SearchRepository extends JpaRepository<Search, Long>{
	
	@Query("SELECT i FROM Item i WHERE LOWER(i.name) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
	           "OR LOWER(i.description) LIKE LOWER(CONCAT('%', :keyword, '%'))")
	    List<Search> searchByKeyword(@Param("keyword") String keyword);
}
