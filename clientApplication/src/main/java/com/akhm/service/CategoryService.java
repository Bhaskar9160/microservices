package com.akhm.service;

import java.util.List;

import com.akhm.service.dto.CategoryDTO;

public interface CategoryService {
	public Integer insertCategory(CategoryDTO CategoryDTO);

	public List<CategoryDTO> getCategories();

	public CategoryDTO getCategory(Integer CategoryId);

	public void updateCategory(CategoryDTO CategoryDTO);
	public void deleteCategory(Integer categoryId);

}
