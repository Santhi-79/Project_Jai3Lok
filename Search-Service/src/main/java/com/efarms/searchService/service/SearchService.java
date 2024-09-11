package com.efarms.searchService.service;

import java.util.List;

import com.efarms.searchService.entity.Search;

public interface SearchService {

	List<Search> searchItems(String keyword);
}
