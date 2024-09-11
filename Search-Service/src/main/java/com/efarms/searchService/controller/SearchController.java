package com.efarms.searchService.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.efarms.searchService.entity.Search;
import com.efarms.searchService.service.SearchService;

@RestController
@RequestMapping("/api/search")
public class SearchController {
	
	private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping
    public ResponseEntity<List<Search>> search(@RequestParam(value = "keyword", required = false) String keyword) {
        List<Search> items = searchService.searchItems(keyword);
        return ResponseEntity.ok(items);
    }

}
