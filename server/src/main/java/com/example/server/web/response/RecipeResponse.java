package com.example.server.web.response;

import com.example.server.persistence.entity.Recipe;

public class RecipeResponse {

    private final Long id;

    private final String title;

    private final String material;

    private final String recipe;

    private final String image;

    public RecipeResponse(Recipe recipe) {
        this.id = recipe.getId();
        this.title = recipe.getTitle();
        this.material = recipe.getMaterial();
        this.recipe = recipe.getRecipe();
        this.image = recipe.getImage();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
    	return title;
    }

    public String getMaterial() {
        return material;
    }

    public String getRecipe() {
        return recipe;
    }

    public String getImage() {
        return image;
    }
}
