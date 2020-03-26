package com.example.server.persistence.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.server.persistence.entity.Recipe;

@Mapper
public interface RecipeMapper {

    List<Recipe> findAll();

    List<Recipe> findID();

}
