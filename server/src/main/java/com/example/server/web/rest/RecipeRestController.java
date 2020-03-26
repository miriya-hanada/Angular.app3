package com.example.server.web.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.server.service.RecipeService;
import com.example.server.web.response.RecipeResponse;

@RestController
@RequestMapping("/api/recipes")
public class RecipeRestController {

    private final RecipeService recipeService;

    public RecipeRestController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public List<RecipeResponse> findAll() {
        return this.recipeService.findAll().stream().map(recipe -> new RecipeResponse(recipe)).collect(Collectors.toList());
    }
    @GetMapping("/api/recipes/{id}")
    public List<RecipeResponse> findID() {
    	System.out.println("ああああ");
    	return this.recipeService.findID().stream().map(recipe -> new RecipeResponse(recipe)).collect(Collectors.toList());
    }
}
