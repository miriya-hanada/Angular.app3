package com.example.server.service;

import java.util.List;

import com.example.server.persistence.entity.Recipe;

public interface RecipeService {

    List<Recipe> findAll();

    List<Recipe> findID();

}
