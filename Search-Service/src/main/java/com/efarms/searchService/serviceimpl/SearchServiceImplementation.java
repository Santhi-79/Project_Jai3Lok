package com.efarms.searchService.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.efarms.searchService.entity.Search;
import com.efarms.searchService.repository.SearchRepository;
import com.efarms.searchService.service.SearchService;

@Service
public class SearchServiceImplementation implements SearchService{
	
	
	  private final SearchRepository searchRepository;
	  
	  public SearchServiceImplementation(SearchRepository searchRepository) {
	  this.searchRepository = searchRepository; 
	  }
	  
	  @Override 
	  public List<Search> searchItems(String keyword) { 
		  if (keyword == null || keyword.trim().isEmpty()) { 
		  return searchRepository.findAll(); 
		  } 
	  return searchRepository.searchByKeyword(keyword); 
	  
	  }
	 

}
