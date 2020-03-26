package com.example.server.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.server.persistence.entity.Recipe;
import com.example.server.persistence.mapper.RecipeMapper;
import com.example.server.service.RecipeService;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeMapper recipeMapper;

    public RecipeServiceImpl(RecipeMapper recipeMapper) {
        this.recipeMapper = recipeMapper;
    }

    @Override
    public List<Recipe> findAll() {
        return this.recipeMapper.findAll();
    }

    @Override
    public List<Recipe> findID() {
    	return this.recipeMapper.findID();
    }
}
