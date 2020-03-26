package com.example.server.persistence.entity;

public class Recipe {
	private Long id;

	private String title;

    private String material;

    private String recipe;

    private String image;

    public Long getId() {
		return id;
	}

    public String getTitle() {
    	return title;
    }

    public void setTitle(String title) {
    	this.title = title;
    }

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
 }
