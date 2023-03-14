package com.akhm.service;

import java.util.List;

import com.akhm.repository.enity.CategoryEntity;

public interface CategoryService {
	public Integer insertCategory(CategoryEntity Category);
	public List<CategoryEntity> getCategories();
	public CategoryEntity getCategory(Integer CategoryId);	
	public void updateCategory(CategoryEntity CategoryEntity); 
	public void deleteCategory(Integer categoryId);
	

}
